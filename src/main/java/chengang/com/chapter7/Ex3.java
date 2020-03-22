package chengang.com.chapter7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    static <E> Set<E> union(Set<E> first, Set<E> second) {
        int firstSize = first == null ? 16 : first.size();
        int secondSize = second == null ? 16 : second.size();
        Set<E> result = new HashSet<>((firstSize + secondSize) * 4 / 3 + 1);
        if (first != null) {
            result.addAll(first);
        }
        if (second != null) {
            result.addAll(second);
        }
        return result;
    }

    static <E> Set<E> intersection(Set<E> first, Set<E> second) {
        int firstSize = first == null ? 16 : first.size();
        int secondSize = second == null ? 16 : second.size();
        Set<E> results = new HashSet<> ((Integer.max(firstSize, secondSize) * 4 / 3 + 1));
        if (first == null || second == null) {
            return results;
        }
        // 2nd approach using Set's other method
        // results.addAll(first);
        // results.retainAll(second);
        for (E e: first) {
            if (second.contains(e)) {
                results.add(e);
            }
        }
        return results;

    }

    static <E> Set<E> difference(Set<E> first, Set<E> second) {
        int firstSize = first == null ? 16 : first.size();
        HashSet<E> results = new HashSet<>(firstSize * 4 / 3 + 1);
        if (first == null) {
            return results;
        }
        // results.addAll(first);
        // if (second != null) {
        //     results.removeAll(second);
        // }
        // return results;
        if (second == null) {
            results.addAll(first);
        } else {
            for (E e: first) {
                if (!second.contains(e)) {
                    results.add(e);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Set<String> first = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> second = new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println(union(first, second));
        System.out.println(union(first, null));
        System.out.println(intersection(first, second));
        System.out.println(intersection(first, null));
        System.out.println(difference(first, second));
        System.out.println(difference(first, null));
        System.out.println(difference(first, null));

    }
}



