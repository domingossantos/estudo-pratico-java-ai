package dev.javaelite.domain;

import java.math.BigDecimal;
import java.util.Objects;

public record PercentageDiscount(BigDecimal rate) implements DiscountPolicy {
    public PercentageDiscount {
        Objects.requireNonNull(rate, "rate");
        if (rate.signum() < 0 || rate.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException("Rate must be between zero and one");
        }
    }

    @Override public Money apply(Money subtotal) {
        return new Money(subtotal.amount().multiply(BigDecimal.ONE.subtract(rate)), subtotal.currency());
    }
}
