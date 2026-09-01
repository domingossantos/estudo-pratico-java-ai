package dev.javaelite.domain;

import java.math.BigDecimal;
import java.util.Currency;

public final class Week2Contract {
    private static final Currency BRL = Currency.getInstance("BRL");

    public static void main(String[] args) {
        rejectsBlankProductId();
        addsMoneyWithSameCurrency();
        rejectsMoneyWithDifferentCurrency();
        rejectsInvalidProduct();
        formatsEveryPaymentResult();
        appliesPolymorphicDiscountsWithoutNegativeTotals();
        System.out.println("PASS: 6 Java modern modeling behaviors");
    }

    private static void rejectsBlankProductId() {
        assertThrows(IllegalArgumentException.class, () -> new ProductId("  "), "blank id");
    }

    private static void addsMoneyWithSameCurrency() {
        var total = money("10.25").add(money("4.75"));
        assertEquals(new BigDecimal("15.00"), total.amount(), "money sum");
    }

    private static void rejectsMoneyWithDifferentCurrency() {
        var usd = new Money(new BigDecimal("1.00"), Currency.getInstance("USD"));
        assertThrows(IllegalArgumentException.class, () -> money("1.00").add(usd), "currency mismatch");
    }

    private static void rejectsInvalidProduct() {
        assertThrows(IllegalArgumentException.class,
                () -> new Product(new ProductId("P-1"), " ", money("10.00")), "blank product name");
    }

    private static void formatsEveryPaymentResult() {
        assertEquals("Approved: TX-1", PaymentMessage.from(new PaymentResult.Approved("TX-1")), "approved");
        assertEquals("Rejected: limit", PaymentMessage.from(new PaymentResult.Rejected("limit")), "rejected");
        assertEquals("Pending: P-1", PaymentMessage.from(new PaymentResult.Pending("P-1")), "pending");
    }

    private static void appliesPolymorphicDiscountsWithoutNegativeTotals() {
        assertEquals(new BigDecimal("100.00"), new NoDiscount().apply(money("100.00")).amount(), "none");
        assertEquals(new BigDecimal("90.0000"),
                new PercentageDiscount(new BigDecimal("0.10")).apply(money("100.00")).amount(), "percentage");
        assertEquals(BigDecimal.ZERO, new FixedDiscount(money("150.00")).apply(money("100.00")).amount(), "floor");
    }

    private static Money money(String amount) { return new Money(new BigDecimal(amount), BRL); }

    private static void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) throw new AssertionError(message + ": expected=" + expected + ", actual=" + actual);
    }

    private static void assertThrows(Class<? extends Throwable> expected, Runnable action, String message) {
        try { action.run(); } catch (Throwable error) {
            if (expected.isInstance(error)) return;
            throw new AssertionError(message + ": wrong exception " + error, error);
        }
        throw new AssertionError(message + ": expected " + expected.getSimpleName());
    }
}
