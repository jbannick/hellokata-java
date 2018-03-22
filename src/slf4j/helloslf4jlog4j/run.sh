#!/usr/bin/env bash
java -cp ./out:$SLF4J_HOME/slf4j-api-1.8.0-beta2.jar:$SLF4J_HOME/slf4j-simple-1.8.0-beta2.jar:$LOG4J1_HOME/apache-log4j-1.2.jar \
    HelloSLF4JLog4J
