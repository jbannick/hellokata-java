#!/usr/bin/env bash
mkdir -p out

javac -d out/appmod \
    src/appmod/kata/app/HelloModJAR.java \
    src/appmod/module-info.java

jar -cfe appmod.jar kata.app.HelloModJAR -C out/appmod .
