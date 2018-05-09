module appmod {
    requires eventbus;
    requires commons.csv;
    requires jackson.databind;
    requires org.apache.logging.log4j;

    opens kata.app;
}
