package dev.javaelite.domain;

import java.math.BigDecimal;
import java.util.Currency;

public record Money(BigDecimal amount, Currency currency) {
    public Money {
        throw new UnsupportedOperationException("Implement Money validation");
    }

    public Money add(Money other) {
        throw new UnsupportedOperationException("Implement Money.add");
    }
}
