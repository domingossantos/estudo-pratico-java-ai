package course.week9;
import java.lang.annotation.*; import java.util.List;
public final class MetadataTools {
 @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.RECORD_COMPONENT) public @interface Sensitive {}
 @Retention(RetentionPolicy.RUNTIME) @Target(ElementType.RECORD_COMPONENT) public @interface Required {}
 public String redactRecord(Record value){throw new UnsupportedOperationException("Implement redaction");}
 public List<String> validate(Record value){throw new UnsupportedOperationException("Implement validation");}
}
