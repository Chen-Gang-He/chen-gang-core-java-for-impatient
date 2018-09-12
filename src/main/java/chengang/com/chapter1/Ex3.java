package chengang.com.chapter1;

/*
    Using only the conditional operator, write a program that reads three integers and prints the largest. Repeat with
    Math.max.
 */

import java.util.Scanner;

public class Ex3 {
    public static int max(int x, int y, int z) {
        return x > y ? (x > z ? x : z) : (y > z ? y :z);
    }

    public static int max2(int x, int y, int z) {
        return Math.max(z, Math.max(x, y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        System.out.println("z:");
        int z = scanner.nextInt();
        System.out.println(max(x, y, z));
        System.out.println(max2(x, y, z));
    }
}
