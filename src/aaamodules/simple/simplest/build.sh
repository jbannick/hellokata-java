#!/usr/bin/env bash
mkdir -p out

javac -d out --module-source-path src -m appmod
