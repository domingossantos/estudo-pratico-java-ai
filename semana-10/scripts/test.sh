#!/usr/bin/env bash
set -euo pipefail
w="$(cd "$(dirname "$0")/.."&&pwd)";b="$w/build";s="$w/src/SecureQuoteClient.java";[[ "${1:-}" == --solution ]]&&s="$w/solucoes/SecureQuoteClient.java";rm -rf "$b";mkdir -p "$b";javac --release 21 --add-modules jdk.httpserver -d "$b" "$s" "$w/test/Week10Contract.java";java --add-modules jdk.httpserver -cp "$b" course.week10.Week10Contract
