mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmod/HelloModules.java \
    src/module-info.java

jar -cfe mods/hmod.jar kata.modules.hmod.HelloModules -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:$JAVA_HOME/jmods \
--add-modules hmod \
--launcher hmod=hmod \
--output hmod-image
