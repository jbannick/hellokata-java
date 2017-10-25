public class HelloDataTypesBoolean {
	public static void main(String...args) {
		System.out.println("Hello Data Types Boolean!");
		
		// The official size of a Boolean is "not precisely defined" 
		// But tests suggest that it is one byte.

		// 1. Value by Assigning a Literal
		
		boolean bo1 = Boolean.FALSE;
		boolean bo2 = Boolean.TRUE;
		
		boolean bo3 = true;
		Boolean bo4 = true;
		
		System.out.printf("boolean bo1 = Boolean.FALSE; \t%s\n", bo1);
		System.out.printf("boolean bo2 = Boolean.TRUE; \t%s\n", bo2);
		System.out.printf("boolean bo3 = true; \t\t%s\n", bo3);
		System.out.printf("Boolean bo4 = true; \t\t%s\n", bo4);

		// 2. Value by Instantiation
		
		Boolean bo5 = new Boolean(true);
		Boolean bo6 = Boolean.valueOf(true);

		System.out.printf("Boolean bo5 = new Boolean(true); \t%s\n", bo5);
		System.out.printf("Boolean bo6 = Boolean.valueOf(true); \t%s\n", bo6);

		// 3. Value by Explicit Conversion
		boolean bo7 = bo5.booleanValue();

		System.out.printf("boolean bo7 = bo5.booleanValue(); \t\t%s\n", bo7);

		// 4. Value by Autoboxing (Implicit Conversion)
		
		boolean bo8 = bo5;
		Boolean bo9 = bo3; 

		System.out.printf("boolean bo8 = bo5; \t\t\t%s\n", bo8);
		System.out.printf("Boolean bo9 = bo3;  \t\t\t%s\n", bo9);

		// 5. Value By Parsing
		
		boolean bo10 = Boolean.parseBoolean("true");
		boolean bo11 = Boolean.valueOf("true");
		boolean bo12 = Boolean.getBoolean("true");

		System.out.printf("boolean bo10 = Boolean.parseBoolean(\"true\");  \t%s\n", bo10);
		System.out.printf("boolean bo11 = Boolean.valueOf(\"true\");  \t%s\n", bo11);
		System.out.printf("boolean bo12 = Boolean.getBoolean(\"true\");  \t%s\n", bo12);

		// 6. Value By Casting
		
		// You cannot cast from another data type to a boolean.
	}
}
