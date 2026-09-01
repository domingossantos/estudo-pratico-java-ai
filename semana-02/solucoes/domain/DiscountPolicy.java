package dev.javaelite.domain;

public interface DiscountPolicy {
    Money apply(Money subtotal);
}
