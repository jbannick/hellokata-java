#!/usr/bin/env bash
mkdir -p out
mkdir -p lib

cp $CSV_HOME/commons-csv-1.5.jar lib

CP=lib/commons-csv-1.5.jar

javac -cp $CP -d out -sourcepath src $(find src -name '*.java')
