package dev.javaelite.domain;

public final class PaymentMessage {
    private PaymentMessage() {}

    public static String from(PaymentResult result) {
        return switch (result) {
            case PaymentResult.Approved approved -> "Approved: " + approved.transactionId();
            case PaymentResult.Rejected rejected -> "Rejected: " + rejected.reason();
            case PaymentResult.Pending pending -> "Pending: " + pending.protocol();
        };
    }
}
