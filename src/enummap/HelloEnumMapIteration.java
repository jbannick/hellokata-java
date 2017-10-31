import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HelloEnumMapIteration {
    enum Status {
        OK, WARN, ERROR
    }

    public static void main(String... args) {
        System.out.println("Hello EnumMap Iteration!");

        EnumMap<Status, Integer> statusCounts = new EnumMap<Status, Integer>(Status.class);
        statusCounts.put(Status.OK, 10);
        statusCounts.put(Status.WARN, 20);
        statusCounts.put(Status.ERROR, 3);

        System.out.println("Iterator<Status> it = statusCounts.keySet().iterator(); while (it.hasNext()) {...");
        Iterator<Status> it = statusCounts.keySet().iterator();
        while (it.hasNext()) {
            Status key = it.next();
            Integer value = statusCounts.get(key);
            System.out.printf("%s %s\n", key, value);
        }

        System.out.println("for (Status s : statusCounts.keySet()) {...");
        for (Status s : statusCounts.keySet()) {
            System.out.printf("%s %s\n", s, statusCounts.get(s));
        }

        System.out.println("for (Entry<Status,Integer> entry : statusCounts.entrySet()) {...");
        for (Entry<Status, Integer> entry : statusCounts.entrySet()) {
            System.out.printf("%s\n", entry);
        }

        System.out.println("statusCounts.forEach((key, value) -> {...");
        statusCounts.forEach((key, value) -> {
            System.out.printf("%s %s\n", key, value);
        });

        System.out.println("statusCounts.entrySet().stream().forEach(System.out::println);");
        statusCounts.entrySet().stream().forEach(System.out::println);
    }
}
