#!/usr/bin/env bash
mkdir -p out
mkdir -p lib

cp $JSON_HOME/jackson-core-2.9.0.jar lib
cp $JSON_HOME/jackson-annotations-2.9.0.jar lib
cp $JSON_HOME/jackson-databind-2.9.0.jar lib

CP=lib/jackson-annotations-2.9.0.jar:
CP+=lib/jackson-core-2.9.0.jar:
CP+=lib/jackson-databind-2.9.0.jar

javac -cp $CP -d out -sourcepath src $(find src -name '*.java')
