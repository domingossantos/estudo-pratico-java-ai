package course.week6;
import java.math.BigDecimal; import java.util.List;
public final class Week6Contract {
 public static void main(String[] a) { var x=new SalesAnalytics(); var s=List.of(new SalesAnalytics.Sale("A","BOOKS",2,new BigDecimal("10")),new SalesAnalytics.Sale("B","TECH",1,new BigDecimal("50")),new SalesAnalytics.Sale("A","BOOKS",3,new BigDecimal("10")));
  eq("100",x.revenue(s)); eq("50",x.revenueByCategory(s).get("BOOKS")); check(x.productsAboveRevenue(s,new BigDecimal("49")).equals(List.of("A","B")),"ranking"); check(x.partitionLargeOrders(s,2).get(true).size()==2,"partition"); System.out.println("PASS: 4 stream behaviors"); }
 static void eq(String e,BigDecimal a){check(a.compareTo(new BigDecimal(e))==0,"expected "+e+" got "+a);} static void check(boolean v,String m){if(!v)throw new AssertionError(m);}
}
