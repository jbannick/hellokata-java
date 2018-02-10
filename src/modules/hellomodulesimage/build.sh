mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmimage/HelloModulesImage.java \
    src/module-info.java

jar -cfe mods/hmimage.jar kata.modules.hmimage.HelloModulesImage -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:$JAVA_HOME/jmods \
--add-modules hellomodulesimage \
--launcher hellomodulesimage=hellomodulesimage \
--output hellomodulesimage-image
