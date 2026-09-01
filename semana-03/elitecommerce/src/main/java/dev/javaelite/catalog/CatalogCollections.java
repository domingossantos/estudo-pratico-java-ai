package dev.javaelite.catalog;

import java.util.List;
import java.util.Set;

public final class CatalogCollections {
    public void add(Product product) { throw new UnsupportedOperationException("Implement add"); }
    public void tag(String productId, String tag) { throw new UnsupportedOperationException("Implement tag"); }
    public Set<String> tagsOf(String productId) { throw new UnsupportedOperationException("Implement tagsOf"); }
    public void favorite(String productId) { throw new UnsupportedOperationException("Implement favorite"); }
    public List<String> favorites() { throw new UnsupportedOperationException("Implement favorites"); }
    public List<Product> byCategory(Category category) { throw new UnsupportedOperationException("Implement byCategory"); }
}
