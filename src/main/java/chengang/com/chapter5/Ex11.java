package chengang.com.chapter5;

import java.util.Objects;

public class Ex11 {
    static double divide(Integer n, Integer d) {
        // Can identify easier which variable has NULL POINT ERROR than stacktrace
        Objects.requireNonNull(d, "Denominator does NOT require NULL");
        return (double) n / d;
    }

    static double divideAssert(Integer n, Integer d) {
        // Assert can be used in testing and can be disabled by class loader in PRD to improve performance
        assert d != null;
        return (double) n / d;
    }

    public static void main(String[] args) {
//        System.out.println(Ex11.divide(12, null));
        System.out.println(Ex11.divideAssert(12, null));
    }
}
