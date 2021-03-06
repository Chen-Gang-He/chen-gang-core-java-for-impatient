package chengang.com.chapter7;

import java.util.Iterator;
import java.util.function.IntFunction;

class NestedIterator implements Iterator<Integer> {
    private Integer current = 0;
    private IntFunction<Integer> intFunction;
    private int bound;
    NestedIterator(IntFunction<Integer> intFunction, int n) {
        this.intFunction = intFunction;
        this.bound = n;
    }


    @Override
    public boolean hasNext() {
        return current < bound;
    }

    @Override
    public Integer next() {
        current = intFunction.apply(current);
        return current;
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
}


public class Ex15 {
    static Iterator<Integer> immutableGenerator(IntFunction<Integer> intFunction, int n) {
        return new NestedIterator(intFunction, n);
    }

    public static void main(String[] args) {
        NestedIterator integerIterator = (NestedIterator) immutableGenerator(i -> i + 1, 10);
        while (integerIterator.hasNext()) {
            System.out.println(String.format("number: %d", integerIterator.next()));
        }
    }
}
