package chengang.com.chapter5;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/*
Write a method public ArrayList<Double> readValues(String filename) throws ... that reads a file containing
floating-point numbers. Throw appropriate exceptions if the file could not be opened or if some of the inputs are not
floating-point numbers.
 */
public class Ex1 {
    static ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> results = new ArrayList<>();

        ClassLoader classLoader = Ex1.class.getClassLoader();
        URL fileUrl = classLoader.getResource(filename);
        if (fileUrl == null) throw new FileNotFoundException(filename);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileUrl.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                results.add(Double.valueOf(line));
            }
        }
//        try (Scanner scanner = new Scanner(fileUrl.openStream())) {
//            while (scanner.hasNextDouble()) {
//                results.add(scanner.nextDouble());
//            }
//        }
        return results;
    }

    public static void main(String[] args) {
        try {
            ArrayList<Double> doubles = Ex1.readValues("1.txt");
            System.out.println(doubles);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
