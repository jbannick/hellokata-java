#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

cp $EBUS_HOME/eventbus-1.4.jar mods

javac --module-path mods -d out --module-source-path src -m appmod\
    src/appmod/kata/app/HelloModUsingLib1.java \
    src/appmod/kata/app/Publisher.java \
    src/appmod/kata/app/Subscriber.java \
    src/appmod/module-info.java

jar -cfe mods/appmod.jar kata.app.HelloModUsingLib1 -C out/appmod .
