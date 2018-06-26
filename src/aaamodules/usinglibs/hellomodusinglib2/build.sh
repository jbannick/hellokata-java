#!/usr/bin/env bash
mkdir -p out

cp $LOG4J2_HOME/log4j-api-2.11.0.jar .
cp $LOG4J2_HOME/log4j-core-2.11.0.jar .

javac --module-path . -d out --module-source-path src -m appmod

cp src/appmod/log4j2.xml out/appmod

jar -cfe appmod.jar kata.app.HelloModUsingLib2 -C out/appmod .
