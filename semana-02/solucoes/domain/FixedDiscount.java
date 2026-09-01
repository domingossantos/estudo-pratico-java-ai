package dev.javaelite.domain;

import java.math.BigDecimal;
import java.util.Objects;

public record FixedDiscount(Money discount) implements DiscountPolicy {
    public FixedDiscount { Objects.requireNonNull(discount, "discount"); }

    @Override public Money apply(Money subtotal) {
        subtotal.requireSameCurrency(discount);
        BigDecimal result = subtotal.amount().subtract(discount.amount()).max(BigDecimal.ZERO);
        return new Money(result, subtotal.currency());
    }
}
