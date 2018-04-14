module appmod {
    requires org.apache.logging.log4j;
    requires eventbus;
    requires commons.csv;
    requires jackson.databind;

    opens kata.app;
}
