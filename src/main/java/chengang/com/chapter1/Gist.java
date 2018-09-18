package chengang.com.chapter1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Created by che on 8/29/2018.
 */
public class Gist {
    private enum Flag {TRUE, FALSE}

    ;
    private static final Logger logger = LogManager.getLogger(Gist.class);
//    Logger logger = LogManager.getRootLogger();


    public static int mod(int x, int m) {
        if (x >= 0) return x % m;
        else {
            return ((x % m) + m) % m;
        }
    }

    public static int max(int x, int y, int z) {
        return x < y ? (y > z ? y : z) : (x > z ? x : z);
    }

    public static void main(String[] args) {
        System.out.println(2.0 - 1.1);
        Flag flag = Flag.TRUE;
        System.out.println(flag);
        System.out.println(mod(-12, 5));
        System.out.println(Math.floorMod(-12, 5));
        System.out.println("max 12, 7 3 : " + max(12, 7, 3));

        System.out.println(BigInteger.valueOf(30000000000L).multiply(BigInteger.valueOf(1)));
        ArrayList<ArrayList<String>> tuples = new ArrayList<>();
        ArrayList<ArrayList<String>> tuples2 = new ArrayList<>();
        tuples.add(new ArrayList<>(Arrays.asList("a", "b")));
        tuples.add(new ArrayList<>(Arrays.asList("c", "d")));
        System.out.println("size: " + tuples.size());
        tuples2.addAll(tuples);
        tuples2.addAll(tuples);
        tuples2.stream().forEach(System.out::println);
        System.out.println("size: " + tuples2.size());
        StringBuilder sb = new StringBuilder();
        for (ArrayList<String> row : tuples2) {
            for (String field : row) {
                sb.append(field);
                sb.append((char) 44);
            }
        }
        String result = sb.toString().substring(0, sb.length());
//        System.out.println(result);
        Properties props = System.getProperties();
        props.setProperty("log4j.configurationFile", "C:\\src\\IdeaProjects\\corejavaforimpatient" +
                "\\conf\\log4j2.xml");
        System.out.println(System.getProperties().getProperty(("log4j.configurationFile")));
        logger.error(result);
//        System.out.println(System.getProperties().getProperty(("log4j.configurationFile")));

        Path configPath = Paths.get("C:\\Users\\che\\Desktop\\aarp_cloud_svn\\trunk\\app\\aarp-imax\\conf\\" +
                "imax_common_conf.ini");
        try {
            InputStream configFileInputStream = Files.newInputStream(configPath);
            Properties prop = new Properties();
            prop.load(configFileInputStream);
            String authUserName = prop.getProperty("vtm_web_service_auth_user_name");
            String authPassword = prop.getProperty("vtm_web_service_auth_password");
            String authClientid = prop.getProperty("vtm_web_service_auth_clientid");
            String authSecret = prop.getProperty("vtm_web_service_auth_secret");
            String loginHost = prop.getProperty("vtm_web_service_login_host");
            String stagingTablePathPrefix = prop.getProperty("vtm_staging_table_data_path_prefix");
            String stagingTableFieldDelimiter = prop.getProperty("vtm_staging_table_field_delimiter");

            String[] configs = new String[]{authUserName, authPassword, authClientid, authSecret, loginHost,
                    stagingTablePathPrefix, stagingTableFieldDelimiter};
            System.out.println(Arrays.toString(configs));
            prop.entrySet().stream().filter(entry -> Pattern.matches("^vtm.*", (String) entry.getKey())).forEach(entry -> logger.error(
                    MessageFormat.format("    {0}: {1}", entry.getKey(), entry.getValue())));

            Path path = Paths.get("data\\aa\\", "\\a\\c");
            System.out.println(path.toString());

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }
}
