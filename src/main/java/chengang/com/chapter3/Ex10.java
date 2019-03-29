package chengang.com.chapter3;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/*
Using the listFiles(FileFilter) and isDirectory methods of the java.io.File class, write a method that returns all
subdirectories of a given directory. Use a lambda expression instead of a FileFilter object. Repeat with a method
expression and an anonymous inner class.
 */
public class Ex10 {
    private static File[] getDirectories(File file, FileFilter filter){
        ArrayList<File> files = new ArrayList<>();
        File[] currentFiles = file.listFiles();
        if (currentFiles != null) {
            for (File f : currentFiles) {
                if (f != null && filter.accept(f)) {
                    files.add(f);
                    File[] subFiles = getDirectories(f, filter);
                    if (subFiles != null && subFiles.length > 0) {
                        files.addAll(new ArrayList<>(Arrays.asList(subFiles)));
                    }
                }
            }
        } else {
            return null;
        }
        if (files.size() > 0) {
            File[] result = new File[files.size()];
            return files.toArray(result);
        } else {
            return null;
        }
    }

    private static void print(File[] files) {
        for (File f: files) {
            System.out.println("Directory name: " + f.getName());
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3};

        Stream<Integer> numberStream = Arrays.stream(numbers).boxed();
        File file = new File("C:\\Users\\che\\Desktop\\aarp_cloud_svn\\trunk\\app\\aarp-imax");
        Ex10.print(Ex10.getDirectories(file, File::isDirectory));
        Ex10.print(Ex10.getDirectories(file, (f) -> f.isDirectory()));
        Ex10.print(Ex10.getDirectories(file, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        }));
    }

    }



