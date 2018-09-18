package chengang.com.chapter1;

/*
Write a program that reads a string and prints all of its nonempty substrings.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern p = Pattern.compile("\\s+");
//    String[] sa = p.split(s);
        for (String c : p.split(s)) {
            System.out.println(c);
        }
    }
}
