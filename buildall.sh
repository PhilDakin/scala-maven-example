#!/bin/bash

rm -rf ~/.m2/repository/com/pdakin
rm -rf .bloop
rm -rf .my-bloop

mkdir .my-bloop

mvn -B clean install \
    ch.epfl.scala:bloop-maven-plugin:bloopInstall \
    -Dbloop.configDirectory="$(pwd)/.my-bloop" \
    -DdownloadSources \
    -DskipTests \
    -Dskip \
    -Dmaven.updateconfig.skip=true

ln -s .my-bloop .bloop