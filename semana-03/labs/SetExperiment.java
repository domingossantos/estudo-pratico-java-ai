package course.week3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public final class SetExperiment {
    public static void main(String[] args) {
        show("HashSet", new HashSet<>());
        show("LinkedHashSet", new LinkedHashSet<>());
        show("TreeSet", new TreeSet<>());
    }

    private static void show(String name, Set<String> values) {
        values.add("mouse"); values.add("keyboard"); values.add("display"); values.add("mouse");
        System.out.println(name + " size=" + values.size() + " values=" + values);
    }
}
