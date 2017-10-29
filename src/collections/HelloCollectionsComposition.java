import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class HelloCollectionsComposition {

    // LOOK AT DATA TYPES IN MY SORTING.DOC

    // static Byte[] bytes1 = {26, 10, 11, 1};
    // static Byte[] bytes2 = {126, 110, 112, 111};

    static String[] words = { "zzz", "mmm", "qqq", "aaa" };
    static Calendar[] dates = { new GregorianCalendar(2017, 12, 31), new GregorianCalendar(2017, 10, 1),
            new GregorianCalendar(2017, 11, 31), new GregorianCalendar(2017, 1, 1) };

    public static void main(String... args) {
        System.out.println("Hello Collections Composition!");

        // Frequency

        ArrayList<Byte> bytes1 = new ArrayList<>();
        for (byte i = 0; i < 5; i++) {
            bytes1.add(i);
            for (byte j = i; j < 5; j++) {
                bytes1.add(j);
            }
        }
        Collections.sort(bytes1);
        System.out.printf("bytes1: ");
        System.out.println(bytes1);

        Byte targetByte = 1;
        System.out.printf("bytes1: frequency of %s, is %s\n", targetByte, Collections.frequency(bytes1, targetByte));

        // Disjoint

        ArrayList<Byte> bytes2 = new ArrayList<>();
        for (byte i = 4; i < 5; i++) {
            bytes2.add(i);
            for (byte j = i; j < 5; j++) {
                bytes2.add(j);
            }
        }
        System.out.printf("bytes2: ");
        System.out.println(bytes2);

        Collections.sort(bytes2);
        System.out.printf("bytes1 and bytes2 are disjoint = %s\n", Collections.disjoint(bytes1, bytes2));

        ArrayList<Byte> bytes3 = new ArrayList<>();
        for (byte i = 5; i < 10; i++) {
            bytes3.add(i);
            for (byte j = i; j < 10; j++) {
                bytes3.add(j);
            }
        }
        System.out.printf("bytes3: ");
        System.out.println(bytes3);
        Collections.sort(bytes3);
        System.out.printf("bytes1 and bytes3 are disjoint = %s\n", Collections.disjoint(bytes1, bytes3));

        // TODO: Complete this Kata
    }
}
