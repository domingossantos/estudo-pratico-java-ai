#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/MetadataTools.java";[[ "${1:-}" == --solution ]]&&s="$w/solucoes/MetadataTools.java";rm -rf "$b";mkdir -p "$b";javac --release 21 -d "$b" "$s" "$w/test/Week9Contract.java";java -cp "$b" course.week9.Week9Contract
