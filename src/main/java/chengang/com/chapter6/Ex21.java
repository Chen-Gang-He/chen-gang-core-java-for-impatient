package chengang.com.chapter6;

import java.util.Collections;

public class Ex21 {
    public static <T> T[] construct(int size, T... emptyValue) {
        return Collections.nCopies(size, null).toArray(emptyValue);
    }
}
