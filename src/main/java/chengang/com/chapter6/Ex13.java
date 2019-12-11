package chengang.com.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static chengang.com.chapter6.Ex12.minMax;

public class Ex13 {
    static <T> void swapHelper(ArrayList<T> elements, int i, int j) {
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }
    static <T> void maxMin(List<T> elements, Comparator<? super T> comparator, List<? super T> results) {
        minMax(elements, comparator, results);
        // ? super T can not be caught by T
        Ex13.<T>swapHelper((ArrayList<T>) results, 0, results.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<String> results = new ArrayList<>();
        maxMin(new ArrayList<>(Arrays.asList("xxxxx", "y", "uu")), Comparator.comparing(String::length), results);
        System.out.println(results);
//        minMax(new ArrayList<>(Arrays.asList("xxx", "y")), (x, y) -> Integer.compare(x.length(), y.length()), results);

    }

}
