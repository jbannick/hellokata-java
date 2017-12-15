import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class HelloScannerDataTypes {
    public static void main(String... args) {
        System.out.println("Hello Scanner Data Types!");

        StringJoiner sj = new StringJoiner(" ");
        sj.add("Scanner");

        sj.add(new BigDecimal(10.0d * 0.0825d).setScale(2, RoundingMode.UP).toPlainString());
        sj.add(new BigInteger(64, new Random()).toString());
        sj.add(Boolean.TRUE.toString());
        sj.add(Byte.toString(Byte.MAX_VALUE));
        sj.add(Double.toString(Double.MAX_VALUE));
        sj.add(Float.toString(Float.MAX_VALUE));
        sj.add(Integer.toString(Integer.MAX_VALUE));
        sj.add(Long.toString(Long.MAX_VALUE));
        sj.add(Short.toString(Short.MAX_VALUE));
        sj.add("Ozymandias");

        String string = sj.toString();
        
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
        String st02     = sc.next(Pattern.compile("Ozy.*"));
        sc.close();

        System.out.println("---");
        System.out.println(string);
        System.out.println("---");
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
        System.out.printf("sc.next(Pattern.compile(\"Ozy.*\")); = <%s>\n", st02);
    }
}
