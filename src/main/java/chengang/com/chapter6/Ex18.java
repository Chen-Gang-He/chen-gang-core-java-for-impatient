package chengang.com.chapter6;

import org.jetbrains.annotations.NotNull;

import java.util.function.IntFunction;

public class Ex18 {
    public static <T> T[] repeat(int n, T obj, @NotNull IntFunction<T[]> constr) {
        T[] results = constr.apply(n);
        for (int i = 1; i < n; i++) {
            results[i] = obj;
        }
        return results;
    }

    public static void main(String[] args) {
        // Compile error: Type argument can not be of primitive type
        // Ex18.<int>repeat(10, 42, Integer[]::new);
        Ex18.<Integer>repeat(10, 42, Integer[]::new);
    }
}
