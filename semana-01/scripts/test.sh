#!/usr/bin/env bash
set -euo pipefail

week_dir="$(cd "$(dirname "$0")/.." && pwd)"
build_dir="$week_dir/build/tests"
main_dir="$week_dir/commercelab/src/main/java"
test_dir="$week_dir/commercelab/src/test/java"
catalog_source="$main_dir/dev/javaelite/catalog/Catalog.java"

if [[ "${1:-}" == "--solution" ]]; then
  catalog_source="$week_dir/solucoes/aula-04/dev/javaelite/catalog/Catalog.java"
elif [[ $# -gt 0 ]]; then
  echo "usage: $0 [--solution]" >&2
  exit 2
fi

rm -rf "$build_dir"
mkdir -p "$build_dir"

javac --release 21 -d "$build_dir" \
  "$main_dir/dev/javaelite/catalog/Product.java" \
  "$catalog_source" \
  "$test_dir/dev/javaelite/catalog/CatalogTest.java"

java -cp "$build_dir" dev.javaelite.catalog.CatalogTest
