#!/usr/bin/env bash
mkdir -p out

javac -d out \
    -cp ./src:$LOG4J2_HOME/log4j-core-2.11.0.jar:$LOG4J2_HOME/log4j-api-2.11.0.jar:$JSON_HOME/jackson-core-2.9.0.jar:$JSON_HOME/jackson-databind-2.9.0.jar:$JSON_HOME/jackson-annotations-2.9.0.jar \
    src/HelloLog4J2ConfigJSON.java

cp ./src/log4j2.json ./out
