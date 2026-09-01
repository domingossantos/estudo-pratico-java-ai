package dev.javaelite.catalog;

import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class Week3Contract {
    public static void main(String[] args) {
        keepsCatalogInsertionOrder();
        keepsTagsUniqueAndSorted();
        keepsFavoritesUniqueInFirstInsertionOrder();
        filtersProductsByCategory();
        protectsReturnedCollections();
        keepsEqualityAndOrderingConsistent();
        System.out.println("PASS: 6 collection behaviors");
    }

    private static CatalogCollections catalog() {
        var catalog = new CatalogCollections();
        catalog.add(new Product("P-2", "Mouse", Category.ELECTRONICS));
        catalog.add(new Product("P-1", "Java Book", Category.BOOKS));
        catalog.add(new Product("P-3", "Keyboard", Category.ELECTRONICS));
        return catalog;
    }

    private static void keepsCatalogInsertionOrder() {
        var result = catalog().byCategory(Category.ELECTRONICS);
        assertEquals(List.of("P-2", "P-3"), result.stream().map(Product::id).toList(), "category order");
    }

    private static void keepsTagsUniqueAndSorted() {
        var catalog = catalog();
        catalog.tag("P-2", "wireless"); catalog.tag("P-2", "accessory"); catalog.tag("P-2", "wireless");
        assertEquals(Set.of("accessory", "wireless"), catalog.tagsOf("P-2"), "unique tags");
        assertEquals(List.of("accessory", "wireless"), List.copyOf(catalog.tagsOf("P-2")), "sorted tags");
    }

    private static void keepsFavoritesUniqueInFirstInsertionOrder() {
        var catalog = catalog();
        catalog.favorite("P-3"); catalog.favorite("P-2"); catalog.favorite("P-3");
        assertEquals(List.of("P-3", "P-2"), catalog.favorites(), "favorite order and uniqueness");
    }

    private static void filtersProductsByCategory() {
        assertEquals(2, catalog().byCategory(Category.ELECTRONICS).size(), "category filter");
    }

    private static void protectsReturnedCollections() {
        var catalog = catalog(); catalog.tag("P-2", "wireless"); catalog.favorite("P-2");
        assertThrows(UnsupportedOperationException.class, () -> catalog.tagsOf("P-2").add("external"), "tags immutable");
        assertThrows(UnsupportedOperationException.class, () -> catalog.favorites().add("external"), "favorites immutable");
    }

    private static void keepsEqualityAndOrderingConsistent() {
        var original = new Product("P-1", "Java Book", Category.BOOKS);
        var renamed = new Product("P-1", "Modern Java Book", Category.BOOKS);
        assertEquals(1, new HashSet<>(List.of(original, renamed)).size(), "hash identity by id");
        assertEquals(1, new TreeSet<>(List.of(original, renamed)).size(), "sorted identity by id");
    }

    private static void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) throw new AssertionError(message + ": expected=" + expected + ", actual=" + actual);
    }
    private static void assertThrows(Class<? extends Throwable> expected, Runnable action, String message) {
        try { action.run(); } catch (Throwable error) { if (expected.isInstance(error)) return; throw new AssertionError(message, error); }
        throw new AssertionError(message + ": expected " + expected.getSimpleName());
    }
}
