package dev.javaelite.catalog;

import java.util.List;

public final class CatalogTest {
    private CatalogTest() {
    }

    public static void main(String[] args) {
        registersAndFindsProductById();
        rejectsDuplicateProductId();
        representsMissingProductExplicitly();
        protectsCatalogFromExternalListMutation();
        System.out.println("PASS: 4 catalog behaviors");
    }

    private static void registersAndFindsProductById() {
        var catalog = new Catalog();
        var keyboard = new Product("P-100", "Mechanical Keyboard");

        catalog.register(keyboard);

        assertEquals(keyboard, catalog.findById("P-100").orElseThrow(),
                "registered product should be found by id");
    }

    private static void rejectsDuplicateProductId() {
        var catalog = new Catalog();
        catalog.register(new Product("P-100", "Mechanical Keyboard"));

        assertThrows(IllegalArgumentException.class,
                () -> catalog.register(new Product("P-100", "Other Keyboard")),
                "duplicate product id should be rejected");
    }

    private static void representsMissingProductExplicitly() {
        var catalog = new Catalog();

        assertTrue(catalog.findById("missing").isEmpty(),
                "missing product should produce an empty result");
    }

    private static void protectsCatalogFromExternalListMutation() {
        var catalog = new Catalog();
        catalog.register(new Product("P-100", "Mechanical Keyboard"));
        List<Product> listed = catalog.listAll();

        assertThrows(UnsupportedOperationException.class,
                () -> listed.add(new Product("P-200", "Mouse")),
                "catalog listing should not be externally mutable");
        assertEquals(1, catalog.listAll().size(),
                "failed external mutation should preserve catalog contents");
    }

    private static void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) {
            throw new AssertionError(message + ": expected=" + expected + ", actual=" + actual);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static void assertThrows(Class<? extends Throwable> expected, Runnable action, String message) {
        try {
            action.run();
        } catch (Throwable error) {
            if (expected.isInstance(error)) {
                return;
            }
            throw new AssertionError(message + ": wrong exception " + error, error);
        }
        throw new AssertionError(message + ": expected " + expected.getSimpleName());
    }
}
