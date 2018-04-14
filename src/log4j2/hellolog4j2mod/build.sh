#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $LOG4J2_HOME/log4j-api-2.11.0.jar mods
cp $LOG4J2_HOME/log4j-core-2.11.0.jar mods

cp src/appmod/log4j2.xml out/appmod

javac -cp $CP --module-path mods -d out --module-source-path src -m appmod
