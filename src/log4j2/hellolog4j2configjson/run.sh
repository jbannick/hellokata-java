#!/usr/bin/env bash
java    -cp ./out:$LOG4J2_HOME/log4j-core-2.11.0.jar:$LOG4J2_HOME/log4j-api-2.11.0.jar:$JSON_HOME/jackson-core-2.9.0.jar:$JSON_HOME/jackson-databind-2.9.0.jar:$JSON_HOME/jackson-annotations-2.9.0.jar \
    HelloLog4J2ConfigJSON
