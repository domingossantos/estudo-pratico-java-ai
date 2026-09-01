package course.week4;
import java.util.*;
public final class CatalogIndex {public record Product(String id,String name){}private final Map<String,Product> index=new HashMap<>();private final Map<String,Product> cache=new LinkedHashMap<>(4,.75f,true){protected boolean removeEldestEntry(Map.Entry<String,Product> e){return size()>2;}};
 public void add(Product p){index.put(p.id(),p);}public Optional<Product> find(String id){return Optional.ofNullable(index.get(id));}public Map<String,Product> snapshot(){return Map.copyOf(index);}public void cache(Product p){cache.put(p.id(),p);}public List<String> cachedIds(){return List.copyOf(cache.keySet());}}
