package chengang.com.chapter7;

import java.util.*;

/*
Write a program that reads a sentence into an array list. Then, using Collections.shuffle, shuffle all but the first and
last word, without copying the words into another collection.
 */

public class Ex11 {
    public static void main(String[] args) {
        String sentence = "Chengang hello world love Java Scala Python!!!";
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split("\\PL+")));
        System.out.println(String.format("words before shuffling %1$s", words));
        Collections.shuffle(words.subList(1, words.size() - 1));
        System.out.println(String.format("words after shuffling %1$s", words));
    }
}
