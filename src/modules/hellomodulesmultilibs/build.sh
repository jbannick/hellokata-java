#!/usr/bin/env bash

mkdir -p out
mkdir -p mods

cp $LOG4J2_HOME/log4j-api-2.11.0.jar mods
cp $LOG4J2_HOME/log4j-core-2.11.0.jar mods

cp $EBUS_HOME/eventbus-1.4.jar mods

cp $CSV_HOME/commons-csv-1.5.jar mods

cp $JSON_HOME/jackson-core-2.9.0.jar mods
cp $JSON_HOME/jackson-annotations-2.9.0.jar mods

cp $JSON_HOME/jackson-databind-2.9.0.jar mods

javac --module-path mods -d out --module-source-path src -m appmod

cp src/appmod/log4j2.xml out/appmod
