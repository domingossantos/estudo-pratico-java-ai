package dev.javaelite.domain;

import java.math.BigDecimal;

public record PercentageDiscount(BigDecimal rate) implements DiscountPolicy {
    @Override
    public Money apply(Money subtotal) {
        throw new UnsupportedOperationException("Implement percentage discount");
    }
}
