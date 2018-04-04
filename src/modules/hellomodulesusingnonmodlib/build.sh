#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $EBUS_HOME/eventbus-1.4.jar mods
CP=./mods/eventbus-1.4.jar

javac --module-path mods -d out --module-source-path src -m appmod\
    src/appmod/kata/app/HelloModulesUsingNonModLib.java \
    src/appmod/kata/app/Publisher.java \
    src/appmod/kata/app/Subscriber.java \
    src/appmod/module-info.java
