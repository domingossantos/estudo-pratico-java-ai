package course.week5;

import java.math.BigDecimal;
import java.util.List;

public final class Week5Contract {
    public static void main(String[] args) {
        var engine = new PromotionEngine();
        var product = new PromotionEngine.Product("P-1", "BOOKS", new BigDecimal("100.00"));
        check(engine.findById(List.of(product), "P-1").orElseThrow().equals(product), "find existing");
        check(engine.findById(List.of(product), "X").isEmpty(), "missing is empty");
        var tenPercent = new PromotionEngine.Rule(p -> true, price -> price.multiply(new BigDecimal("0.90")));
        var fiveOffBooks = new PromotionEngine.Rule(p -> p.category().equals("BOOKS"), price -> price.subtract(new BigDecimal("5.00")));
        check(engine.apply(product, List.of(tenPercent, fiveOffBooks)).compareTo(new BigDecimal("85.0000")) == 0, "ordered composition");
        check(engine.validProduct().test(product), "valid product");
        check(!engine.validProduct().test(new PromotionEngine.Product(" ", "BOOKS", BigDecimal.TEN)), "invalid id");
        System.out.println("PASS: 5 functional behaviors");
    }
    private static void check(boolean value, String message) { if (!value) throw new AssertionError(message); }
}
