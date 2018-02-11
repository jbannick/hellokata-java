mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmwin64img/HelloModulesWin64Image.java \
    src/module-info.java

jar -cfe mods/hmwin64img.jar kata.modules.hmwin64img.HelloModulesWin64Image -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:/Users/johnbannick/Documents/java/jdk-win64-9.0.4/jmods \
--add-modules hellomoduleswin64image \
--launcher hellomoduleswin64image=hellomoduleswin64image \
--output hellomoduleswin64image-image
