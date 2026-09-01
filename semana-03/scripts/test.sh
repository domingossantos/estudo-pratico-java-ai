#!/usr/bin/env bash
set -euo pipefail
week_dir="$(cd "$(dirname "$0")/.." && pwd)"
build_dir="$week_dir/build/tests"
source_dir="$week_dir/commercelab/src/main/java/dev/javaelite/catalog"
catalog_source="$source_dir/CatalogCollections.java"
if [[ "${1:-}" == "--solution" ]]; then catalog_source="$week_dir/solucoes/catalog/CatalogCollections.java"; elif [[ $# -gt 0 ]]; then echo "usage: $0 [--solution]" >&2; exit 2; fi
rm -rf "$build_dir"; mkdir -p "$build_dir"
javac --release 21 -d "$build_dir" "$source_dir/Product.java" "$source_dir/Category.java" "$source_dir/Permission.java" "$catalog_source" "$week_dir/commercelab/src/test/java/dev/javaelite/catalog/Week3Contract.java"
java -cp "$build_dir" dev.javaelite.catalog.Week3Contract
