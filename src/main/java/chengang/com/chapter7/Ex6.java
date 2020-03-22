package chengang.com.chapter7;

import java.util.Map;
import java.util.Set;

public class Ex6 {
    public static <AS extends Set<Integer>> void someMethod(Map<String, AS> input) {
        // testing compilation only
    }
}
