package chengang.com.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex2 {
    static void toUpperCaseIterator(ArrayList<String> words) {
        ListIterator<String> iter = words.listIterator();
        while (iter.hasNext()) {
            String word = iter.next();
            if (word != null) {
                iter.set(word.toUpperCase());
            }
        }
    }

    static void toUpperCaseIndex(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (word != null) {
                words.set(i, word.toUpperCase());
            }
        }
    }

    static void toUpperCaseReplaceAll(ArrayList<String> words) {
        words.replaceAll(String::toUpperCase);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(null, "chengang", "xxx"));
        @SuppressWarnings("unchecked")
        ArrayList<String> words1 = (ArrayList<String>) words.clone();
        @SuppressWarnings("unchecked")
        ArrayList<String> words2 = (ArrayList<String>) words.clone();
        @SuppressWarnings("unchecked")
        ArrayList<String> words3 = (ArrayList<String>) words.clone();
        System.out.println(String.format("Word1 before capatializing by iterator: %s", words1));
        toUpperCaseIterator(words1);
        System.out.println(String.format("Word1 after capatializing by iterator : %s", words1));

        System.out.println(String.format("Word2 before capatializing by indices: %s", words2));
        toUpperCaseIndex(words2);
        System.out.println(String.format("Word2 after capatializing by indices: %s", words2));

        System.out.println(String.format("Word2 before capatializing by replaceAll: %s", words3));
        toUpperCaseReplaceAll(words3);
        System.out.println(String.format("Word2 after capatializing by replaceAll: %s", words3));


    }
}
