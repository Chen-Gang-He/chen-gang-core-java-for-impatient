package chengang.com.chapter7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Ex8 {
    private static Map<String, Set<Integer>> wordLines(Path path) throws IOException {
        HashMap<String, Set<Integer>> result = new HashMap<>();
        try (Scanner in = new Scanner(path)) {
            int l = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] words = line.split("\\PL");
                for (String word: words) {
                    if (word != null && !"".equals(word.trim())) {
                        result.computeIfAbsent(word, (x) -> new TreeSet<>());
                        result.get(word).add(l);
                    }
                }
                l++;
            }
        };
        return result;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(wordLines(Paths.get("c:\\service.log")));

    }

}
