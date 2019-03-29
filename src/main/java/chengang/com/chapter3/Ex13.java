package chengang.com.chapter3;


import java.util.stream.Stream;

/*
Write a method that takes an array of Runnable instances and returns a Runnable whose run method executes them in order.
Return a lambda expression.
 */
public class Ex13 {

    static Runnable runInOrder(Runnable[] tasks) {
        return  () -> Stream.of(tasks).forEach(Runnable::run);

    }

    public static void main(String[] args) {
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("task1");
            }
        };

        Runnable task2 = () -> {
            System.out.println("task2");
        };

        Ex13.runInOrder(new Runnable[]{task1, task2}).run();

    }
}
