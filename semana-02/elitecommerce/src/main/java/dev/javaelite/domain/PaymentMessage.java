package dev.javaelite.domain;

public final class PaymentMessage {
    private PaymentMessage() {}

    public static String from(PaymentResult result) {
        throw new UnsupportedOperationException("Implement exhaustive payment message");
    }
}
