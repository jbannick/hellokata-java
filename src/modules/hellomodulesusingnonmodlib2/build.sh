#!/usr/bin/env bash
mkdir -p out
mkdir -p lib
mkdir -p mods

cp $JSON_HOME/jackson-core-2.9.0.jar lib
cp $JSON_HOME/jackson-annotations-2.9.0.jar lib

cp $JSON_HOME/jackson-databind-2.9.0.jar mods

CP=lib/jackson-annotations-2.9.0.jar:
CP+=lib/jackson-core-2.9.0.jar

javac -cp $CP --module-path mods -d out --module-source-path src -m appmod
