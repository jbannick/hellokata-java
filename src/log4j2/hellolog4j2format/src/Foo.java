package gov.fubar.foo;

import gov.fubar.foo.bar.Bar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Foo {
    static final Logger logger = LogManager.getLogger();
    public Foo() {
        logger.info("Instantiated");
        Bar bar = new Bar();
    }
}
