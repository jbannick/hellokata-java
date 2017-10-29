import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class HelloCollectionsManipulation {

    // TODO: LOOK AT DATA TYPES IN MY SORTING.DOC
    // REVERSE, FILL, COPY, SWAP, ADD_ALL

    static Byte[] bytes = { 26, 10, 12, 11 };
    static Byte[] bytes2 = { 126, 110, 112, 111 };
    static String[] words = { "zzz", "mmm", "qqq", "aaa" };
    static Calendar[] dates = { new GregorianCalendar(2017, 12, 31), new GregorianCalendar(2017, 10, 1),
            new GregorianCalendar(2017, 11, 31), new GregorianCalendar(2017, 1, 1) };

    public static void main(String... args) {
        System.out.println("Hello Collections Manipulation!");

        // Arrays.asList() does NOT copy. It creates a collection of REFERENCES.

        List<Byte> listBytes = Arrays.asList(bytes);
        Collections.sort(listBytes);
        System.out.println(listBytes);
        System.out.println("---------------");
        Collections.reverse(listBytes);
        System.out.println(listBytes);
        System.out.println("---------------");
        Collections.swap(listBytes, 0, 3);
        System.out.println(listBytes);
        System.out.println("---------------");
        Collections.copy(listBytes, Arrays.asList(bytes2));
        System.out.println(listBytes);
        System.out.println("---------------");

        // TODO: ADD, REMOVE, WHAT ELSE???
        // Can not change the count of elements in a list that is a REFERENCE to an
        // array
        // listBytes.addAll(Arrays.asList(bytes2)); System.out.println(listBytes);
        List<Byte> listBytes2 = new ArrayList<>();

        System.out.println("==========");

        List<String> listStrings = Arrays.asList(words);
        Collections.reverse(listStrings);
        System.out.println(listStrings);

        System.out.println("==========");

        List<Calendar> listDates = Arrays.asList(dates);
        Collections.reverse(listDates);
        for (Calendar date : listDates) {
            System.out.println(date.getTime().toString()); // THIS IS BUGGY
        }

        // TODO: Complete this Kata
    }
}
