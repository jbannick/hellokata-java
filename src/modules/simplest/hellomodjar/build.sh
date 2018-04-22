#!/usr/bin/env bash
mkdir -p out
mkdir -p mods

javac -d out/appmod \
    src/appmod/kata/app/HelloModJAR.java \
    src/appmod/module-info.java

jar -cfe mods/appmod.jar kata.app.HelloModJAR -C out/appmod .
