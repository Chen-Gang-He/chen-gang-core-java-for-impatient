package chengang.com.chapter1;

/*
    Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
    0 and 359 degrees. Try it first with the % operator, then with floorMod.
 */

import java.util.Scanner;

public class Ex2 {
    public static int mod(int in, int n) {
        return ((in % n) + n) % n;
    }

    public static int mod2(int in, int n){
        return Math.floorMod(in, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input:");
        int in = scanner.nextInt();
        System.out.println(mod(in, 360));
        System.out.println(mod2(in, 360));

    }
}
