import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSLF4JLog4J {
    private static Logger logger = LoggerFactory.getLogger(HelloSLF4JLog4J.class);

    public static void main(String... args) {
        System.out.println("Hello SLF4J Log4J!");
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}
