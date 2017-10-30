public class HelloDataTypesLong {
    public static void main(String... args) {
        System.out.println("Hello Data Types Long!");

        System.out.printf("size: %s\n", Long.SIZE);

        // 1. Value by Assigning a Literal
        long lo1 = Long.MIN_VALUE;
        long lo2 = Long.MAX_VALUE;

        long lo3 = -9223372036854775808L; // (long) -(Math.pow(2, 64));
        long lo4 = 9223372036854775807L; // (long) (Math.pow(2, 64));

        long lo5 = 0x8000_0000_0000_0000L;
        long lo6 = 0x7fff_ffff_ffff_ffffL;

        long lo7 = -0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;
        long lo8 = 0b111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111L;

        System.out.printf("Long.MIN_VALUE; \t\t\t\t%e\n", (float) lo1);
        System.out.printf("Long.MAX_VALUE;  \t\t\t %e\n", (float) lo2);

        System.out.printf("long lo3  =  (long) -(Math.pow(2, 64)); \t\t\t%s\n", lo3);
        System.out.printf("long lo4  =  (long) (Math.pow(2, 64)); \t\t\t %s\n", lo4);

        System.out.printf("long lo5  =  0x8000_0000_0000_0000L; \t\t\t%s\n", lo5);
        System.out.printf("long lo6  =  0x7fff_ffff_ffff_ffffL; \t\t\t %s\n", lo6);

        System.out.printf(
                "long lo7  = -0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L; %s\n",
                lo7);
        System.out.printf(
                "long lo8  =  0b111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111_1111L; \t %s\n",
                lo8);

        // 2. Value by Instantiation
        Long lo9 = new Long(lo1);
        Long lo19 = Long.valueOf(lo1);

        System.out.printf("Long lo9  = new Long(lo1); \t\t%s\n", lo9);
        System.out.printf("Long lo19 = Long.valueOf(lo1); \t\t%s\n", lo19);

        // 3. Value by Explicit Conversion
        long lo10 = lo9.longValue();
        Byte by1 = (byte) -128;
        long lo10x = by1.longValue();
        Short sh1 = -32768;
        long lo10b = sh1.longValue();
        Integer in1 = -2147483648;
        long lo10c = in1.longValue();
        Float fl1 = -9223372036854775808.0f;
        long lo10d = fl1.longValue();
        Double db1 = -9223372036854775808.0d;
        long lo10e = db1.longValue();

        System.out.printf("                                       long lo10  = lo9.longValue(); \t%s\n", lo10);
        System.out.printf("Byte    by1 = (byte) -128;             long lo10x = sh1.longValue(); \t%s\n", lo10x);
        System.out.printf("Short   sh1 = -32768;                  long lo10b = sh1.longValue(); \t%s\n", lo10b);
        System.out.printf("Integer in1 = -2147483648L;            long lo10c = i1.longValue(); \t%s\n", lo10c);
        System.out.printf("Float   fl1 = -9223372036854775808.0f; long lo10d = fl1.longValue(); \t%s\n", lo10d);
        System.out.printf("Double  db1 = -9223372036854775808.0d; long lo10e = db1.longValue(); \t%s\n", lo10e);

        // 4. Value by Autoboxlog (Implicit Conversion)
        Long lo11 = lo1;
        long lo12 = lo9;

        System.out.printf("Long lo11 = lo1; \t\t\t\t\t\t%s\n", lo11);
        System.out.printf("long lo12 = lo9; \t\t\t\t\t\t%s\n", lo12);

        // 5. Value By Parsing
        long lo13 = Long.parseLong("-9223372036854775808");
        long lo14 = Long.parseLong("-8000000000000000", 16);
        long lo15 = Long.parseLong("-1000000000000000000000000000000000000000000000000000000000000000", 2);

        System.out.printf("Long lo13 = Long.parseLong(\"-9223372036854775808\"); \t\t%s\n", lo13);
        System.out.printf("Long lo14 = Long.parseLong(\"-8000000000000000\", 16); \t\t%s\n", lo14);
        System.out.printf(
                "Long lo15 = Long.parseLong(\"-1000000000000000000000000000000000000000000000000000000000000000\", 2); \t%s\n",
                lo15);

        long lo16 = Long.decode("-9223372036854775808");
        long lo17 = Long.decode("-0x8000000000000000");
        long lo18 = Long.decode("-01000000000000000000000");

        System.out.printf("Long lo16 = Long.decode(\"-9223372036854775808\"); \t\t%s\n", lo16);
        System.out.printf("Long lo17 = Long.decode(\"-0x8000000000000000\"); \t\t\t%s\n", lo17);
        System.out.printf("Long lo18 = Long.decode(\"-01000000000000000000000\"); \t\t%s\n", lo18);

        Long lo20 = Long.valueOf("-9223372036854775808");
        long lo21 = Long.valueOf("-8000000000000000", 16);
        long lo22 = Long.valueOf("-1000000000000000000000000000000000000000000000000000000000000000", 2);

        System.out.printf("Long lo20 = Long.valueOf(\"-9223372036854775808\"); \t\t%s\n", lo20);
        System.out.printf("Long lo21 = Long.valueOf(\"-8000000000000000\", 16); \t\t%s\n", lo21);
        System.out.printf(
                "Long lo22 = Long.valueOf(\"-1000000000000000000000000000000000000000000000000000000000000000\", 2); \t%s\n",
                lo22);

        // 6. Value By Cast
        byte by2 = (byte) -128;
        long lo23 = (long) by2;
        short sh2 = (short) -32768;
        long lo24 = (long) sh2;
        int in2 = (int) -2147483648;
        long lo25 = (long) in2;
        float fl2 = -9223372036854775808.0f;
        long lo26 = (long) fl2;
        double db2 = 9223372036854775808.0d;
        long lo27 = (long) db2;

        System.out.printf("byte  by2 = (byte)  -128;   		   long lo23 = (long) by2; \t%s\n", lo23);
        System.out.printf("short sh2 = (short) -32768; 		   long lo24 = (long) sh2; \t%s\n", lo24);
        System.out.printf("int   in2 = (int)   -2147483648;     long lo25 = (long) in2; \t\t%s\n", lo25);
        System.out.printf("float fl2 = -9223372036854775808.0f; long lo26 = (long) fl2; \t\t%s\n", lo26);
        System.out.printf("double db2 = 9223372036854775808.0d; long lo27 = (long) db2; \t\t%s\n", lo27);
    }
}
