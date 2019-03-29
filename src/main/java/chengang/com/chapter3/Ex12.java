package chengang.com.chapter3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/*
Given an array of File objects, sort it so that directories come before files, and within each group, elements are
sorted by path name. Use a lambda expression to specify the Comparator.
 */
public class Ex12 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] files = dir.listFiles();
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getName));
        System.out.println(Arrays.toString(files));

    }
}
