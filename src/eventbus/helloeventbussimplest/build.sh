#!/usr/bin/env bash
mkdir -p out
mkdir -p lib

cp $EBUS_HOME/eventbus-1.4.jar lib

CP=lib/eventbus-1.4.jar

javac -cp $CP -d out -sourcepath src $(find src -name '*.java')
