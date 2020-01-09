package chengang.com.chapter6;

public class Ex20 {
    @SafeVarargs public static final <T> T[] repeat(int n, T... objs) {
        @SuppressWarnings("unchecked") T[] results = (T[]) java.lang.reflect.Array.newInstance(objs.getClass(), n);
        for (int i = 1; i < results.length; i++) {
            results[i] = objs[0];
        }
        return results;
    }


}
