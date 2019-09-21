package chengang.com.chapter5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/**
 *  不使用抛出异常而使用错误代码
 */
public class Ex4 {
    static ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> results = new ArrayList<>();

        ClassLoader classLoader = Ex1.class.getClassLoader();
        URL fileUrl = classLoader.getResource(filename);
        if (fileUrl == null) {
            results.add(9999999D);
            return results;
        }  // FileNotFoundException(filename);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileUrl.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                results.add(Double.valueOf(line));
            }
        } catch (IOException e) {
            Throwable[] secondaryException = e.getSuppressed();   // Comes from calling method close
            if (secondaryException != null) {
                results.add(99999998D);   // Closing Exception
            } else {
                results.add(99999997D);  // Process Exception
            }
        }
        return results;
    }
}
