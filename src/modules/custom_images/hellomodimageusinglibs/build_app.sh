#!/usr/bin/env bash

javac --module-path mods -d out \
    src/appmod/kata/app/HelloModImageUsingLibs.java \
    src/appmod/kata/app/CSVReader.java \
    src/appmod/kata/app/JSONWriter.java \
    src/appmod/kata/app/Person.java \
    src/appmod/module-info.java

jar -cfe mods/appmod.jar kata.app.HelloModImageUsingLibs -C out .

$JAVA_HOME/bin/jlink \
    --module-path mods/:$JAVA_HOME/jmods \
    --add-modules appmod \
    --add-modules eventbus \
    --add-modules commons.csv \
    --add-modules jackson.databind \
    --add-modules jackson.core \
    --add-modules jackson.annotations \
    --add-modules org.apache.logging.log4j \
    --launcher appmod=appmod \
    --output appmod-image
