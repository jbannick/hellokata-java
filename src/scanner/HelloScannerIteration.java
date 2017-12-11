import java.util.Scanner;

public class HelloScannerIteration {
    public static void main(String... args) {
        System.out.println("Hello Scanner Iteration!");

        String string01 = "abc 123 def 456 ghi 789";
        String string02 = "987 IGH 654 FED 321 CBA";

        System.out.println("---");
        System.out.println(string01);
        System.out.println("---");

        Scanner sc = new Scanner(string01);

        sc.forEachRemaining(x -> {
            System.out.println(x);
        });
        sc.close();

        // ---

        System.out.println("---");
        System.out.println(string02);
        System.out.println("---");

        sc = new Scanner(string02);
        sc.forEachRemaining(System.out::println);
        sc.close();
    }
}
