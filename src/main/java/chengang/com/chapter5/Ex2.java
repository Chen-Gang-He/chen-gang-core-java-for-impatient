package chengang.com.chapter5;

import java.io.IOException;

/*
Write a method public double sumOfValues(String filename) throws ... that calls the preceding method and returns the sum
of the values in the file. Propagate any exceptions to the caller.
 */
public class Ex2 {
    static double sumOfValues(String filename) throws IOException {
        return Ex1.readValues(filename).stream().parallel().mapToDouble(Double::doubleValue).sum();
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(sumOfValues("C:\\Users\\Chen-Gang\\IdeaProjects\\chen-gang-core-java-for-impatient\\src\\main\\resources\\1.txt"));

    }
}
