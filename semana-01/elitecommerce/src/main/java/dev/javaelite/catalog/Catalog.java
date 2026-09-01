package dev.javaelite.catalog;

import java.util.List;
import java.util.Optional;

public final class Catalog {
    public void register(Product product) {
        throw new UnsupportedOperationException("Implement register");
    }

    public Optional<Product> findById(String id) {
        throw new UnsupportedOperationException("Implement findById");
    }

    public List<Product> listAll() {
        throw new UnsupportedOperationException("Implement listAll");
    }
}
