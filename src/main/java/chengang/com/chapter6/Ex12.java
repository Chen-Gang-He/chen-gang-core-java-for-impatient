package chengang.com.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex12 {
    static <T> void minMax(List<T> elements, Comparator<? super T> comparator, List<? super T> results) {
        if (elements != null) {
            T min, max;
            min = max = elements.get(0);
            for (T e: elements) {
                if (comparator.compare(e, min) < 0) {
                    min = e;
                }
                if (comparator.compare(e, max) > 0) {
                    max = e;
                }
            }
            results.addAll(Arrays.asList(min, max));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> results = new ArrayList<>();
        minMax(new ArrayList<>(Arrays.asList("xxxxx", "y", "uu")), Comparator.comparing(String::length), results);
        System.out.println(results);
//        minMax(new ArrayList<>(Arrays.asList("xxx", "y")), (x, y) -> Integer.compare(x.length(), y.length()), results);

    }

}
