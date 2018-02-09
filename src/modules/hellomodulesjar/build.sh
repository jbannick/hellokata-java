mkdir -p out
mkdir -p mods

javac -d out/hmjar \
    src/com/kata/hmjar/HelloModulesJar.java \
    src/module-info.java

jar -cfe mods/hmjar.jar com.kata.hmjar.HelloModulesJar -C out/hmjar .
