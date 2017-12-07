import java.util.Scanner;

public class HelloScannerSimplest {
    public static void main(String... args) {
        System.out.println("Hello Scanner Simplest!");

        String string = "Scanner 1 2.0 true";
        
        Scanner sc = new Scanner(string);
        String st01  = sc.next();
        int in01     = sc.nextInt();
        double db01  = sc.nextDouble();
        boolean bo01 = sc.nextBoolean();
        sc.close();

        System.out.println("---");
        System.out.println(string);
        System.out.println("---");
        System.out.printf("sc.next(); = <%s>\n", st01);
        System.out.printf("sc.nextInt(); = %s\n", in01);
        System.out.printf("sc.nextDouble(); = %s\n", db01);
        System.out.printf("sc.nextBoolean(); = %s\n", bo01);
    }
}
