#!/usr/bin/env bash
java -cp ./out:$LOG4J2_HOME/log4j-core-2.10.0.jar:$LOG4J2_HOME/log4j-api-2.10.0.jar \
    gov.fubar.foo.HelloLog4J2Format
