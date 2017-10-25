import java.util.EnumMap;

enum Status {OK, WARN, ERROR}

public class HelloEnumMapSimplest {
	public static void main(String...args) {
		System.out.println("Hello EnumMap Simplest!");
		EnumMap<Status,Integer> statusCounts = new EnumMap<Status,Integer>(Status.class);
		statusCounts.put(Status.OK, 10);
		statusCounts.put(Status.WARN, 20);
		statusCounts.put(Status.ERROR, 3);
		int countErrors = statusCounts.get(Status.ERROR);
		
		System.out.printf("Status counts: %s\n", statusCounts);
		System.out.printf("countErrors = %s\n", countErrors);
	}
}