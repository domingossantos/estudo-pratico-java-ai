#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.." && pwd)"; b="$w/build"; s="$w/src/PromotionEngine.java"
if [[ "${1:-}" == "--solution" ]]; then s="$w/solucoes/PromotionEngine.java"; elif [[ $# -gt 0 ]]; then exit 2; fi
rm -rf "$b"; mkdir -p "$b"; javac --release 21 -d "$b" "$s" "$w/test/Week5Contract.java"; java -cp "$b" course.week5.Week5Contract
