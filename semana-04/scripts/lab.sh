#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build/lab";mkdir -p "$b";javac --release 21 -d "$b" "$w/labs/MapLab.java";java -cp "$b" course.week4.MapLab
