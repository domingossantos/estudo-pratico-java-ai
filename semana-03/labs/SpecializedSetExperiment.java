package course.week3;

import java.util.EnumSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public final class SpecializedSetExperiment {
    enum Permission { READ, WRITE, DELETE }

    public static void main(String[] args) {
        var permissions = EnumSet.of(Permission.READ, Permission.WRITE);
        var subscribers = new CopyOnWriteArraySet<>(java.util.List.of("ana", "bia", "ana"));
        var ranking = new ConcurrentSkipListSet<>(java.util.List.of(30, 10, 20, 10));
        System.out.println("permissions=" + permissions);
        System.out.println("subscribers=" + subscribers);
        System.out.println("ranking=" + ranking);
    }
}
