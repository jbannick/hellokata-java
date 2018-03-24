package gov.fubar.foo.bar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
    static Logger logger = LogManager.getLogger();

    public Bar() {
        logger.info("Instantiated");
    }
}
