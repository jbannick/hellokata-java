#!/usr/bin/env bash
mkdir -p out

javac -implicit:class -d out \
    -cp src:$LOG4J2_HOME/log4j-core-2.10.0.jar:$LOG4J2_HOME/log4j-api-2.10.0.jar \
    src/gov/fubar/foo/HelloLog4J2JAR.java

cd out

jar -xf $LOG4J2_HOME/log4j-core-2.10.0.jar
jar -xf $LOG4J2_HOME/log4j-api-2.10.0.jar

cd ..
cp src/log4j2.xml out

jar -cfm hellolog4j2jar.jar src/META-INF/MANIFEST.MF -C out .
