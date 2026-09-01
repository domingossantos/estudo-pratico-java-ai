package dev.javaelite.catalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class CatalogCollections {
    private final List<Product> products = new ArrayList<>();
    private final List<TagBucket> tagBuckets = new ArrayList<>();
    private final Set<String> favorites = new LinkedHashSet<>();

    public void add(Product product) {
        products.add(product);
    }

    public void tag(String productId, String tag) {
        TagBucket bucket = tagBuckets.stream()
                .filter(item -> item.productId.equals(productId))
                .findFirst()
                .orElseGet(() -> createBucket(productId));
        bucket.tags.add(tag);
    }

    public Set<String> tagsOf(String productId) {
        return tagBuckets.stream()
                .filter(item -> item.productId.equals(productId))
                .findFirst()
                .map(item -> Collections.unmodifiableSet(new TreeSet<>(item.tags)))
                .orElseGet(Set::of);
    }

    public void favorite(String productId) {
        favorites.add(productId);
    }

    public List<String> favorites() {
        return List.copyOf(favorites);
    }

    public List<Product> byCategory(Category category) {
        return products.stream().filter(product -> product.category() == category).toList();
    }

    private TagBucket createBucket(String productId) {
        var bucket = new TagBucket(productId);
        tagBuckets.add(bucket);
        return bucket;
    }

    private static final class TagBucket {
        private final String productId;
        private final Set<String> tags = new TreeSet<>();

        private TagBucket(String productId) {
            this.productId = productId;
        }
    }
}
