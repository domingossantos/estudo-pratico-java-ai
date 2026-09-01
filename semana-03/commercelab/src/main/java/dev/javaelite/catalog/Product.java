package dev.javaelite.catalog;

import java.util.Objects;

public final class Product implements Comparable<Product> {
    private final String id;
    private final String name;
    private final Category category;

    public Product(String id, String name, Category category) {
        this.id = Objects.requireNonNull(id, "id");
        this.name = Objects.requireNonNull(name, "name");
        this.category = Objects.requireNonNull(category, "category");
    }

    public String id() { return id; }
    public String name() { return name; }
    public Category category() { return category; }

    @Override public int compareTo(Product other) {
        return id.compareTo(other.id);
    }

    @Override public boolean equals(Object other) {
        return this == other || other instanceof Product product && id.equals(product.id);
    }

    @Override public int hashCode() {
        return id.hashCode();
    }
}
