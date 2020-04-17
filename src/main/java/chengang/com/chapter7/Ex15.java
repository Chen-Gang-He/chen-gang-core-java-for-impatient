package chengang.com.chapter7;

import java.util.Iterator;
import java.util.function.IntFunction;

public class Ex15 {
    static Iterator<Integer> immutableGenerator(IntFunction<Integer> intFunction, int n) {
        return new Iterator<Integer>() {
            private int current;
            @Override
            public boolean hasNext() {
                return current < n;
            }

            @Override
            public Integer next() {
                current = intFunction.apply(current);
                return current;
            }
        };
    }

    public static void main(String[] args) {
        Iterator<Integer> integerIterator = immutableGenerator(i -> i + 1, 10);
        while (integerIterator.hasNext()) {
            System.out.println(String.format("number: %d", integerIterator.next()));
        }
    }
}
