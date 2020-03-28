package chengang.com.chapter7;

/*
Using Collections.shuffle, write a program that reads a sentence, shuffles the words, and prints the result. Fix the
capitalization of the initial word and the punctuation of the last word (before and after the shuffle). Hint: Don’t
shuffle the words.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        String sentence = "Now is the time for all good men to come to the aid of their country!!!";
        List<String> words = Arrays.asList(sentence.toLowerCase().split("\\PL+"));
        Collections.shuffle(words.subList(0, words.size()));
        System.out.println(String.format("%1$s", words));
        words.set(0, words.get(0).toUpperCase());
        System.out.println(String.join(" ", words) + ".");


    }
}
