import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class HelloScannerHas {

    static Pattern ozyPattern = Pattern.compile("Ozy.*");

    public static void main(String... args) {
        System.out.println("Hello Scanner Has!");

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
        sj.add(Float.toString(Float.MAX_VALUE) + "1000");

        Scanner sc = new Scanner(sj.toString());

        System.out.println("---");
        System.out.println(sj.toString());

        // ---

        System.out.println("---");
        whatsNext(sc);
        String st01 = sc.next();
        System.out.printf("sc.next(); = <%s>\n", st01);

        System.out.println("---");
        whatsNext(sc);
        BigDecimal bd01 = sc.nextBigDecimal();
        System.out.printf("sc.nextBigDecimal(); = %s\n", bd01);

        System.out.println("---");
        whatsNext(sc);
        BigInteger bi01 = sc.nextBigInteger();
        System.out.printf("sc.nextBigInteger(); = %s\n", bi01);

        System.out.println("---");
        whatsNext(sc);
        boolean bo01 = sc.nextBoolean();
        System.out.printf("sc.nextBoolean(); = %b\n", bo01);

        System.out.println("---");
        whatsNext(sc);
        byte by01 = sc.nextByte();
        System.out.printf("sc.nextByte(); = %d\n", by01);

        System.out.println("---");
        whatsNext(sc);
        double db01 = sc.nextDouble();
        System.out.printf("sc.nextDouble(); = %e\n", db01);

        System.out.println("---");
        whatsNext(sc);
        float fl01 = sc.nextFloat();
        System.out.printf("sc.nextFloat(); = %e\n", fl01);

        System.out.println("---");
        whatsNext(sc);
        int in01 = sc.nextInt();
        System.out.printf("sc.nextInt(); = %d\n", in01);

        System.out.println("---");
        whatsNext(sc);
        long lo01 = sc.nextLong();
        System.out.printf("sc.nextLong(); = %d\n", lo01);

        System.out.println("---");
        whatsNext(sc);
        short sh01 = sc.nextShort();
        System.out.printf("sc.nextShort(); = %d\n", sh01);

        System.out.println("---");
        whatsNext(sc);
        String st02 = sc.next(ozyPattern);
        System.out.printf("sc.next(Pattern.compile(\"Ozy.*\")); = <%s>\n", st02);

        System.out.println("---");
        whatsNext(sc);
        float fl02 = sc.nextFloat();
        System.out.printf("sc.nextFloat(too large); = <%s>\n", fl02);

        sc.close();
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
        if (sc.hasNext(ozyPattern)) {
            sj.add(ozyPattern.toString());
        }
        if (sc.hasNext()) {
            sj.add("String");
        }
        System.out.printf("Next token is one of: %s\n", sj.toString());
    }
}
