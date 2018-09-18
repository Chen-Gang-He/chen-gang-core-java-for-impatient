package chengang.com.chapter1;

/**
 * Created by che on 9/13/2018.
 */

/*
    Write a program that prints the smallest and largest positive double value. Hint: Look up Math.nextUp in the Java
    API.
 */
public class Ex4 {

    public static void main (String[] args) {
        System.out.println(Math.nextUp(Double.parseDouble("0.0")));
        System.out.println(Double.MAX_VALUE);

    }
}
