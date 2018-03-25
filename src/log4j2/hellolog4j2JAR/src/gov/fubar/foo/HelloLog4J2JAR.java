package gov.fubar.foo;

import gov.fubar.foo.bar.Bar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLog4J2JAR {
    private static Logger logger = LogManager.getLogger();

    public HelloLog4J2JAR() {

        logger.info("This is an info entry");
        logger.debug("This is a debug entry");
        logger.warn("This is a warn entry");
        logger.error("This is an error entry");

        Bar bar = new Bar();
    }

    public static void main(String... args) {
        System.out.println("Hello Log4J2 JAR!");
        HelloLog4J2JAR app = new HelloLog4J2JAR();
    }
}
