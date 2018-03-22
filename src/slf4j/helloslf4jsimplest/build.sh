#!/usr/bin/env bash
mkdir -p out

javac -d out \
    -cp ./src:$SLF4J_HOME/slf4j-api-1.8.0-beta2.jar:$SLF4J_HOME/slf4j-simple-1.8.0-beta2.jar \
    src/HelloSLF4JSimplest.java
