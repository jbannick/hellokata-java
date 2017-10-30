public class HelloDataTypesDouble {
    public static void main(String... args) {
        System.out.println("Hello Data Types Double!");

        System.out.printf("size: %s\n", Double.SIZE);

        // 1. Value by Assigning a Literal
        double db1 = Double.MIN_VALUE;
        double db2 = Double.MAX_VALUE;

        double db3 = 4.9E-324d;
        double db4 = 1.7976931348623157E308d;

        double db5 = 0x0.0000000000001p-1022d;
        double db6 = 0x1.fffffffffffffp1023d;

        double db7 = Double.longBitsToDouble(0x1L);
        double db8 = Double.longBitsToDouble(0x7fefffffffffffffL);

        System.out.printf("double db1 = Double.MIN_VALUE; \t\t\t\t\t%e\n", (double) db1);
        System.out.printf("double db2 = Double.MAX_VALUE; \t\t\t\t\t%e\n", (double) db2);

        System.out.printf("double db3 = 4.9E-324d; \t\t\t\t\t\t%s\n", db3);
        System.out.printf("double db4 = 1.7976931348623157E308d; \t\t\t\t%s\n", db4);

        System.out.printf("double db5 = 0x0.0000000000001p-1022d; \t\t\t\t%s\n", db5);
        System.out.printf("double db6 = 0x1.fffffffffffffp1023d; \t\t\t\t%s\n", db6);

        System.out.printf("double db7 = Double.longBitsToDouble(0x1L); \t\t\t%s\n", db7);
        System.out.printf("double db8 = Double.longBitsToDouble(0x7fefffffffffffffL); \t%s\n", db8);

        // 2. Value by Instantiation
        Double db9 = new Double(db1);
        Double db19 = Double.valueOf(db1);

        System.out.printf("double db9  = new Double(db1); \t\t%s\n", db9);
        System.out.printf("double db19 = Double.valueOf(db1); \t%s\n", db19);

        // 3. Value by Explicit Conversion
        double db10 = db9.doubleValue();
        Byte by1 = (byte) -128;
        double db10x = by1.doubleValue();
        Short sh1 = -32768;
        double db10b = sh1.doubleValue();
        Integer in1 = -2147483648;
        double db10c = in1.doubleValue();
        Long lo1 = -9223372036854775808L;
        double db10d = lo1.doubleValue();
        Float fl1 = -3.4028235E38f;
        double db10e = fl1.doubleValue();

        System.out.printf("                                     double db10  = lo9.doubleValue(); \t%s\n", db10);
        System.out.printf("Byte    by1 = (byte) -128;           double db10x = by1.doubleValue(); \t%s\n", db10x);
        System.out.printf("Short   sh1 = -32768;                double db10b = sh1.doubleValue(); \t%s\n", db10b);
        System.out.printf("Integer in1 = -2147483648;           double db10c = in1.doubleValue(); \t%s\n", db10c);
        System.out.printf("Long    lo1 = -9223372036854775808L; double db10d = lo1.doubleValue(); \t%s\n", db10d);
        System.out.printf("Float   fl1 = -3.4028235E38f;        double db10e = fl1.doubleValue(); \t%s\n", db10e);

        // 4. Value by Autoboxlog (Implicit Conversion)
        Double db11 = db1;
        double db12 = db9;

        System.out.printf("Double db11 = db1; \t\t\t%s\n", db11);
        System.out.printf("double db12 = lo9; \t\t\t%s\n", db12);

        // 5. Value By Parsing
        double db13 = Double.parseDouble("1.401298e-45");
        System.out.printf("double db13 = Double.parseDouble(\"1.401298e-45\"); \t%s\n", db13);

        // The method decode() is not available for Double;

        Double db20 = Double.valueOf("-9223372036854775808");
        System.out.printf("Double fl20 = Double.valueOf(\"-9223372036854775808\"); \t%s\n", db20);

        // 6. Value By Cast
        byte by2 = (byte) -128;
        double db23 = (double) by2;
        short sh2 = (short) -32768;
        double db24 = (double) sh2;
        int in2 = (int) -2147483648;
        double db25 = (double) in2;
        long lo2 = (long) -9223372036854775808L;
        double db26 = (double) lo2;
        float fl2 = 1.4E-45f;
        double db27 = (double) fl2;

        System.out.printf("byte  by1 = (byte)  -128;                 double db23 = (double) by1; \t%s\n", db23);
        System.out.printf("short sh1 = (short) -32768;               double db24 = (double) sh1; \t%s\n", db24);
        System.out.printf("int   in1 = (int)   -2147483648;          double db25 = (double) in1 \t%s\n", db25);
        System.out.printf("long  lo1 = (long)  -9223372036854775808L; double db26 = (double) lo1 \t%s\n", db26);
        System.out.printf("double db2 = 9223372036854775808.0d; double db27 = (long) db2; \t\t%s\n", db27);

    }
}
