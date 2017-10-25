public class HelloDataTypesFloat {
	public static void main(String...args) {
		System.out.println("Hello Data Types Float!");
		
		System.out.printf("size: %s\n", Float.SIZE);

		// 1. Value by Assigning a Literal
		float fl1 = Float.MIN_VALUE;
		float fl2 = Float.MAX_VALUE;
		
		float fl3 = 1.4E-45f;
		float fl4 = 3.4028235E38f;
		
		float fl5 = 0x0.000002P-126f;
		float fl6 = 0x1.fffffeP+127f;
		
		float fl7 = Float.intBitsToFloat(0x1);
		float fl8 = Float.intBitsToFloat(0x7f7fffff);
		
		System.out.printf("float fl1 = Float.MIN_VALUE; \t%e\n", (float) fl1);
		System.out.printf("float fl2 = Float.MAX_VALUE; \t%e\n", (float) fl2);
		
		System.out.printf("float fl3 = 1.4E-45f; \t%s\n", fl3);
		System.out.printf("float fl4 = 3.4028235E38f;; \t%s\n", fl4);
		
		System.out.printf("float fl5 = 0x0.000002P-126f; \t%s\n", fl5);
		System.out.printf("float fl6 = 0x1.fffffeP+127f; \t%s\n", fl6);
		
		System.out.printf("float fl7 = Float.intBitsToFloat(0x1); \t\t%s\n", fl7);
		System.out.printf("float fl8 = Float.intBitsToFloat(0x7f7fffff); \t%s\n", fl8);

		// 2. Value by Instantiation
		Float fl9 = new Float(fl1);
		Float fl19 = Float.valueOf(fl1);
		
		System.out.printf("float fl9  = new Float(fl1); \t\t%s\n", fl9);
		System.out.printf("float fl19 = Float.valueOf(fl1); \t%s\n", fl19);

		// 3. Value by Explicit Conversion
		float fl10 = fl9.floatValue();
		Byte    by1 = (byte) -128;               float fl10x = by1.floatValue();
		Short   sh1 = -32768;                    float fl10b = sh1.floatValue();
		Integer in1 = -2147483648;               float fl10c = in1.floatValue();
		Long    lo1 = -9223372036854775808L;   	float fl10d = lo1.floatValue();
		Double  db1 = -9223372036854775808.0d;   float fl10e = db1.floatValue();

		System.out.printf("                                       float fl10  = lo9.floatValue(); \t%s\n", fl10);
		System.out.printf("Byte    by1 = (byte) -128;             float fl10x = sh1.floatValue(); \t%s\n", fl10x);
		System.out.printf("Short   sh1 = -32768;                  float fl10b = sh1.floatValue(); \t%s\n", fl10b);
		System.out.printf("Integer in1 = -2147483648L;            float fl10c = in1.floatValue(); \t%s\n", fl10c);
		System.out.printf("Long    lo1 = -9223372036854775808L;   float fl10d = lo1.floatValue(); \t%s\n", fl10d);
		System.out.printf("Double  db1 = -9223372036854775808.0d; float fl10e = db1.floatValue(); \t%s\n", fl10e);

		// 4. Value by Autoboxlog (Implicit Conversion)
		Float fl11 = fl1;
		float fl12 = fl9;
		
		System.out.printf("Float fl11 = fl1; \t\t\t%s\n", fl11);
		System.out.printf("float fl12 = lo9; \t\t\t%s\n", fl12);		
		
		// 2,139,095,039
		// float, 2 ^-149
		// 0x0.000002P-126f
		// Float.intBitsToFloat(0x1)
		
		// 5. Value By Parsing
		float fl13 = Float.parseFloat("1.401298e-45");
		System.out.printf("Float.parseFloat(\"1.401298e-45\"); \t\t%s\n", fl13);

//		The method decode() is not available for Float;

		Float fl20 = Float.valueOf("-9223372036854775808");
		System.out.printf("Float.valueOf(\"-9223372036854775808\"); \t\t%s\n", fl20);

		// 6. Value By Cast
		byte   by2 = (byte)  -128;   		       float fl23 = (float) by2;
		short  sh2 = (short) -32768; 		       float fl24 = (float) sh2;
		int    in2 = (int)   -2147483648; 		   float fl25 = (float) in2;
		long   lo2 = (long)  -9223372036854775808L; float fl26 = (float) lo2;
		double db2 = 9223372036854775808.0d;        float fl27 = (float) db2;

		System.out.printf("byte  by1 = (byte)  -128;                  float fl23 = (float) by1; \t%s\n", fl23);
		System.out.printf("short sh1 = (short) -32768;                float fl24 = (float) sh1; \t%s\n", fl24);
		System.out.printf("int   in1 = (int)   -2147483648;           float fl25 = (float) in1 \t%s\n", fl25);
		System.out.printf("long  lo1 = (long)  -9223372036854775808L; float fl26 = (float) lo1 \t%s\n", fl26);
		System.out.printf("double db2 = 9223372036854775808.0d; float fl27 = (long) db2; \t\t%s\n", fl27);

	}
}
