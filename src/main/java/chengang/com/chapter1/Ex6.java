package chengang.com.chapter1;


/*
Write a program that computes the factorial n! = 1 × 2 × . . . × n, using BigInteger. Compute the factorial of 1000.
 */

import java.math.BigInteger;

public class Ex6 {
    public static BigInteger factorial(int n) {
        if (n == 1) return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] String) {
        System.out.println(factorial(1000));
    }

}
