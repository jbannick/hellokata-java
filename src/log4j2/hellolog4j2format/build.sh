#!/usr/bin/env bash
mkdir -p out

javac -implicit:class -d out \
    -cp ./src:$LOG4J2_HOME/log4j-core-2.11.0.jar:$LOG4J2_HOME/log4j-api-2.11.0.jar \
    src/gov/fubar/foo/HelloLog4J2Format.java

cp ./src/log4j2.xml ./out
