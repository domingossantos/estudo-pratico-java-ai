package course.week6;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public final class SalesAnalytics {
    public record Sale(String product, String category, int quantity, BigDecimal unitPrice) {}
    public BigDecimal revenue(List<Sale> sales) { throw new UnsupportedOperationException("Implement revenue"); }
    public Map<String, BigDecimal> revenueByCategory(List<Sale> sales) { throw new UnsupportedOperationException("Implement grouping"); }
    public List<String> productsAboveRevenue(List<Sale> sales, BigDecimal minimum) { throw new UnsupportedOperationException("Implement ranking"); }
    public Map<Boolean, List<Sale>> partitionLargeOrders(List<Sale> sales, int minimumQuantity) { throw new UnsupportedOperationException("Implement partition"); }
}
