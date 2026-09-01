package course.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ListExperiment {
    public static void main(String[] args) {
        compare("ArrayList", new ArrayList<>());
        compare("LinkedList", new LinkedList<>());
    }

    private static void compare(String name, List<Integer> values) {
        var start = System.nanoTime();
        for (int i = 0; i < 20_000; i++) values.add(0, i);
        var insertNanos = System.nanoTime() - start;
        start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < values.size(); i += 100) sum += values.get(i);
        var accessNanos = System.nanoTime() - start;
        System.out.printf("%s insert=%d access=%d checksum=%d%n", name, insertNanos, accessNanos, sum);
    }
}
