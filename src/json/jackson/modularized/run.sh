#!/usr/bin/env bash

CP=lib/jackson-annotations-2.9.0.jar:
CP+=lib/jackson-core-2.9.0.jar

java -cp $CP --module-path mods:out \
--module appmod/kata.app.HelloJSONJacksonMod
