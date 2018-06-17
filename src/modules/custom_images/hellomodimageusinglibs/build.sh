#!/usr/bin/env bash
rm -rf out
rm -rf mods
rm -rf libs
rm -rf work

mkdir -p out
mkdir -p mods
mkdir -p libs
mkdir -p work

rm -rf appmod-image

ROOT_DIR=$PWD

. build_lib1.sh
. build_lib2.sh
. build_lib3.sh
. build_lib4.sh
. build_app.sh
