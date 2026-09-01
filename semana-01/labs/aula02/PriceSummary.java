package course.week1;

public final class PriceSummary {
    private PriceSummary() {
    }

    public static void main(String[] args) {
        var unitPrice = 19.90;
        var quantity = 3;
        var total = unitPrice * quantity;
        System.out.printf("Total: %.2f%n", total);
    }
}
