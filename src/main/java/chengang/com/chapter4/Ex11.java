package chengang.com.chapter4;

/*
Write the “Hello, World” program, using reflection to look up the out field of java.lang.System and using invoke to call
the println method.
 */

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex11 {
    public static void main(String[] args) {
        try {
            Field f = System.class.getField("out");
            // PrintStream out = (PrintStream) f.get(null);  // Static field
            Object out =  f.get(null);  // Static field
            Method print = out.getClass().getDeclaredMethod("print", String.class);
            print.invoke(out, "Hello world");

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
