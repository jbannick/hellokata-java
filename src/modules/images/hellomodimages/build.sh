#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

javac -d out \
    src/appmod/kata/app/HelloModulesImages.java \
    src/appmod/module-info.java

jar -cfe mods/appmod.jar kata.app.HelloModulesImages -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:$JDK_MACOS_HOME/jmods \
--add-modules appmod \
--launcher appmod=appmod \
--output appmod-image-macos

$JAVA_HOME/bin/jlink \
--module-path mods/:$JDK_WIN64_HOME/jmods \
--add-modules appmod \
--launcher appmod=appmod \
--output appmod-image-win64

$JAVA_HOME/bin/jlink \
--module-path mods/:$JDK_LINUX_HOME/jmods \
--add-modules appmod \
--launcher appmod=appmod \
--output appmod-image-linux
