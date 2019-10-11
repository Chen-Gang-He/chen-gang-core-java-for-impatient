package chengang.com.chapter5;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex13 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Console logger");
        logger.setLevel(Level.FINEST);
        logger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINEST);
        handler.setFilter(record -> !record.getMessage().contains("SEX"));
        logger.addHandler(handler);
        logger.info("Hello world");
        logger.info("SEX");


    }

}
