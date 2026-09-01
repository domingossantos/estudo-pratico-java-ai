package dev.javaelite.domain;

public record FixedDiscount(Money discount) implements DiscountPolicy {
    @Override
    public Money apply(Money subtotal) {
        throw new UnsupportedOperationException("Implement fixed discount");
    }
}
