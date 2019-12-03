package chengang.com.chapter6;

import java.util.Arrays;

public class Ex5 {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args) {
//        Double[] result1 = Ex5.swap(1, 2, 1.2, 2.3, 1);
        // Required Double[] but swap was referred to T[]: no instance of type variables exist so that Integer conforms to Double.
//        Double[] result = Ex5.<Double>swap(1, 2, 1.2, 2.3, 1); // Value should be Double
        Double[] result = Ex5.<Double>swap(1, 2, 1.2, 2.3, 1D);
        System.out.println(Arrays.toString(result));
    }

}
