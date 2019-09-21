package chengang.com.chapter5;
/**
 *
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class Ex6 {
    static void method1() {
        String fileName = "1.txt";
        ClassLoader classLoader = Ex5.class.getClassLoader();
        URL fileUrl = classLoader.getResource(fileName);
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            if (fileUrl == null) throw new FileNotFoundException(fileName);
            scanner = new Scanner(fileUrl.openStream());
            printWriter = new PrintWriter("C:\\Users\\Chen-Gang\\IdeaProjects" +
                    "\\chen-gang-core-java-for-impatient\\src\\main\\resources\\Chap5Ex4Result.txt");
            while (scanner.hasNext()) {
                printWriter.println(scanner.next());
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (scanner != null) scanner.close();
                if (printWriter != null) printWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static void method2() {
        String fileName = "1.txt";
        ClassLoader classLoader = Ex5.class.getClassLoader();
        URL fileUrl = classLoader.getResource(fileName);
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try {
            if (fileUrl == null) throw new FileNotFoundException(fileName);
            try {
                scanner = new Scanner(fileUrl.openStream());
                printWriter = new PrintWriter("C:\\Users\\Chen-Gang\\IdeaProjects" +
                        "\\chen-gang-core-java-for-impatient\\src\\main\\resources\\Chap5Ex4Result.txt");
                while (scanner.hasNext()) {
                    printWriter.println(scanner.next());
                }
            } finally {
                if (scanner != null) scanner.close();
                if (printWriter != null) printWriter.close();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    static void method3() {
        String fileName = "1.txt";
        ClassLoader classLoader = Ex5.class.getClassLoader();
        URL fileUrl = classLoader.getResource(fileName);
        try (Scanner scanner = new Scanner(fileUrl.openStream());
             PrintWriter printWriter = new PrintWriter("C:\\Users\\Chen-Gang\\IdeaProjects" +
                "\\chen-gang-core-java-for-impatient\\src\\main\\resources\\Chap5Ex4Result.txt")) {
            while (scanner.hasNext()) {
                printWriter.println(scanner.next());
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
