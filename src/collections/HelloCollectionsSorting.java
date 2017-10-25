import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class HelloCollectionsSorting {
	
	//TODO: SORTING COLLECTIONS, SORTING ARRAYS, COMPARATORS, WHAT ELSE?
	//LOOK AT DATA TYPES IN MY SORTING.DOC
	//TODO: EXAMPLE WITH A COMPARATOR
	
	static Byte[] bytes = {26, 10, 11, 1};
	static String[] words = {"zzz", "mmm", "qqq", "aaa"};
	static Calendar[] dates = {
			new GregorianCalendar(2017, 12, 31), 
			new GregorianCalendar(2017, 10, 1),
			new GregorianCalendar(2017, 11, 31),
			new GregorianCalendar(2017, 1, 1)};
	
	public static void main(String...args) {
		System.out.println("Hello Collections Sorting!");

		List<Byte> listBytes = Arrays.asList(bytes);
		System.out.println(listBytes);
		System.out.println("---------------");
		Collections.sort(listBytes); System.out.println(listBytes);

		System.out.println("==========");

		List<String> listStrings = Arrays.asList(words);
		System.out.println(listStrings);
		System.out.println("---------------");
		Collections.sort(listStrings); System.out.println(listStrings);

		System.out.println("==========");

		List<Calendar> listDates = Arrays.asList(dates);
		for (Calendar date : listDates) {
			System.out.println(date.getTime().toString()); // THIS IS BUGGY
		}
		System.out.println("---------------");
		Collections.sort(listDates);
		for (Calendar date : listDates) {
			System.out.println(date.getTime().toString()); // THIS IS BUGGY
		}

		System.out.println("==========");

	}
}
