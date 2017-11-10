import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class HelloDataTypesBigDecimal {
    public static void main(String... args) {
        System.out.println("Hello Data Types BigDecimal!");

        // BigDecimal Convenience Constants
        System.out.printf("BigDecimal.ZERO = %s\n", BigDecimal.ZERO);
        System.out.printf("BigDecimal.ONE = %s\n", BigDecimal.ONE);
        System.out.printf("BigDecimal.TEN = %s\n", BigDecimal.TEN);

        // Creating a BigDecimal

        // 1. Value by Assigning a Literal
        // Can not do. BD's are immutable.

        // 2. Value by Instantiation
        BigDecimal bd21 = new BigDecimal(3d);
        System.out.printf("bd21 = new BigDecimal(3d); = %s\n", bd21);

        BigDecimal bd22 = new BigDecimal(3.14d);
        System.out.printf("bd22 = new BigDecimal(3.14d); = %s\n", bd22);

        BigDecimal bd23 = new BigDecimal(Double.valueOf(3.14d));
        System.out.printf("bd23 = new BigDecimal(new Double(3.14d)); = %s\n", bd23);

        BigDecimal bd24 = new BigDecimal(3.14d, MathContext.DECIMAL64);
        System.out.printf("bd24 = new BigDecimal(3.14d, MathContext.DECIMAL64); = %s\n", bd24);

        BigDecimal bd25 = new BigDecimal(3.14d, MathContext.DECIMAL128);
        System.out.printf("bd25 = new BigDecimal(3.14d, MathContext.DECIMAL128); = %s\n", bd25);

        BigDecimal bd26 = new BigDecimal("3.14");
        System.out.printf("bd26 = new BigDecimal(\"3.14\"); = %s\n", bd26);

        // 3. Value by Explicit Conversion
        BigDecimal bd31 = BigDecimal.valueOf(3.14d);
        System.out.printf("bd31 = BigDecimal.valueOf(3.14d); = %s\n", bd31);

        // 4. Value by Autoboxing (Implicit Conversion)
        // Can not do. No primitive.

        // 6. Value By Casting
        // Can not do.

        // BigDecimal Arithmetic

        BigDecimal bd71_10 = new BigDecimal("10.0");
        BigDecimal bd71_20 = new BigDecimal("20.0");
        BigDecimal bd71 = bd71_10.add(bd71_20);
        System.out.printf("bd71 = bd71_10.add(bd71_20); = %s\n", bd71);

        BigDecimal bd72 = bd71_20.subtract(bd71_10);
        System.out.printf("bd72 = bd71_20.subtract(bd71_10); = %s\n", bd72);

        BigDecimal bd73 = bd71_10.subtract(bd71_20);
        System.out.printf("bd73 = bd71_10.subtract(bd71_20); = %s\n", bd73);

        BigDecimal bd74 = bd71_10.multiply(bd71_20);
        System.out.printf("bd74 = bd71_10.multiply(bd71_20); = %s\n", bd74);

        BigDecimal bd75 = bd71_20.divide(bd71_10);
        System.out.printf("bd71_20.divide(bd71_10); = %s\n", bd75);

        // BigDecimal Comparison
        BigDecimal bd71_5 = new BigDecimal("5");
        BigDecimal bd71_10i = new BigDecimal("10");
        System.out.printf("bd71_10.compareTo(bd71_5) = %s\n", bd71_10.compareTo(bd71_5));
        System.out.printf("bd71_10.compareTo(bd71_10) = %s\n", bd71_10.compareTo(bd71_10));
        System.out.printf("bd71_10.compareTo(bd71_20) = %s\n", bd71_10.compareTo(bd71_20));
        System.out.printf("bd71_10.compareTo(bd71_10i) = %s\n", bd71_10.compareTo(bd71_10i));

        // Accounting

        BigDecimal a = new BigDecimal("2.5"); // digit left of 5 is even, so round down
        BigDecimal b = new BigDecimal("1.5"); // digit left of 5 is odd, so round up
        BigDecimal aa = a.setScale(0, RoundingMode.HALF_EVEN); // => 2
        BigDecimal bb = b.setScale(0, RoundingMode.HALF_EVEN); // => 2
        System.out.printf("a = %s, b = %s, aa = %s, bb = %s\n", a, b, aa, bb);

        double cost = 10.00d;
        double taxRate = 0.0825d;
        double taxAmount = cost * taxRate;
        BigDecimal tax = new BigDecimal(taxAmount);
        BigDecimal taxRoundedUp = tax.setScale(2, RoundingMode.UP);
        ;
        System.out.printf("cost = %s, taxRate = %s, taxAmount = %s, tax = %s, taxRoundedUp = %s\n", cost, taxRate,
                taxAmount, tax, taxRoundedUp);
    }
}
