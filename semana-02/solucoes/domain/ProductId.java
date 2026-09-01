package dev.javaelite.domain;

public record ProductId(String value) {
    public ProductId {
        if (value == null || value.isBlank()) throw new IllegalArgumentException("Product id is required");
        value = value.trim();
    }
}
