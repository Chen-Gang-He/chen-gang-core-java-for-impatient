package chengang.com.chapter6;

public class Ex10Ex11 {
    static <E extends Comparable<? super E>> E min(E[] array) {
        if (array == null) return null;
        E minValue = array[0];
        for (E e : array) {
            if (e.compareTo(minValue) < 0) {
                minValue = e;
            }
        }
        return minValue;
    }

    static <E extends Comparable<? super E>> E max(E[] array) {
        if (array == null) return null;
        E maxValue = array[0];
        for (E a: array) {
            if (a.compareTo(maxValue) > 0) {
                maxValue = a;
            }
        }
        return maxValue;
    }

    static <E extends Comparable<? super E>> Pair<E> minMax(E[] array) {
        return new Pair<>(min(array), max(array));
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, -3, 12, 2};
        System.out.println(String.format("max: %d, min: %d", max(numbers), min(numbers)));
//        Entry<Integer, Integer> entry1 = new Entry<>(3, 4);
//        Entry<Integer, Integer> entry2 = new Entry<>(3, 5);
//        @SuppressWarnings("unchecked") Entry<Integer, Integer>[] entries = (Entry<Integer, Integer>[]) new Entry<?, ?>[2];
//        entries[0] = entry1;
//        entries[1] = entry2;
        System.out.println(String.format("minMax pair: %s", minMax(numbers).toString()));
    }
}
