#!/usr/bin/env bash
java -Dlog4j.configurationFile=log4j2alt.xml -cp ./out:$LOG4J2_HOME/log4j-core-2.10.0.jar:$LOG4J2_HOME/log4j-api-2.10.0.jar \
    HelloLog4J2ConfigSysProp
