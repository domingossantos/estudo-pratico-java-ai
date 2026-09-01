#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/CatalogIndex.java";[[ "${1:-}" == --solution ]]&&s="$w/solucoes/CatalogIndex.java";rm -rf "$b";mkdir -p "$b";javac --release 21 -d "$b" "$s" "$w/test/Week4Contract.java";java -cp "$b" course.week4.Week4Contract
