public class HelloDataTypesShort {
    public static void main(String... args) {
        System.out.println("Hello Data Types Short!");

        System.out.printf("size: %s\n", Short.SIZE);

        // 1. Value by Assigning a Literal
        short sh1 = Short.MIN_VALUE;
        short sh2 = Short.MAX_VALUE;
        short sh3 = -32768;
        short sh4 = 32767;
        short sh5 = -0x8000;
        short sh6 = 0x7fff;
        short sh7 = -0b1000_0000_0000_0000;
        short sh8 = 0b111_1111_1111_1111;

        System.out.printf("Short.MIN_VALUE; \t\t\t%e\n", (float) sh1);
        System.out.printf("Short.MAX_VALUE;  \t\t\t %e\n", (float) sh2);
        System.out.printf("short sh3  = -32768; \t\t\t%s\n", sh3);
        System.out.printf("short sh4  =  32767; \t\t\t %s\n", sh4);
        System.out.printf("short sh5  = -0x8000; \t\t\t%s\n", sh5);
        System.out.printf("short sh6  =  0x7fff; \t\t\t %s\n", sh6);
        System.out.printf("short sh7  = -0b1000_0000_0000_0000; \t%s\n", sh7);
        System.out.printf("short sh8  =  0b111_1111_1111_1111; \t %s\n", sh8);

        // 2. Value sh Instantiation
        Short sh9 = new Short(sh1);
        Short sh19 = Short.valueOf(sh1);

        System.out.printf("Short sh9  = new Short(sh1); \t\t%s\n", sh9);
        System.out.printf("Short sh19 = Short.valueOf(sh1); \t%s\n", sh19);

        // 3. Value by Explicit Conversion
        short sh10 = sh9.shortValue();
        Byte by1 = (byte) -128;
        short sh10x = by1.shortValue();
        Integer in1 = -32768;
        short sh10b = in1.shortValue();
        Long lo1 = -32768L;
        short sh10c = lo1.shortValue();
        Float fl1 = -32768.0f;
        short sh10d = fl1.shortValue();
        Double db1 = -32768.0d;
        short sh10e = db1.shortValue();

        System.out.printf("                           short sh10  = sh9.shortValue(); \t%s\n", sh10);
        System.out.printf("Byte    by1 = (byte) -128; short sh10x = sh1.shortValue(); \t%s\n", sh10x);
        System.out.printf("Integer in1 = -32768;      short sh10b = in1.shortValue(); \t%s\n", sh10b);
        System.out.printf("Long    lo1 = -32768L;     short sh10c = lo1.shortValue(); \t%s\n", sh10c);
        System.out.printf("Float   fl1 = -32768.0f;   short sh10d = fl1.shortValue(); \t%s\n", sh10d);
        System.out.printf("Double  db1 = -32768.0d;   short sh10e = db1.shortValue(); \t%s\n", sh10e);

        // 4. Value sh Autoboxing (Implicit Conversion)
        Short sh11 = sh1;
        short sh12 = sh9;

        System.out.printf("Short sh11 = sh1; \t\t\t%s\n", sh11);
        System.out.printf("short sh12 = sh9; \t\t\t%s\n", sh12);

        // 5. Value By Parsing
        short sh13 = Short.parseShort("-32768");
        short sh14 = Short.parseShort("-8000", 16);
        short sh15 = Short.parseShort("-1000000000000000", 2);

        System.out.printf("Short sh13 = Short.parseShort(\"-32768\"); \t\t\t%s\n", sh13);
        System.out.printf("Short sh14 = Short.parseShort(\"-8000\", 16); \t\t\t%s\n", sh14);
        System.out.printf("Short sh15 = Short.parseShort(\"-1000_0000_0000_0000\", 2); \t%s\n", sh15);

        short sh16 = Short.decode("-32768");
        short sh17 = Short.decode("-0x8000");
        short sh18 = Short.decode("-0100000");

        System.out.printf("Short sh16 = Short.decode(\"-32768\"); \t\t\t\t%s\n", sh16);
        System.out.printf("Short sh17 = Short.decode(\"-0x8000\"); \t\t\t\t%s\n", sh17);
        System.out.printf("Short sh18 = Short.decode(\"-0100000\"); \t\t\t\t%s\n", sh18);

        Short sh20 = Short.valueOf("-32768");
        short sh21 = Short.valueOf("-8000", 16);
        short sh22 = Short.valueOf("-1000000000000000", 2);

        System.out.printf("Short sh20 = Short.valueOf(\"-32768\"); \t\t\t\t%s\n", sh20);
        System.out.printf("Short sh21 = Short.valueOf(\"-8000\", 16); \t\t\t%s\n", sh21);
        System.out.printf("Short sh22 = Short.valueOf(\"-1000000000000000\", 2); \t\t%s\n", sh22);

        // 6. Value By Casting
        byte by2 = (byte) -128;
        short sh23 = (short) by2;
        int in2 = -32768;
        short sh24 = (short) in2;
        long lo2 = -32768L;
        short sh25 = (short) lo2;
        float fl2 = -32768.0f;
        short sh26 = (short) fl2;
        double db2 = -32768.0d;
        short sh27 = (short) db2;

        System.out.printf("byte   by2 = (int) -128; short sh23 = (short) by2; \t\t%s\n", sh23);
        System.out.printf("int    in2 = -32768;     short sh24 = (short) in2; \t\t%s\n", sh24);
        System.out.printf("long   lo2 = -32768L;    short sh25 = (short) lo2; \t\t%s\n", sh25);
        System.out.printf("float  fl2 = -32768.0f;  short sh26 = (short) fl2; \t\t%s\n", sh26);
        System.out.printf("double db2 = -32768.0d;  short sh27 = (short) db2; \t\t%s\n", sh27);
    }
}
