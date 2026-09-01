#!/usr/bin/env bash
set -euo pipefail
week_dir="$(cd "$(dirname "$0")/.." && pwd)"
build_dir="$week_dir/build/labs"
rm -rf "$build_dir"; mkdir -p "$build_dir"
javac --release 21 -d "$build_dir" "$week_dir"/labs/*.java
java -cp "$build_dir" course.week3.ListExperiment
java -cp "$build_dir" course.week3.SetExperiment
java -cp "$build_dir" course.week3.SpecializedSetExperiment
