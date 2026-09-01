package dev.javaelite.domain;

public sealed interface PaymentResult {
    record Approved(String transactionId) implements PaymentResult {}
    record Rejected(String reason) implements PaymentResult {}
    record Pending(String protocol) implements PaymentResult {}
}
