public class HelloDataTypesInteger {
	public static void main(String...args) {
		System.out.println("Hello Data Types Integer!");
		
		System.out.printf("size: %s\n", Integer.SIZE);

		// 1. Value by Assigning a Literal
		int in1 = Integer.MIN_VALUE;
		int in2 = Integer.MAX_VALUE;
		int in3 = (int) -Math.pow(2, 32); 
		int in4 = (int)  Math.pow(2, 32);
		int in5 = -0x8000_0000;
		int in6 = 0x7fff_ffff;
		int in7 = -0b1000_0000_0000_0000_0000_0000_0000_0000;
		int in8 =  0b0111_1111_1111_1111_1111_1111_1111_1111;

		System.out.printf("Integer.MIN_VALUE; \t\t\t%e\n", (float) in1);
		System.out.printf("Integer.MAX_VALUE;  \t\t\t %e\n", (float) in2);
		System.out.printf("int in3  = -Math.pow(2, 32); \t\t%s\n", in3);
		System.out.printf("int in4  =  Math.pow(2, 32); \t\t %s\n", in4);
		System.out.printf("int in5  = -0x8000; \t\t\t%s\n", in5);
		System.out.printf("int in6  =  0x7fff; \t\t\t %s\n", in6);
		System.out.printf("int in7  = -0b1000_0000_0000_0000; \t%s\n", in7);
		System.out.printf("int in8  =  0b111_1111_1111_1111; \t %s\n", in8);

		// 2. Value by Instantiation
		Integer in9 = new Integer(in1);
		Integer in19 = Integer.valueOf(in1);

		System.out.printf("Integer in9  = new Integer(in1); \t%s\n", in9);
		System.out.printf("Integer in19 = Integer.valueOf(in1); \t%s\n", in19);

		// 3. Value by Explicit Conversion
		int in10 = in9.intValue();
		Byte    by1 = (byte) -128;      int in10x = by1.intValue();
		Short   sh1 = -32768;           int in10b = sh1.intValue();
		Long    lo1 = -2147483648L;     int in10c = lo1.intValue();
		Float   fl1 = -2147483648.0f;   int in10d = fl1.intValue();
		Double  db1 = -2147483648.0d;   int in10e = db1.intValue();

		System.out.printf("                                int in10  = in9.intValue(); \t%s\n", in10);
		System.out.printf("Byte    by1 = (byte) -128;      int in10x = by1.intValue(); \t%s\n", in10x);
		System.out.printf("Short   sh1 = -32768;           int in10b = sh1.intValue(); \t%s\n", in10b);
		System.out.printf("Long    lo1 = -2147483648L;     int in10c = lo1.intValue(); \t%s\n", in10c);
		System.out.printf("Float   fl1 = -2147483648.0f;   int in10d = fl1.intValue(); \t%s\n", in10d);
		System.out.printf("Double  db1 = -2147483648.0d;   int in10e = db1.intValue(); \t%s\n", in10e);

		// 4. Value in Autoboxing (Implicit Conversion)
		Integer in11 = in1;
		int in12 = in9;
		
		System.out.printf("Integer in11 = in1; \t\t\t%s\n", in11);
		System.out.printf("int in12 = in9; \t\t\t\t%s\n", in12);		

		// 5. Value By Parsing
		int in13 = Integer.parseInt("-2147483648");
		int in14 = Integer.parseInt("-80000000", 16);
		int in15 = Integer.parseInt("-10000000000000000000000000000000", 2);
		
		System.out.printf("Integer in13 = Integer.parseInteger(\"-2147483648\"); \t\t\t\t%s\n", in13);
		System.out.printf("Integer in14 = Integer.parseInteger(\"-80000000\", 16); \t\t\t\t%s\n", in14);
		System.out.printf("Integer in15 = Integer.parseInteger(\"-10000000000000000000000000000000\", 2); \t%s\n", in15);

		int in16 = Integer.decode("-2147483648");
		int in17 = Integer.decode("-0x80000000");
		int in18 = Integer.decode("-020000000000");
		
		System.out.printf("Integer in16 = Integer.decode(\"-2147483648\"); \t\t\t\t\t%s\n", in16);
		System.out.printf("Integer in17 = Integer.decode(\"-0x80000000\"); \t\t\t\t\t%s\n", in17);
		System.out.printf("Integer in18 = Integer.decode(\"-020000000000\"); \t\t\t\t\t%s\n", in18);

		Integer in20 = Integer.valueOf("-2147483648");
		int in21 = Integer.valueOf("-80000000", 16);
		int in22 = Integer.valueOf("-10000000000000000000000000000000", 2);
		
		System.out.printf("Integer in20 = Integer.valueOf(\"-2147483648\"); \t\t\t\t\t%s\n", in20);
		System.out.printf("Integer in21 = Integer.valueOf(\"-80000000\", 16); \t\t\t\t%s\n", in21);
		System.out.printf("Integer in22 = Integer.valueOf(\"-10000000000000000000000000000000\", 2); \t\t%s\n", in22);

		// 6. Value By Casting
		byte  by2  = (byte)  -128;   int in23 = (int) by2;
		short sh2  = (short) -32768; int in24 = (int) sh2;
		long  lo2  = -2147483648L;   int in25 = (int) lo2;
		float  fl2 = -2147483648.0f; int in26 = (int) fl2;
		double db2 = -2147483648.0d; int in27 = (int) db2;

		System.out.printf("byte  by2  = (byte)  -128;   int in23 = (int) by2; \t\t%s\n", in23);
		System.out.printf("short sh2  = (short) -32768; int in24 = (int) sh2; \t\t%s\n", in24);
		System.out.printf("long  lo2  = -2147483648L;   int in25 = (int) lo2; \t\t%s\n", in25);
		System.out.printf("float  fl2 = -2147483648.0f; int sh26 = (int) fl2; \t\t%s\n", in26);
		System.out.printf("double db2 = -2147483648.0d; int sh27 = (int) db2; \t\t%s\n", in27);
	}
}
