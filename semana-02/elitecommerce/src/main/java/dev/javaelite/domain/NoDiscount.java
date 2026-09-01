package dev.javaelite.domain;

public final class NoDiscount implements DiscountPolicy {
    @Override
    public Money apply(Money subtotal) {
        throw new UnsupportedOperationException("Implement no discount");
    }
}
