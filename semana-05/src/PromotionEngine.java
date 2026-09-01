package course.week5;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public final class PromotionEngine {
    public record Product(String id, String category, BigDecimal price) {}
    public record Rule(Predicate<Product> eligibility, UnaryOperator<BigDecimal> priceChange) {}

    public Optional<Product> findById(List<Product> products, String id) { throw new UnsupportedOperationException("Implement findById"); }
    public BigDecimal apply(Product product, List<Rule> rules) { throw new UnsupportedOperationException("Implement apply"); }
    public Predicate<Product> validProduct() { throw new UnsupportedOperationException("Implement validProduct"); }
}
