#!/usr/bin/env bash
mkdir -p out

javac -d out src/org/fubar/app/HelloJARManifest.java

cp src/META-INF/MANIFEST.MF .

jar -cfvm hellojarmanifest.jar MANIFEST.MF -C out .
