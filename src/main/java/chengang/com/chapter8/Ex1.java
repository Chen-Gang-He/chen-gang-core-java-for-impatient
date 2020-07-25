package chengang.com.chapter8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Verify that asking for the first five long words does not call the filter method once the fifth long word has been
found. Simply log each method call.
 */
public class Ex1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("I", "Love", "java", "Python", "Scala", "Big Data");
        words.stream().sorted(Comparator.comparing(String::length).reversed())
                .peek(System.out::println)
                .limit(1)
                .toArray();
    }

}
