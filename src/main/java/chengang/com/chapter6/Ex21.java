package chengang.com.chapter6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex21 {
    @SafeVarargs public static <T> T[] construct(int size, T... emptyValue) {
        return Collections.nCopies(size, null).toArray(emptyValue);
    }

    @SafeVarargs static <T> T[] constructNew(int size, T... emptyValues) {
        @SuppressWarnings("unchecked") T[] results = (T[]) java.lang.reflect
                .Array.newInstance(emptyValues[0].getClass(), size);
        for (int i = 0; i < size; i++) {
            results[i] = emptyValues[0];
        }
        return results;
    }


    public static void main(String[] args) {
        String[] words = construct(10, "chengang");
        List<String>[] wordList = Ex21.<List<String>>construct(10, Arrays.asList("chengang"));
        System.out.println(String.format("construct results: %s", Arrays.toString(words)));
        System.out.println(String.format("construct results: %s", Arrays.toString(wordList)));

        String[] words2 = constructNew(10, "chengang");
        List<String>[] wordList2 = Ex21.<List<String>>constructNew(10, Arrays.asList("chengang"));
        System.out.println(String.format("construct results: %s", Arrays.toString(words2)));
        System.out.println(String.format("construct results: %s", Arrays.toString(wordList2)));

    }
}
