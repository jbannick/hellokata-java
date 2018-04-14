module appmod {
    requires org.apache.logging.log4j;
    requires eventbus;
    requires commons.csv;
    requires jackson.databind;
    requires jackson.core;

    opens kata.app;
}
