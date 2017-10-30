import java.util.Scanner;

public class HelloConsoleIOScanner {
    public static void main(String... args) {
        System.out.println("Hello Console IO Scanner!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter ABC-12345: ");
        String productId = scanner.next("[A-Z]{3}-[0-9]{5}");
        System.out.println(productId);

        System.out.println("\nEnter 123: ");
        int quantity = scanner.nextInt();
        System.out.println(quantity);

        System.out.println("\nEnter 1.23: ");
        float price = scanner.nextFloat();
        System.out.println(price);

        scanner.close();
        System.out.println("\nExiting");
    }
}
