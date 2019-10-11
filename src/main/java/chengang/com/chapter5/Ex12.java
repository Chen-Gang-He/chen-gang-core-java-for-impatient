package chengang.com.chapter5;

import java.math.BigInteger;
import java.util.Arrays;

public class Ex12 {
    private boolean belong(int n, int[] values) {
        return Arrays.stream(values).anyMatch(i -> i == n);
    }
    int min(int[] values) {
        int minValue = Integer.MAX_VALUE;
        for (int i: values) {
            if (i < minValue) {
                minValue = i;
            }
        }
        assert belong(minValue, values);
        return minValue;
    }

    int minNoAssert(int[] values) {
        int minValue = Integer.MAX_VALUE;
        for (int i: values) {
            if (i < minValue) {
                minValue = i;
            }
        }
//        assert belong(minValue, values);
        return minValue;
    }
    public static void main(String[] args) {
        int[] values = new int[100000000];
        Arrays.fill(values, 100);
        long startTime1 = System.currentTimeMillis();
        System.out.println(String.format("Min %d in millisecond %s", new Ex12().min(values),
                BigInteger.valueOf(System.currentTimeMillis() - startTime1).toString()));
        // Min 100 in millisecond 184
        long startTime2 = System.currentTimeMillis();
        System.out.println(String.format("Min %d in millisecond %s", new Ex12().minNoAssert(values),
                BigInteger.valueOf(System.currentTimeMillis() - startTime2).toString()));
        // Min 100 in millisecond 110



    }

}
