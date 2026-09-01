package course.week7;
import java.time.*;import java.util.Locale;import java.util.regex.Pattern;
public final class PromotionSupport {private static final Pattern SKU=Pattern.compile("^([A-Z]{2,10})-[0-9]{4}$");private final Clock clock;public PromotionSupport(Clock c){clock=c;}
 public boolean active(Instant start,Instant end){var now=clock.instant();return start.isBefore(now)&&now.isBefore(end);}
 public String skuCategory(String sku){var m=SKU.matcher(sku);if(!m.matches())throw new IllegalArgumentException("Invalid SKU");return m.group(1);}
 public String unavailableMessage(Locale locale){return locale.getLanguage().equals("pt")?"Promoção indisponível":"Promotion unavailable";}
 public RuntimeException translate(Exception cause){return new IllegalStateException("Promotion operation failed",cause);}}
