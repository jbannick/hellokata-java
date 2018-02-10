mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmjar/HelloModulesJAR.java \
    src/module-info.java

jar -cfe mods/hmjar.jar kata.modules.hmjar.HelloModulesJAR -C out .
