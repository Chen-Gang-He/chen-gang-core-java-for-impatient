package chengang.com.chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Ex8 {
    private int count = 0;
    static AutoCloseableReentrantLock lock() {
        AutoCloseableReentrantLock reentrantLock = new AutoCloseableReentrantLock();
        reentrantLock.lock();
        return reentrantLock;
    }

    public static class AutoCloseableReentrantLock extends ReentrantLock implements AutoCloseable {
        @Override
        public void close() {
            this.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException{
        Ex8 ex8 = new Ex8();
        final int[] counts = {0};

        ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorCompletionService service = new ExecutorCompletionService(executor);
        List<Callable<Integer>> tasks = new ArrayList<>();
        try (AutoCloseableReentrantLock lock = lock()) {
            for (int k = 0; k < 100; k ++) {
                int taskNum = k;
                executor.submit(() -> {
                    lock.lock();
                    try {
                        for (int i = 0; i < 100; i ++) {
                            counts[0] += 1;
                            System.out.println(String.format("Task %d, count %d", taskNum, counts[0]));
                        }
                        return counts[0];
                    } finally {
                        lock.close();
                    }
                });
            }
//            executor.invokeAll(tasks);
        }

        for (int i = 0; i < 100; i ++) {
            service.take().get();
        }
        System.out.println("Finish !!");
        System.out.println(String.format("Count: %d", counts[0]));
    }

}
