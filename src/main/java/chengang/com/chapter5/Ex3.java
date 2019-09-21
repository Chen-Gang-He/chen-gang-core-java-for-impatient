package chengang.com.chapter5;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
Write a program that calls the preceding method and prints the result. Catch the exceptions and provide feedback to the
user about any error conditions.
 */
public class Ex3 {
    public static void main(String[] args) {
        String file = "C:\\Users\\Chen-Gang\\IdeaProjects\\chen-gang-core-java-for-impatient\\src\\main\\resources\\1.txt";
        try {
            System.out.println(Ex2.sumOfValues(file));
        } catch (FileNotFoundException e)
        {
            System.out.println(String.format("This file=[%s] does NOT exist", file));
        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }


}
