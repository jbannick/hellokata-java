public class HelloDataTypesByte {
    public static void main(String... args) {
        System.out.println("Hello Data Types Byte!");

        System.out.printf("size: %s\n", Byte.SIZE);

        // 1. Value by Assigning a Literal
        byte by1 = Byte.MIN_VALUE;
        byte by2 = Byte.MAX_VALUE;
        byte by3 = -128;
        byte by4 = 127;
        byte by5 = -0x80;
        byte by6 = 0x7f;
        byte by7 = -0b1000_0000;
        byte by8 = 0b111_1111;

        System.out.printf("Byte.MIN_VALUE; \t\t\t%e\n", (float) by1);
        System.out.printf("Byte.MAX_VALUE;  \t\t %e\n", (float) by2);
        System.out.printf("byte by3  = -128; \t\t%s\n", by3);
        System.out.printf("byte by4  =  127; \t\t %s\n", by4);
        System.out.printf("byte by5  = -0x80; \t\t%s\n", by5);
        System.out.printf("byte by6  =  0x7f; \t\t %s\n", by6);
        System.out.printf("byte by7  = -0b1000_0000; \t%s\n", by7);
        System.out.printf("byte by8  =  0b111_1111; \t %s\n", by8);

        // 2. Value by Instantiation
        Byte by9 = Byte.valueOf(by1);

        System.out.printf("Byte by9 = Byte.valueOf(by1); \t%s\n", by9);

        // 3. Value by Explicit Conversion
        byte by10 = by9.byteValue();
        Short sh1 = (short) -128;
        byte by10x = sh1.byteValue();
        Integer in1 = -128;
        byte by10b = in1.byteValue();
        Long lo1 = -128L;
        byte by10c = lo1.byteValue();
        Float fl1 = -128.0f;
        byte by10d = fl1.byteValue();
        Double db1 = -128.0d;
        byte by10e = db1.byteValue();

        System.out.printf("                            byte by10  = by9.byteValue(); \t%s\n", by10);
        System.out.printf("Short   sh1 = (short) -128; byte by10x = sh1.byteValue(); \t%s\n", by10x);
        System.out.printf("Integer in1 = -128;         byte by10b = in1.byteValue(); \t%s\n", by10b);
        System.out.printf("Long    lo1 = -128L;        byte by10c = lo1.byteValue(); \t%s\n", by10c);
        System.out.printf("Float   fl1 = -128.0f;      byte by10d = fl1.byteValue(); \t%s\n", by10d);
        System.out.printf("Double  db1 = -128d;        byte by10e = db1.byteValue(); \t%s\n", by10e);

        // 4. Value by Autoboxing (Implicit Conversion)
        Byte by11 = by1;
        byte by12 = by9;

        System.out.printf("Byte by11 = by1; \t\t%s\n", by11);
        System.out.printf("byte by12 = by9; \t\t%s\n", by12);

        // 5. Value By Parsing
        byte by13 = Byte.parseByte("-128");
        byte by14 = Byte.parseByte("-80", 16);
        byte by15 = Byte.parseByte("-10000000", 2);

        System.out.printf("Byte by13 = Byte.parseByte(\"-128\"); \t\t%s\n", by13);
        System.out.printf("Byte by14 = Byte.parseByte(\"-80\", 16); \t\t%s\n", by14);
        System.out.printf("Byte by15 = Byte.parseByte(\"-10000000\", 2); \t%s\n", by15);

        byte by16 = Byte.decode("-128");
        byte by17 = Byte.decode("-0x80");
        byte by18 = Byte.decode("-0200");

        System.out.printf("Byte by16 = Byte.decode(\"-128\"); \t\t%s\n", by16);
        System.out.printf("Byte by17 = Byte.decode(\"-0x80\"); \t\t%s\n", by17);
        System.out.printf("Byte by18 = Byte.decode(\"-0200\"); \t\t%s\n", by18);

        Byte by20 = Byte.valueOf("-128");
        byte by21 = Byte.valueOf("-80", 16);
        byte by22 = Byte.valueOf("-10000000", 2);

        System.out.printf("Byte by20 = Byte.valueOf(\"-128\"); \t\t%s\n", by20);
        System.out.printf("Byte by21 = Byte.valueOf(\"-80\", 16); \t\t%s\n", by21);
        System.out.printf("Byte by22 = Byte.valueOf(\"-10000000\", 2); \t%s\n", by22);

        // 6. Value By Casting
        short sh2 = (short) -128;
        byte by23 = (byte) sh2;
        int in2 = (int) -128;
        byte by24 = (byte) in2;
        long lo2 = (long) -128;
        byte by25 = (byte) lo2;
        float fl2 = -128.0f;
        byte by26 = (byte) fl2;
        double db2 = -128.0d;
        byte by27 = (byte) db2;

        System.out.printf("short  sh2 = (short) -128; byte by23 = (byte) sh2; \t\t%s\n", by23);
        System.out.printf("int    in2 = (int)   -128; byte by24 = (byte) in2; \t\t%s\n", by24);
        System.out.printf("long   lo2 = (long)  -128; byte by25 = (byte) lo2; \t\t%s\n", by25);
        System.out.printf("float  fl2 = -128.0f;      byte by26 = (byte) fl2; \t\t%s\n", by26);
        System.out.printf("double db2 = -128.0d;      byte by27 = (byte) db2; \t\t%s\n", by27);
    }
}
