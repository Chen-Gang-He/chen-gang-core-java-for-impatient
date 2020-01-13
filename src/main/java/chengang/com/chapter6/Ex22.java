package chengang.com.chapter6;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex22 {
    public static <V, T extends Throwable> V doWork(Callable<V> c, Function<Throwable, T> constructor) throws T {
        try {
            return  c.call();
        } catch (Throwable realEx) {
            throw constructor.apply(realEx);
        }
    }

    public static void main(String[] args) {
        System.out.println(doWork(() -> new String(Files.readAllBytes(Paths.get("c:\\csb.log"))), RuntimeException::new));
    }


}
