import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class HelloLog4J2ConfigProgrammatic {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String... args) {
        System.out.println("Hello Log4J2 Config Programmatic!");

        logger.info("This is an info entry");
        logger.debug("This is a debug entry");
        logger.warn("This is a warn entry");
        logger.error("This is an error entry");

        Configurator.setAllLevels(logger.getName(), Level.DEBUG);

        logger.info("This is an info entry after setting level = DEBUG");
        logger.debug("This is a debug entry after setting level = DEBUG");
        logger.warn("This is a warn entry after setting level = DEBUG");
        logger.error("This is an error entry after setting level = DEBUG");

    }
}
