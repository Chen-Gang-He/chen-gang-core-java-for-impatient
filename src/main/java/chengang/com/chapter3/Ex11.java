package chengang.com.chapter3;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Using the list(FilenameFilter) method of the java.io.File class, write a method that returns all files in a given
directory with a given extension. Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope
does it capture?
 */
public class Ex11 {
    static String[] listFileRecursive(File file, String ext) {
        ArrayList<String> fileNames = new ArrayList<>();
        File[] files = (file != null) ? file.listFiles() : null;
        if (files != null) {
            Stream<File> subfolders = Stream.of(files).filter(File::isDirectory);
            String[] fileNamesArray = file.list((dir, name) -> name.endsWith("." + ext));
            if (fileNamesArray != null) {
                fileNames.addAll(Arrays.asList(fileNamesArray));
            }
            if (subfolders != null) {
                fileNames.addAll(subfolders.flatMap((dir) -> Stream.of((listFileRecursive(dir, ext)))).collect(Collectors.toList()));
            }
            String[] result = new String[fileNames.size()];


            return fileNames.toArray(result);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(Ex11.listFileRecursive(new File("C:\\src\\IdeaProjects\\corejavaforimpatient"), "class")));
    }
}
