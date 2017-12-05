import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class HelloScannerDataTypes {
    public static void main(String... args) {
        System.out.println("Hello Scanner Data Types!");

        String string = "Scanner " + BigDecimal.TEN.toPlainString() + " " 
            + BigInteger.TWO.toString() + " "
            + Boolean.TRUE.toString() + " " 
            + Byte.toString(Byte.MAX_VALUE) + " "
            + Double.toString(Double.MAX_VALUE) + " " 
            + Float.toString(Float.MAX_VALUE) + " "
            + Integer.toString(Integer.MAX_VALUE) + " " 
            + Long.toString(Long.MAX_VALUE) + " "
            + Short.toString(Short.MAX_VALUE);
        // Scanner 10 2 true 127 1.7976931348623157E308 3.4028235E38 2147483647
        // 9223372036854775807 32767
        System.out.printf("string = <%s>\n", string);

        Scanner sc = new Scanner(string);
        String st01     = sc.next();
        BigDecimal bd01 = sc.nextBigDecimal();
        BigInteger bi01 = sc.nextBigInteger();
        boolean bo01    = sc.nextBoolean();
        byte by01       = sc.nextByte();
        double db01     = sc.nextDouble();
        float fl01      = sc.nextFloat();
        int in01        = sc.nextInt();
        long lo01       = sc.nextLong();
        short sh01      = sc.nextShort();
        sc.close();

        System.out.printf("sc.next();           = <%s>\n", st01);
        System.out.printf("sc.nextBigDecimal(); = %s\n", bd01);
        System.out.printf("sc.nextBigInteger(); = %s\n", bi01);
        System.out.printf("sc.nextBoolean();    = %s\n", bo01);
        System.out.printf("sc.nextByte();       = %s\n", by01);
        System.out.printf("sc.nextDouble();     = %s\n", db01);
        System.out.printf("sc.nextFloat();      = %s\n", fl01);
        System.out.printf("sc.nextInt();        = %s\n", in01);
        System.out.printf("sc.nextLong();       = %s\n", lo01);
        System.out.printf("sc.nextShort();      = %s\n", sh01);
    }
}
