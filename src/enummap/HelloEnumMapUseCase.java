import java.util.EnumMap;

public class HelloEnumMapUseCase {
    enum Status {
        OK, WARN, ERROR
    }

    public static void main(String... args) {
        System.out.println("Hello EnumMap Use Case!");

        EnumMap<Status, Integer> weekdayStatusCounts = new EnumMap<Status, Integer>(Status.class);
        weekdayStatusCounts.put(Status.OK, 10);
        weekdayStatusCounts.put(Status.WARN, 20);
        weekdayStatusCounts.put(Status.ERROR, 3);

        EnumMap<Status, Integer> weekendStatusCounts = new EnumMap<Status, Integer>(Status.class);
        weekendStatusCounts.put(Status.OK, 15);
        weekendStatusCounts.put(Status.WARN, 22);
        weekendStatusCounts.put(Status.ERROR, 0);

        System.out.printf("Weekday: %s\n", weekdayStatusCounts);
        System.out.printf("Weekend: %s\n", weekendStatusCounts);
    }
}
