package course.week9;
import java.lang.annotation.*;import java.lang.reflect.InvocationTargetException;import java.util.*;
public final class MetadataTools {@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.RECORD_COMPONENT)public @interface Sensitive{}@Retention(RetentionPolicy.RUNTIME)@Target(ElementType.RECORD_COMPONENT)public @interface Required{}
 public String redactRecord(Record value){var parts=new ArrayList<String>();for(var c:value.getClass().getRecordComponents()){Object v=c.isAnnotationPresent(Sensitive.class)?"***":read(c.getAccessor(),value);parts.add(c.getName()+"="+v);}return value.getClass().getSimpleName()+"["+String.join(", ",parts)+"]";}
 public List<String> validate(Record value){var errors=new ArrayList<String>();for(var c:value.getClass().getRecordComponents())if(c.isAnnotationPresent(Required.class)){var v=read(c.getAccessor(),value);if(v==null||v instanceof String s&&s.isBlank())errors.add(c.getName()+" is required");}return List.copyOf(errors);}
 private Object read(java.lang.reflect.Method m,Record v){try{return m.invoke(v);}catch(IllegalAccessException|InvocationTargetException e){throw new IllegalStateException("Cannot inspect record",e);}}}
