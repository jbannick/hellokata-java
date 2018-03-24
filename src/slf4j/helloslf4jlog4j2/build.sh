#!/usr/bin/env bash
mkdir -p out

javac -d out \
    -cp ./src:$SLF4J_HOME/slf4j-api-1.8.0-beta2.jar:$SLF4J_HOME\
$LOG4J2_HOME/log4j-core-2.10.0.jar:\
$LOG4J2_HOME/log4j-api-2.10.0.jar:\
$LOG4J2_HOME/log4j-slf4j-impl-2.10.0.jar\
    src/HelloSLF4JLog4J2.java

cp ./src/log4j2.xml ./out
