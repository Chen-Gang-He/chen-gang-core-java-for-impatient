package chengang.com.chapter7;

/*
Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers ≤ n. Add all numbers from 2 to n to a
set. Then repeatedly find the smallest element s in the set, and remove s2, s · (s + 1), s · (s + 2), and so on. You are
done when s2 > n. Do this with both a HashSet<Integer> and a BitSet.
 */

import java.util.*;

public class Ex1 {
    static Set<Integer> sieveWithHash(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("input must be greater than 1;");
        }
        Set<Integer> result = new HashSet<>();

        System.out.println("Initialize result ...");
        for (int i = 2; i <= n; i++) {
            result.add(i);
        }

        System.out.println("Starting working ..");
        for (int s = 2; s < Math.sqrt(n); s++) {
            System.out.println(String.format("Start from s number=[%1$d]", s));
            for (int removeNumber = s * s, k = 0; removeNumber <= n; k++, removeNumber = s * (s + k)) {
                System.out.println(String.format("s=[%1$d], k=[%2$d], removeNumber=[%3$d]", s, k, removeNumber));
                result.remove(removeNumber);
                System.out.println(String.format("The number=[%d] was removed!!!", removeNumber));
            }
        }
        return result;
    }

    static Set<Integer> sieveBitSet(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("input must be greater than 1;");
        }

        System.out.println("Initialize result ...");
        BitSet resultBitSet = new BitSet(n);
        for (int i = 0; i < n; i++) {
            resultBitSet.set(i, true);
        }

        System.out.println("Starting working ..");
        for (int s = 2; s < Math.sqrt(n); s++) {
            System.out.println(String.format("Start from s number=[%1$d]", s));
            for (int removeNumber = s * s, k = 0; removeNumber <= n; k++, removeNumber = s * (s + k)) {
                System.out.println(String.format("s=[%1$d], k=[%2$d], removeNumber=[%3$d]", s, k, removeNumber));
                resultBitSet.set(removeNumber, false);
                System.out.println(String.format("The number=[%d] was removed!!!", removeNumber));

            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (resultBitSet.get(i)) {
                result.add(i);
            }
        }
        return new HashSet<>(result);

    }

    public static void main(String[] args) {
        System.out.println(Ex1.sieveWithHash(100));
        // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
        // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
        System.out.println(Ex1.sieveBitSet(100));
        // [2, 3, 67, 5, 7, 71, 73, 11, 13, 79, 17, 19, 83, 23, 89, 29, 31, 97, 37, 41, 43, 47, 53, 59, 61]

    }
}
