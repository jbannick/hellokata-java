#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $CSV_HOME/commons-csv-1.5.jar mods

javac --module-path mods -d out --module-source-path src -m appmod\
    src/appmod/kata/app/HelloCSVParserMod.java \
    src/appmod/module-info.java
