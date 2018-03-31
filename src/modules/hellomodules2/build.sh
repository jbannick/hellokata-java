#!/usr/bin/env bash
mkdir -p out

javac -d out \
    src/kata/modules/hmod/HelloModules.java \
    src/kata/modules/hmod/foo/Foo.java \
    src/org/fubar/Bar.java \
    src/module-info.java
