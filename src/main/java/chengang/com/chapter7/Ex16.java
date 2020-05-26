package chengang.com.chapter7;

import java.util.Iterator;
import java.util.function.IntFunction;

class CachedIterator implements Iterator<Integer> {
    private Integer current = 0;
    private IntFunction<Integer> intFunction;
    private int bound;
    private Integer[] results;
    private int index;

    CachedIterator(IntFunction<Integer> intFunction, int n) {
        this.intFunction = intFunction;
        this.bound = n;
        this.results = new Integer[bound];
    }

    @Override
    public boolean hasNext() {
        return current < bound;
    }

    @Override
    public Integer next() {
        current = intFunction.apply(current);
        results[index++] = current;
        return current;
    }

    public Integer get(int n) {
        return results[n];
    }


    public int size() {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
}
public class Ex16 {
    static Iterator<Integer> immutableGenerator(IntFunction<Integer> intFunction, int n) {
        return new CachedIterator(intFunction, n);
    }

    public static void main(String[] args) {
        CachedIterator integerIterator = (CachedIterator) immutableGenerator(i -> i + 1, 10);
        while (integerIterator.hasNext()) {
            System.out.println(String.format("number: %d", integerIterator.next()));
        }

        System.out.println(integerIterator.get(9));
    }

}
