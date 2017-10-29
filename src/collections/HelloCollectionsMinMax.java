import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class HelloCollectionsMinMax {

    // LOOK AT DATA TYPES IN MY SORTING.DOC

    static Byte[] bytes = { 26, 10, 11, 1 };
    static String[] words = { "zzz", "mmm", "qqq", "aaa" };
    static Calendar[] dates = { new GregorianCalendar(2017, 12, 31), new GregorianCalendar(2017, 10, 1),
            new GregorianCalendar(2017, 11, 31), new GregorianCalendar(2017, 1, 1) };

    public static void main(String... args) {
        System.out.println("Hello Collections Min Max!");

        List<Byte> listBytes = Arrays.asList(bytes);
        Collections.sort(listBytes);
        System.out.println(listBytes);

        System.out.printf("bytes: min = %s, max = %s\n", Collections.min(listBytes), Collections.max(listBytes));

        // List<String> listStrings = Arrays.asList(words);
        // Collections.sort(listStrings);
        // System.out.println(listStrings);
        //
        // List<Calendar> listDates = Arrays.asList(dates);
        // Collections.sort(listDates);
        // for (Calendar date : listDates) {
        // System.out.println(date.getTime().toString()); // THIS IS BUGGY
        // }

        // TODO: Complete this Kata
    }
}
