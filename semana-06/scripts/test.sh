#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/SalesAnalytics.java"; [[ "${1:-}" == --solution ]]&&s="$w/solucoes/SalesAnalytics.java";rm -rf "$b";mkdir -p "$b";javac --release 21 -d "$b" "$s" "$w/test/Week6Contract.java";java -cp "$b" course.week6.Week6Contract
