import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class HelloScannerConsole {

    static Pattern ipAddressPattern = 
        Pattern.compile("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4}\\b");

    public static void main(String... args) {
        System.out.println("Hello Scanner Console!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        while (sc.hasNext()) {
            whatsNext(sc);
            sc.next();
            System.out.println("---");
            System.out.println("Enter something: ");
        }
    }

    static void whatsNext(Scanner sc) {

        StringJoiner sj = new StringJoiner(", ");

        if (sc.hasNextBigDecimal()) {
            sj.add("BigDecimal");
        }
        if (sc.hasNextBigInteger()) {
            sj.add("BigInteger");
        }
        if (sc.hasNextBoolean()) {
            sj.add("Boolean");
        }
        if (sc.hasNextByte()) {
            sj.add("Byte");
        }
        if (sc.hasNextDouble()) {
            sj.add("Double");
        }
        if (sc.hasNextFloat()) {
            sj.add("Float");
        }
        if (sc.hasNextInt()) {
            sj.add("Integer");
        }
        if (sc.hasNextLong()) {
            sj.add("Long");
        }
        if (sc.hasNextShort()) {
            sj.add("Short");
        }
        if (sc.hasNext(ipAddressPattern)) {
            sj.add("IP Address");
        }
        if (sc.hasNext()) {
            sj.add("String");
        }
        System.out.printf("Next token is one of: %s\n", sj.toString());
    }
}
