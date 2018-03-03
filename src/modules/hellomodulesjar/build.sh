mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmod/HelloModules.java \
    src/module-info.java

jar -cfe mods/hmod.jar kata.modules.hmod.HelloModules -C out .
