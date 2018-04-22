#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $LOG4J2_HOME/log4j-api-2.11.0.jar mods
cp $LOG4J2_HOME/log4j-core-2.11.0.jar mods

javac --module-path mods -d out --module-source-path src -m appmod

cp src/appmod/log4j2.xml out/appmod

jar -cfe mods/appmod.jar kata.app.HelloModUsingLib2 -C out/appmod .
