package course.week4;
import java.util.*;
public final class CatalogIndex {public record Product(String id,String name){}
 public void add(Product p){throw new UnsupportedOperationException("Implement add");}
 public Optional<Product> find(String id){throw new UnsupportedOperationException("Implement find");}
 public Map<String,Product> snapshot(){throw new UnsupportedOperationException("Implement snapshot");}
 public void cache(Product p){throw new UnsupportedOperationException("Implement cache");}
 public List<String> cachedIds(){throw new UnsupportedOperationException("Implement LRU");}}
