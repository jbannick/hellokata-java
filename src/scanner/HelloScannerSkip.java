import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringJoiner;

public class HelloScannerSkip {
    public static void main(String... args) {
        System.out.println("Hello Scanner Skip!");

        String string = "abc 123 def 456 ghi 789";

        StringJoiner sj = new StringJoiner(", ");
        Scanner sc = new Scanner(string);
        while (sc.hasNext()) {
            try {
                sc.skip("[a-zA-Z]*");
                sj.add(sc.next("[0-9]*"));
            } catch (InputMismatchException e) {
                // null-op
            }
        }
        sc.close();

        System.out.println("---");
        System.out.println(string);

        System.out.println("---");
        System.out.printf("Just the numbers = %s\n", sj);
    }
}
