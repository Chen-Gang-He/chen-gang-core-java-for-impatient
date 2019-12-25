package chengang.com.chapter6;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Ex19 {

    public static <T> ArrayList<T> repeat(int n, T obj) {

        ArrayList<T> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            results.add(obj);
        }
        return results;
    }

    public static void main(String[] args) {
        ArrayList<Integer> results = repeat(10, 1);
        Object[] resultArray = results.toArray();
        // Runtime Error java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
        // Because toArrays returns Object[]
        // Integer[] resultsArray = (Integer[]) resultArray;

    }

}
