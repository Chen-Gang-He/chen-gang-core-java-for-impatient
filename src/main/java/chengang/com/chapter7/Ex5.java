package chengang.com.chapter7;

import java.util.*;

public class Ex5 {
    private static <E> void randomAccessSwap(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    private static <E> void sequentialAccessSwap(List<E> list, int i, int j) {
        ListIterator<E> iterator = list.listIterator(i);
        int index = 0;
        E first = iterator.next();
        System.out.println(first);
        for (int m = i + 1; m < j; m++) {
            iterator.next();
        }
        E second = iterator.next();
        System.out.println(second);
        iterator.set(first);
        for (int m = j; m >= i; m--) {
            iterator.previous();
        }
        iterator.set(second);
        System.out.println(String.format("after swap: %s", list));
    }

    private static <E> void swap(List<E> list, int i, int j) {
        if (i >= list.size() || i < 0 || j < 0 || j > list.size() || i >= j) {
            throw new IllegalArgumentException(String.format("invalid argument: [i=%d, j=%d]", i, j));
        }
        if (list instanceof RandomAccess) {
            randomAccessSwap(list, i, j);
        } else {
            sequentialAccessSwap(list, i, j);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(String.format("before swap: %s", linkedList));
        swap(linkedList, 2, 4);
        System.out.println(String.format("after swap: %s", linkedList));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(String.format("before swap: %s", arrayList));
        swap(arrayList, 2, 4);
        System.out.println(String.format("after swap: %s", arrayList));

    }
}
