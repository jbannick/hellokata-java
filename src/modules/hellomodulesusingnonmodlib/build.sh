#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $EBUS_HOME/eventbus-1.4.jar mods
CP=./mods/eventbus-1.4.jar

javac --module-path mods -d out --module-source-path src -m hmod\
    src/hmod/kata/hmod/HelloModulesUsingNonModLib.java \
    src/hmod/kata/hmod/Publisher.java \
    src/hmod/kata/hmod/Subscriber.java \
    src/hmod/module-info.java
