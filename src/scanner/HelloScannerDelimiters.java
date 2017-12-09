import java.util.Scanner;

public class HelloScannerDelimiters {

    @SuppressWarnings("resource")
    public static void main(String... args) {
        System.out.println("Hello Scanner Delimiters!");

        String string01 = "ABC DEF GHI";
        String string02 = "123,456,789";
        String string03 = "086-38-5955 078-05-1120";
        String string04 = "3.14 1.23 127.0.0.1 172.16.254.1";

        // ---

        Scanner sc01 = new Scanner(string01);
        String st01 = sc01.next();
        String st02 = sc01.next();
        String st03 = sc01.next();
        sc01.close();

        System.out.println("---");
        System.out.println(string01);
        System.out.printf("sc01.next() = <%s>\n", st01);
        System.out.printf("sc01.next() = <%s>\n", st02);
        System.out.printf("sc01.next() = <%s>\n", st03);

        // ---

        Scanner sc02 = new Scanner(string02);
        sc02.useDelimiter(",");
        int in11 = sc02.nextInt();
        int in12 = sc02.nextInt();
        int in13 = sc02.nextInt();
        sc02.close();

        System.out.println("---");
        System.out.println(string02);
        System.out.printf("sc02.nextInt() = %d\n", in11);
        System.out.printf("sc02.nextInt() = %d\n", in12);
        System.out.printf("sc02.nextInt() = %d\n", in13);

        // ---

        Scanner sc03 = new Scanner(string03);
        String st21 = sc03.next();
        sc03.useDelimiter("\\s|\\-");
        String st22 = sc03.next();
        String st23 = sc03.next();
        String st24 = sc03.next();
        sc03.close();
        
        System.out.println("---");
        System.out.println(string03);
        System.out.printf("sc03.next(); = <%s>\n", st21);
        System.out.printf("sc03.next(); = <%s>\n", st22);
        System.out.printf("sc03.next(); = <%s>\n", st23);
        System.out.printf("sc03.next(); = <%s>\n", st24);

        // ---

        Scanner sc04 = new Scanner(string04);
        float fl31 = sc04.nextFloat();
        System.out.println("---");
        System.out.println(string04);
        System.out.printf("sc04.nextFloat(); = %1.2f\n", fl31);

        sc04.useDelimiter("\\s|\\.");
        int in31 = sc04.nextInt();
        int in32 = sc04.nextInt();
        
        System.out.println("---");
        System.out.printf("sc04.nextInt(); = %d\n", in31);
        System.out.printf("sc04.nextInt(); = %d\n", in32);

        sc04.reset();
        String st31 = sc04.next();
        System.out.println("---");
        System.out.printf("sc04.next(); = <%s>\n", st31);

        sc04.useDelimiter("\\s|\\.");
        int in33 = sc04.nextInt();
        int in34 = sc04.nextInt();
        int in35 = sc04.nextInt();
        int in36 = sc04.nextInt();
        sc04.close();

        System.out.println("---");
        System.out.printf("sc04.nextInt(); = %d\n", in33);
        System.out.printf("sc04.nextInt(); = %d\n", in34);
        System.out.printf("sc04.nextInt(); = %d\n", in35);
        System.out.printf("sc04.nextInt(); = %d\n", in36);
    }
}
