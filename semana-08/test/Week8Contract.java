package course.week8;
import java.nio.file.*; import java.nio.charset.StandardCharsets;
public final class Week8Contract {public static void main(String[]a)throws Exception{var f=Files.createTempFile("catalog",".csv");try{Files.writeString(f,"id,name\nP-1,Keyboard\nP-2,Mouse\n",StandardCharsets.UTF_8);var p=new CsvCatalogImporter().importFile(f);if(p.size()!=2||!p.get(0).id().equals("P-1"))throw new AssertionError("CSV import");System.out.println("PASS: CSV import behavior");}finally{Files.deleteIfExists(f);}}}
