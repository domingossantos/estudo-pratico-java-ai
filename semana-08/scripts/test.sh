#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/CsvCatalogImporter.java";[[ "${1:-}" == --solution ]]&&s="$w/solucoes/CsvCatalogImporter.java";rm -rf "$b";mkdir -p "$b";javac --release 21 -d "$b" "$s" "$w/test/Week8Contract.java";java -cp "$b" course.week8.Week8Contract
