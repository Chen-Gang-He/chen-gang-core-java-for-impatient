package chengang.com.chapter6;

import java.util.ArrayList;

public class Ex14 {
    static <T extends AutoCloseable> void closeAll(@org.jetbrains.annotations.NotNull ArrayList<T> elements) throws Throwable{
        Throwable currentException = new Exception("closeAll Exception");
        for (T element: elements) {
            try{
                element.close();
            } catch (Exception e) {
                currentException.addSuppressed(e);
            }
        }
        if (currentException.getSuppressed().length > 0) {
            throw currentException;
        }
    }
}
