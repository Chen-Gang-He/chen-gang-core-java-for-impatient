package chengang.com.chapter8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
The codePoints method in Section 8.3, “The filter , map , and flatMap Methods”
(page 263) was a bit clumsy, first filling an array list and then turning
it into a stream. Write a stream-based version instead, using the
IntStream.iterate method to construct a finite stream of offsets, then extract
the substrings.
 */
public class Ex5 {
    public static void main(String[] args) {
        String word = "你好java";
        Stream<String> x = IntStream.range(0, word.length())
                .mapToObj(i -> word.substring(i, word.offsetByCodePoints(i, 1)));
        x.forEach(System.out::println);

    }
}
