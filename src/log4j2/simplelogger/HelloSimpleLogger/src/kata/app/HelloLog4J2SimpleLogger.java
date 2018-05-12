package kata.app;

import org.apache.logging.log4j.simple.*;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.util.PropertiesUtil;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class HelloLog4J2SimpleLogger {

    public static void main(String... args) {
        System.out.println("Hello Log4J2 SimpleLogger!");

        PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));

        SimpleLogger logger = new SimpleLogger(
            "kata.app.HelloLog4J2SimpleLogger", Level.DEBUG, true, true, true, true, "DD/MM/YY", null, PropertiesUtil.getProperties(), ps);

        logger.info("This is an information entry");
        logger.debug("This is a debugging entry");
        logger.warn("This is a warning entry");
        logger.error("This is an error entry");
    }
}
