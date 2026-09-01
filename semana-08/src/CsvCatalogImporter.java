package course.week8;
import java.io.IOException; import java.nio.file.Path; import java.util.List;
public final class CsvCatalogImporter {public record Product(String id,String name){} public List<Product> importFile(Path path)throws IOException{throw new UnsupportedOperationException("Implement NIO import");}}
