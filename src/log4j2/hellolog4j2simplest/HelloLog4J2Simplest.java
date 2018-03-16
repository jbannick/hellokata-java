import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloLog4J2Simplest {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String... args) {
        System.out.println("Hello Log4J2 Simplest!");
        logger.info("This is an information entry");
        logger.debug("This is a debugging entry");
        logger.warn("This is a warning entry");
        logger.error("This is an error entry");
    }
}
