package chengang.com.chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
Measure the difference when counting long words with a parallelStream
instead of a stream . Call System.currentTimeMillis before and after the call and
print the difference. Switch to a larger document (such as War and Peace)
if you have a fast computer.
 */
public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        Path file = Paths.get("c:\\tmp\\1.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> words = lines.stream().flatMap(x -> Arrays.stream(x.split("\\PL+")))
                .collect(Collectors.toList());

        long start1 = System.currentTimeMillis();
        words.stream().sorted(Comparator.comparing(String::length).reversed()).toArray();
        long end1 = System.currentTimeMillis();
        System.out.println((end1 - start1) / 1000.0);

        long start2 = System.currentTimeMillis();
        words.parallelStream().sorted(Comparator.comparing(String::length).reversed()).toArray();
        long end2 = System.currentTimeMillis();
        System.out.println((end2 - start2) / 1000.0);

        System.out.println("Sorting by ParallelStream has worse performance than by in sequence " +
                "because ForkjoinPool has cost and sorting is more difficult to split-and-conquer. ");

        long start3 = System.currentTimeMillis();
        words.stream().filter(x -> x.length() > 5).count();
        long end3 = System.currentTimeMillis();
        System.out.println((end3 - start3) / 1000.0);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        long start4 = System.currentTimeMillis();
        words.parallelStream().filter(x -> x.length() > 5)
                .count();
        long end4 = System.currentTimeMillis();
        System.out.println((end4 - start4) / 1000.0);

        System.out.println("Count by ParallelStream has better performance than by in sequence " +
                "because counting by ForkjoinPool can be to split-and-conquer. ");
    }
}
