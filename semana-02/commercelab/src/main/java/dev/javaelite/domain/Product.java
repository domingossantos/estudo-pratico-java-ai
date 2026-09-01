package dev.javaelite.domain;

public record Product(ProductId id, String name, Money price) {
    public Product {
        throw new UnsupportedOperationException("Implement Product validation");
    }
}
