package chengang.com.chapter6;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Ex15 {
    static <R, E> R[] apply(E[] array, Function<E, R> function, Class<R> cls) {
        if (array == null) return null;
        @SuppressWarnings("unchecked") R[] results = (R[]) java.lang.reflect.Array.newInstance(cls, array.length);
        for (int i = 0; i < results.length; i++) {
            results[i] = function.apply(array[i]);
        }
        return results;
    }

    static <R, E> R[] apply2(E[] array, Function<E, R> function, IntFunction<R[]> constr) {
        if (array == null) return null;
        R[] results = constr.apply(array.length);
        for (int i = 0; i < results.length; i++) {
            results[i] = function.apply(array[i]);
        }
        return results;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "peach"};
        Integer[] results = apply(words, String::length, Integer.class);
        System.out.println(String.format("input: [%s], output=[%s]", Arrays.toString(words), Arrays.toString(results)));
        Integer[] results2 = apply2(words, String::length, Integer[]::new);
         System.out.println(String.format("input: [%s], output=[%s]", Arrays.toString(words), Arrays.toString(results2)));

    }


}
