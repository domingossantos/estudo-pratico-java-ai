#!/usr/bin/env bash
set -euo pipefail
week_dir="$(cd "$(dirname "$0")/.." && pwd)"
build_dir="$week_dir/build/tests"
source_dir="$week_dir/commercelab/src/main/java/dev/javaelite/domain"
if [[ "${1:-}" == "--solution" ]]; then source_dir="$week_dir/solucoes/domain"; elif [[ $# -gt 0 ]]; then echo "usage: $0 [--solution]" >&2; exit 2; fi
rm -rf "$build_dir"
mkdir -p "$build_dir"
javac --release 21 -d "$build_dir" "$source_dir"/*.java "$week_dir/commercelab/src/test/java/dev/javaelite/domain/Week2Contract.java"
java -cp "$build_dir" dev.javaelite.domain.Week2Contract
