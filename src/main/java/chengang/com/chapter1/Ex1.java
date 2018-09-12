package chengang.com.chapter1;

/*
    Write a program that reads an integer and prints it in binary, octal, and hexadecimal. Print the reciprocal as a
    hexadecimal floating-point number.
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        int i = in.nextInt();
        String s = Integer.toString(i, 2);
        System.out.println(MessageFormat.format("{0} in binary {1}: Octal {2}, Hex {3}", i, s,
                String.format("%o", i), String.format("%x", i)
                ));
    }

}
