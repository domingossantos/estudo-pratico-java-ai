package course.week6;
import java.math.BigDecimal;import java.util.*;import java.util.stream.Collectors;
public final class SalesAnalytics {public record Sale(String product,String category,int quantity,BigDecimal unitPrice){}
 private BigDecimal value(Sale s){return s.unitPrice().multiply(BigDecimal.valueOf(s.quantity()));}
 public BigDecimal revenue(List<Sale>s){return s.stream().map(this::value).reduce(BigDecimal.ZERO,BigDecimal::add);}
 public Map<String,BigDecimal> revenueByCategory(List<Sale>s){return s.stream().collect(Collectors.groupingBy(Sale::category,Collectors.reducing(BigDecimal.ZERO,this::value,BigDecimal::add)));}
 public List<String> productsAboveRevenue(List<Sale>s,BigDecimal m){return s.stream().collect(Collectors.groupingBy(Sale::product,Collectors.reducing(BigDecimal.ZERO,this::value,BigDecimal::add))).entrySet().stream().filter(e->e.getValue().compareTo(m)>0).map(Map.Entry::getKey).sorted().toList();}
 public Map<Boolean,List<Sale>> partitionLargeOrders(List<Sale>s,int q){return s.stream().collect(Collectors.partitioningBy(v->v.quantity()>=q));}}
