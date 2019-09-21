package chengang.com.chapter5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/*
Implement a method that contains the code with a Scanner and a PrintWriter in Section 5.1.5, “The Try-with-Resources
Statement,” on p. 179. But don’t use the try-with-resources statement. Instead, just use catch clauses. Be sure to close
both objects, provided they have been properly constructed. You need to consider the following conditions:
• The Scanner constructor throws an exception.
• The PrintWriter constructor throws an exception.
• hasNext, next, or println throw an exception.
• out.close() throws an exception.
• in.close() throws an exception.
 */
public class Ex5 {
    public static void main(String[] args) {
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
}
