package chengang.com.chapter1;

import java.util.Scanner;

/*
Write a program that reads in two numbers between 0 and 65535, stores them in short variables, and computes their
unsigned sum, difference, product, quotient, and remainder, without converting them to int.
 */
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        byte x = (byte) scanner.nextInt();
        short x = (short) scanner.nextInt();
        short y = (short) scanner.nextInt();
        System.out.println(Short.toUnsignedInt(x) + Short.toUnsignedInt(y));
        System.out.println(Short.toUnsignedInt(x) - Short.toUnsignedInt(y));
    }
}
