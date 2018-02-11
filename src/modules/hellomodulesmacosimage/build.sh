mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmmacosimg/HelloModulesMacOSImage.java \
    src/module-info.java

jar -cfe mods/hmmacosimg.jar kata.modules.hmmacosimg.HelloModulesMacOSImage -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:$JAVA_HOME/jmods \
--add-modules hellomodulesmacosimage \
--launcher hellomodulesmacosimage=hellomodulesmacosimage \
--output hellomodulesmacosimage-image
