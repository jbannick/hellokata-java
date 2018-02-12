mkdir -p out
mkdir -p mods

javac -d out \
    src/kata/modules/hmlinuximg/HelloModulesLinuxImage.java \
    src/module-info.java

jar -cfe mods/hmlinuximg.jar kata.modules.hmlinuximg.HelloModulesLinuxImage -C out .

$JAVA_HOME/bin/jlink \
--module-path mods/:/Users/johnbannick/Documents/java/jdk-9.0.4_linux-x64/jmods \
--add-modules hellomoduleslinuximage \
--launcher hellomoduleslinuximage=hellomoduleslinuximage \
--output hellomoduleslinuximage-image
