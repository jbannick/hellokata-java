#!/usr/bin/env bash

java -cp ./out:$SLF4J_HOME/slf4j-api-1.8.0-beta2.jar:\
$LOG4J2_HOME/log4j-core-2.10.0.jar:\
$LOG4J2_HOME/log4j-api-2.10.0.jar:\
$LOG4J2_HOME/log4j-slf4j-impl-2.10.0.jar\
    HelloSLF4JLog4J2
