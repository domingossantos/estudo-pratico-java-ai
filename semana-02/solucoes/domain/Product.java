package dev.javaelite.domain;

import java.util.Objects;

public record Product(ProductId id, String name, Money price) {
    public Product {
        Objects.requireNonNull(id, "id");
        Objects.requireNonNull(price, "price");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Product name is required");
        name = name.trim();
    }
}
