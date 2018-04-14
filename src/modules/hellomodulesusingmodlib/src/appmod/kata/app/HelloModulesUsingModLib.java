package kata.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloModulesUsingModLib {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String... args){
        System.out.println("Hello Modules using a Modularized Library!");

        logger.info("This is an information entry");
        logger.debug("This is a debugging entry");
        logger.warn("This is a warning entry");
        logger.error("This is an error entry");
    }
}
