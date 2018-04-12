#!/usr/bin/env bash

CP=lib/jackson-annotations-2.9.0.jar:
CP+=lib/jackson-core-2.9.0.jar:
CP+=lib/jackson-databind-2.9.0.jar

java -cp out:$CP kata.app.HelloJSONJackson
