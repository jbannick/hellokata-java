#!/usr/bin/env bash
mkdir -p out

javac -d out \
    -cp ./src:$LOG4J2_HOME/log4j-core-2.10.0.jar:$LOG4J2_HOME/log4j-api-2.10.0.jar \
    src/HelloLog4J2ConfigProperties.java

cp ./src/log4j2.properties ./out
