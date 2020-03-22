package chengang.com.chapter7;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
// import java.util.stream.Stream;

public class Ex7 {
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

    public static void main(String[] args) throws IOException {
        System.out.println(countWord(Paths.get("c:\\service.log")));
    }

}
