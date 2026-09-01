package course.week5;
import java.math.BigDecimal;import java.util.List;import java.util.Optional;import java.util.function.Function;import java.util.function.Predicate;import java.util.function.UnaryOperator;
public final class PromotionEngine {public record Product(String id,String category,BigDecimal price){}public record Rule(Predicate<Product> eligibility,UnaryOperator<BigDecimal> priceChange){}
 public Optional<Product> findById(List<Product> products,String id){return products.stream().filter(p->p.id().equals(id)).findFirst();}
 public BigDecimal apply(Product product,List<Rule> rules){Function<BigDecimal,BigDecimal> pipeline=rules.stream().filter(r->r.eligibility().test(product)).map(r->(Function<BigDecimal,BigDecimal>)r.priceChange()).reduce(Function.identity(),Function::andThen);return pipeline.apply(product.price());}
 public Predicate<Product> validProduct(){return p->p!=null&&p.id()!=null&&!p.id().isBlank()&&p.category()!=null&&!p.category().isBlank()&&p.price()!=null&&p.price().signum()>=0;}}
