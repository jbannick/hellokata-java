import java.util.Collection;
import java.util.EnumMap;
import java.util.Set;

public class HelloEnumMap {
	
	enum Status {OK, WARN, ERROR}

	public static void main(String...args) {
		System.out.println("Hello EnumMap!");
		EnumMap<Status,Integer> statusCounts = new EnumMap<Status,Integer>(Status.class);
		statusCounts.put(Status.OK, 10);
		statusCounts.put(Status.WARN, 20);
		statusCounts.put(Status.ERROR, 5);
		
		int size = statusCounts.size();
		int countErrors = statusCounts.get(Status.ERROR);
		
		System.out.printf("Status counts: %s\n", statusCounts);
		System.out.printf("size = %s\n", size);
		System.out.printf("countErrors = %s\n", countErrors);

		Set<Status> keys = statusCounts.keySet();
		Collection<Integer> values = statusCounts.values();
		
		boolean containsKey = statusCounts.containsKey(Status.WARN);
		boolean containsValue = statusCounts.containsValue(99);
		
		System.out.printf("keys = %s\n", keys);
		System.out.printf("values = %s\n", values);
		System.out.printf("Contains key Status.WARN = %s\n", containsKey);
		System.out.printf("Contains value 99 = %s\n", containsValue);

		statusCounts.replace(Status.ERROR, statusCounts.get(Status.ERROR) + 1);
		System.out.printf("After replace with incremented Status.ERROR: %s\n", statusCounts);

		statusCounts.remove(Status.ERROR);
		System.out.printf("After removing Status.ERROR: %s\n", statusCounts);
		
		statusCounts.clear();
		System.out.printf("After Clearing all entries: %s\n", statusCounts);
	}
}
