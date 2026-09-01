#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";test -f "$w/build-examples/maven/pom.xml";test -f "$w/build-examples/gradle/build.gradle.kts";echo "PASS: Maven and Gradle examples present"
