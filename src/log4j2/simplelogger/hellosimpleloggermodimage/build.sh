#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

rm -rf appmod-image

cp $LOG4J2_HOME/log4j-api-2.11.0.jar mods

javac --module-path mods -d out \
    src/appmod/kata/app/HelloLog4J2SimpleLoggerModImage.java \
    src/appmod/module-info.java

jar -cfe mods/appmod.jar kata.app.HelloLog4J2SimpleLoggerModImage -C out .

$JAVA_HOME/bin/jlink \
    --module-path mods/:$JAVA_HOME/jmods \
    --add-modules appmod \
    --add-modules org.apache.logging.log4j \
    --launcher appmod=appmod \
    --output appmod-image
