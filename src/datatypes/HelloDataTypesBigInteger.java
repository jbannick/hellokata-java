import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Random;

public class HelloDataTypesBigInteger {
    public static void main(String... args) {
        System.out.println("Hello Data Types BigInteger!");

        // BigInteger Convenience Constants
        System.out.printf("BigInteger.ZERO = %s\n", BigInteger.ZERO);
        System.out.printf("BigDecimal.ONE = %s\n", BigInteger.ONE);
        System.out.printf("BigInteger.TEN = %s\n", BigInteger.TEN);

        // Creating a BigInteger

        // 1. Value by Assigning a Literal
        // Can not do. BI's are immutable.

        // 2. Value by Instantiation

        BigInteger bi21 = new BigInteger("314");
        System.out.printf("bi21 = new BigInteger(\"314\"); = %s\n", bi21);

        BigInteger bi22 = new BigInteger("0000000100000001", 2);
        System.out.printf("bi22 = new BigInteger(\"0000000100000001\", 2); = %s\n", bi22);

        byte[] bytes = { 1, 1 };
        BigInteger bi23 = new BigInteger(bytes);
        System.out.printf("bytes = {1, 1}; bi23 = new BigInteger(bytes); = %s\n", bi23);

        BigInteger bi24 = new BigInteger(64, new Random());
        System.out.printf("bi24 = new BigInteger(64, new Random()); = %s\n", bi24);

        // 3. Value by Explicit Conversion
        BigDecimal bd31 = new BigDecimal(314);
        BigInteger bi31 = bd31.toBigInteger();
        System.out.printf("bi31 = bi31.toBigInteger(); = %s\n", bi31);

        // 4. Value by Autoboxing (Implicit Conversion)
        // Can not do. No primitive.

        // 6. Value By Casting
        // Can not do.

        // BigInteger Arithmetic

        BigInteger bi71_10 = new BigInteger("10");
        BigInteger bi71_20 = new BigInteger("20");
        BigInteger bi71 = bi71_10.add(bi71_20);
        System.out.printf("bi71 = bi71_10.add(bi71_20); = %s\n", bi71);

        BigInteger bi72 = bi71_20.subtract(bi71_10);
        System.out.printf("bi72 = bi71_20.subtract(bi71_10); = %s\n", bi72);

        BigInteger bi73 = bi71_10.subtract(bi71_20);
        System.out.printf("bi73 = bi71_10.subtract(bi71_20); = %s\n", bi73);

        BigInteger bi74 = bi71_10.multiply(bi71_20);
        System.out.printf("bi74 = bi71_10.multiply(bi71_20); = %s\n", bi74);

        BigInteger bi75 = bi71_20.divide(bi71_10);
        System.out.printf("bi71_20.divide(bi71_10); = %s\n", bi75);

        BigInteger bi76 = BigInteger.ONE;
        for (int i = 2; i <= 100; i++) {
            bi76 = bi76.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("bi76 = factorial(100); = %s digits: %s\n", bi76.toString().length(), bi76);

        // BigInteger Comparison

        BigInteger bi71_5 = new BigInteger("5");
        BigInteger bi71_10i = new BigInteger("10");
        System.out.printf("bi71_10.compareTo(bi71_5) = %s\n", bi71_10.compareTo(bi71_5));
        System.out.printf("bi71_10.compareTo(bi71_10) = %s\n", bi71_10.compareTo(bi71_10));
        System.out.printf("bi71_10.compareTo(bi71_20) = %s\n", bi71_10.compareTo(bi71_20));
        System.out.printf("bi71_10.compareTo(bi71_10i) = %s\n", bi71_10.compareTo(bi71_10i));

        // Crypto

        try {
            String s = "Something to hash";
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(s.getBytes(), 0, s.length());
            System.out.printf("MD5: <%s> yields: %s\n", s, new BigInteger(1, m.digest()).toString(16));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
