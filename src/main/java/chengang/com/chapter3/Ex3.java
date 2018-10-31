package chengang.com.chapter3;

import javax.imageio.stream.ImageOutputStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

/*
What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note that each type is its own supertype. A
class or interface without declared supertype has supertype Object.
 */
public class Ex3 {

    public static void main(String[] args) {
        Class<String> cls = String.class;
        Class<?>[] baseClass = cls.getInterfaces();
        for (Class<?> inter : baseClass) {
            out.println(inter.getName());
        }
        // java.io.Serializable
        // java.lang.Comparable
        // java.lang.CharSequence

        Class<Scanner> scannerClass = Scanner.class;
        Class<?>[] scannerInterfaces = scannerClass.getInterfaces();
        Arrays.stream(scannerInterfaces).forEach(out::println);
        // interface java.util.Iterator
        // interface java.io.Closeable

        Class<ImageOutputStream> imageOutputStreamClass = ImageOutputStream.class;
        Class<?>[] imageOutputStreamBase = imageOutputStreamClass.getInterfaces();
        out.println(Arrays.toString(imageOutputStreamBase));


    }
}
