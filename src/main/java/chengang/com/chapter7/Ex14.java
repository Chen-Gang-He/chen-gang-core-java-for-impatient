package chengang.com.chapter7;

import java.util.Iterator;

public class Ex14 {
    static Iterator<Integer> immutableGenerator(int n) {
        return new Iterator<Integer>() {
            private int current;
            @Override
            public boolean hasNext() {
                return current < n;
            }

            @Override
            public Integer next() {
                return ++current;
            }
        };
    }

    public static void main(String[] args) {
        Iterator<Integer> integerIterator = immutableGenerator(10);
        while (integerIterator.hasNext()) {
            System.out.println(String.format("number: %d", integerIterator.next()));
        }
    }
}
