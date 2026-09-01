package dev.javaelite.catalog;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class Catalog {
    private final Map<String, Product> productsById = new LinkedHashMap<>();

    public void register(Product product) {
        if (productsById.containsKey(product.id())) {
            throw new IllegalArgumentException("Product id already exists: " + product.id());
        }
        productsById.put(product.id(), product);
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(productsById.get(id));
    }

    public List<Product> listAll() {
        return List.copyOf(productsById.values());
    }
}
