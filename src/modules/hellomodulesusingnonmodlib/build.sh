#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $EBUS_HOME/eventbus-1.4.jar mods
CP=./mods/eventbus-1.4.jar

javac --module-path mods -d out --module-source-path src -m hmod1lib\
    src/hmod1lib/kata/hmod/HelloModulesUsingNonModLib.java \
    src/hmod1lib/kata/hmod/Publisher.java \
    src/hmod1lib/kata/hmod/Subscriber.java \
    src/hmod1lib/module-info.java
