package course.week7;
import java.time.*; import java.util.Locale;
public final class PromotionSupport {
 private final Clock clock; public PromotionSupport(Clock clock){this.clock=clock;}
 public boolean active(Instant start,Instant end){throw new UnsupportedOperationException("Implement active");}
 public String skuCategory(String sku){throw new UnsupportedOperationException("Implement sku parser");}
 public String unavailableMessage(Locale locale){throw new UnsupportedOperationException("Implement i18n");}
 public RuntimeException translate(Exception cause){throw new UnsupportedOperationException("Implement translation");}
}
