import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloLog4J2ConfigSysProp {
    static final Logger logger = LogManager.getLogger();
    public static void main(String... args) {
        System.out.println("Hello Log4J2 Config System Property!");

        System.out.println(String.format("log4j.configurationFile=%s",
            System.getProperty("log4j.configurationFile")));

        logger.info("This is an info entry");
        logger.debug("This is a debug entry");
        logger.warn("This is a warn entry");
        logger.error("This is an error entry");
    }
}
