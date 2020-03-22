package chengang.com.chapter7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Ex9 {
    private static Map<String, Integer> countWord(Path path) throws IOException {
        // Stream<String> lines = Files.lines(path);
        String[] words = new String(Files.readAllBytes(path), StandardCharsets.UTF_8).split("\\PL");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (word != null && !word.trim().equals("")) {
                wordCount.merge(word, 1, Integer::sum);
                // wordCount.compute(word, (existingWord, existingCount) -> existingCount == null ? 1 : existingCount + 1);
            }
        }
        return wordCount;
    }

    private static Map<String, Integer> countWordContains(Path path) throws IOException {
        // Stream<String> lines = Files.lines(path);
        String[] words = new String(Files.readAllBytes(path), StandardCharsets.UTF_8).split("\\PL");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (word != null && !word.trim().equals("")) {
                if (!wordCount.containsKey(word)) {
                    wordCount.put(word, 1);
                } else {
                    wordCount.put(word, wordCount.get(word) + 1);

                }
            }
        }
        return wordCount;
    }

    private static Map<String, Integer> countWordGetNul(Path path) throws IOException {
        // Stream<String> lines = Files.lines(path);
        String[] words = new String(Files.readAllBytes(path), StandardCharsets.UTF_8).split("\\PL");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (word != null && !word.trim().equals("")) {
                if (wordCount.get(word) == null) {
                    wordCount.put(word, 1);
                } else {
                    // System.out.println(word);
                    wordCount.put(word, wordCount.get(word) + 1);
                }
            }
        }
        return wordCount;
    }

    private static Map<String, Integer> countWordGetOrDefault(Path path) throws IOException {
        // Stream<String> lines = Files.lines(path);
        String[] words = new String(Files.readAllBytes(path), StandardCharsets.UTF_8).split("\\PL");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (word != null && !word.trim().equals("")) {
                // System.out.println(word);
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    private static Map<String, Integer> countWordPutIfAbsent(Path path) throws IOException {
        // Stream<String> lines = Files.lines(path);
        String[] words = new String(Files.readAllBytes(path), StandardCharsets.UTF_8).split("\\PL");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for (String word : words) {
            if (word != null && !word.trim().equals("")) {
                // System.out.println(word);
                wordCount.putIfAbsent(word, 0);
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        return wordCount;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(countWord(Paths.get("c:\\service.log")));
        System.out.println(countWordContains(Paths.get("c:\\service.log")));
        System.out.println(countWordGetNul(Paths.get("c:\\service.log")));
        System.out.println(countWordGetOrDefault(Paths.get("c:\\service.log")));
        System.out.println(countWordPutIfAbsent(Paths.get("c:\\service.log")));
    }
}
