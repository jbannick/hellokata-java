package kata.app;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.simple.*;
import org.apache.logging.log4j.util.PropertiesUtil;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class HelloLog4J2SimpleLoggerFormat {

    /**
     * Uses SimpleDateFormat
     */
    public static void main(String... args) {
        System.out.println("Hello Log4J2 SimpleLogger Format!");

        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));

        String dateTimeFormat = "YYMMdd_HH:mm:ss";

        SimpleLogger logger = new SimpleLogger(
            "kata.app.HelloLog4J2SimpleLoggerFormat!", Level.DEBUG, true, true, true, true, dateTimeFormat, null, PropertiesUtil.getProperties(), ps);

        logger.info("This is an information entry");
        logger.debug("This is a debugging entry");
        logger.warn("This is a warning entry");
        logger.error("This is an error entry");
    }
}
