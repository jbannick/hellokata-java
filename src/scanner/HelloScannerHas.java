import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Pattern;

public class HelloScannerHas {

    static Scanner m_sc;

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

        System.out.println("---");
        System.out.println(sj.toString());

        // ---

        System.out.println("---");
        m_sc = new Scanner(sj.toString());
        whatsNext();
        String st01 = m_sc.next();
        System.out.printf("m_sc.next(); = <%s>\n", st01);

        System.out.println("---");
        whatsNext();
        BigDecimal bd01 = m_sc.nextBigDecimal();
        System.out.printf("m_sc.nextBigDecimal(); = %s\n", bd01);

        System.out.println("---");
        whatsNext();
        BigInteger bi01 = m_sc.nextBigInteger();
        System.out.printf("m_sc.nextBigInteger(); = %s\n", bi01);

        System.out.println("---");
        whatsNext();
        boolean bo01 = m_sc.nextBoolean();
        System.out.printf("m_sc.nextBoolean(); = %b\n", bo01);

        System.out.println("---");
        whatsNext();
        byte by01 = m_sc.nextByte();
        System.out.printf("m_sc.nextByte(); = %d\n", by01);

        System.out.println("---");
        whatsNext();
        double db01 = m_sc.nextDouble();
        System.out.printf("m_sc.nextDouble(); = %e\n", db01);

        System.out.println("---");
        whatsNext();
        float fl01 = m_sc.nextFloat();
        System.out.printf("m_sc.nextFloat(); = %e\n", fl01);

        System.out.println("---");
        whatsNext();
        int in01 = m_sc.nextInt();
        System.out.printf("m_sc.nextInt(); = %d\n", in01);

        System.out.println("---");
        whatsNext();
        long lo01 = m_sc.nextLong();
        System.out.printf("m_sc.nextLong(); = %d\n", lo01);

        System.out.println("---");
        whatsNext();
        short sh01 = m_sc.nextShort();
        System.out.printf("m_sc.nextShort(); = %d\n", sh01);

        System.out.println("---");
        whatsNext();
        String st02 = m_sc.next(Pattern.compile("Ozy.*"));
        System.out.printf("m_sc.next(Pattern.compile(\"Ozy.*\")); = <%s>\n", st02);
        
        m_sc.close();
    }

    static void whatsNext() {

        StringJoiner sj = new StringJoiner(", ");

        if (m_sc.hasNextBigDecimal()) {
            sj.add("BigDecimal");
        }
        if (m_sc.hasNextBigInteger()) {
            sj.add("BigInteger");
        }
        if (m_sc.hasNextBoolean()) {
            sj.add("Boolean");
        }
        if (m_sc.hasNextByte()) {
            sj.add("Byte");
        }
        if (m_sc.hasNextDouble()) {
            sj.add("Double");
        }
        if (m_sc.hasNextFloat()) {
            sj.add("Float");
        }
        if (m_sc.hasNextInt()) {
            sj.add("Integer");
        }
        if (m_sc.hasNextLong()) {
            sj.add("Long");
        }
        if (m_sc.hasNextShort()) {
            sj.add("Short");
        }
        if (m_sc.hasNext()) {
            sj.add("String");
        }
        System.out.printf("Next token is one of: %s\n", sj.toString());
    }
}
