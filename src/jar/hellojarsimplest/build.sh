#!/usr/bin/env bash
mkdir -p out

javac -d out src/org/fubar/app/HelloJARSimplest.java

jar -cvfe hellojarsimplest.jar org.fubar.app.HelloJARSimplest -C out .
