#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/PromotionSupport.java";[[ "${1:-}" == --solution ]]&&s="$w/solucoes/PromotionSupport.java";rm -rf "$b";mkdir -p "$b";javac --release 21 -d "$b" "$s" "$w/test/Week7Contract.java";java -cp "$b" course.week7.Week7Contract
