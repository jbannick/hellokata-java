import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class HelloCollectionsSearching {
	
	//TODO: EXAMPLE WITH A COMPARATOR
	//LOOK AT DATA TYPES IN MY SORTING.DOC
	
	static Byte[] bytes = {26, 10, 11, 1};
	static String[] words = {"zzz", "mmm", "qqq", "aaa"};
	static Calendar[] dates = {
			new GregorianCalendar(2017, 12, 31), 
			new GregorianCalendar(2017, 10, 1),
			new GregorianCalendar(2017, 11, 31),
			new GregorianCalendar(2017, 1, 1)};
	
	public static void main(String...args) {
		System.out.println("Hello Collections Searching!");

		List<Byte> byteList = Arrays.asList(bytes);
		Byte byteTarget = Byte.parseByte("10");
		int byteIndex = Collections.binarySearch(byteList, byteTarget);
		System.out.printf("byteTarget %s is at index %s in ", byteTarget, byteIndex);
		System.out.println(byteList);



	}
}
