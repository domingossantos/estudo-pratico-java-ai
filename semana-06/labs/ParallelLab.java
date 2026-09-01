package course.week6;
import java.util.stream.LongStream;
public final class ParallelLab { public static void main(String[] a){ run(false); run(true); } static void run(boolean p){var s=LongStream.range(0,2_000_000); long t=System.nanoTime(); long sum=(p?s.parallel():s).map(n->n%97).sum(); System.out.printf("parallel=%s nanos=%d checksum=%d%n",p,System.nanoTime()-t,sum);}}
