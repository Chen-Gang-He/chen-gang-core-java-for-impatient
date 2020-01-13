package chengang.com.chapter6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

class Exceptions {
    @SuppressWarnings("unchecked")
    static  <T extends Throwable> void throwAs(Throwable e) throws T {
       throw (T) e;
    }
}
public class Ex23 {
    static <V> V doWork(Callable<V> c) {
        try {
            return c.call();
        } catch (Throwable realEx) {
            Exceptions.<RuntimeException>throwAs(realEx);
            // throw (RuntimeException) realEx;  // Casting Throwable be RuntimeException may produce ClassCastException
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(doWork(() -> Files.readAllLines(Paths.get("c:\\csb.log"))));

    }

}
