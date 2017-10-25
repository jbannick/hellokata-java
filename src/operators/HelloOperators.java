/**
1. Assignment
2. Arithmetic
3. Unary
4. Equality and Relational
5. Conditional
6. Type Comparison
7. Bitwise
8. Bit Shift
9. Instanceof

 * @author johnbannick
 *
 */

public class HelloOperators {
	public static void main(String...args) {
		System.out.println("Hello Operators!\n");
		
		// Assignment
		System.out.println("1. Assignment:\n");
		int x;
		byte a;
		byte b;
	    boolean bo;
		System.out.printf("x = 1 yields %d\n", (x = 1)); 
		
		// Arithmetic Assignment
		System.out.println("\n2. Arithmetic Assignment:\n");
		x = 1; System.out.printf("%d += 1 yields %d\n", x,  (x += 1));
		x = 1; System.out.printf("%d -= 1 yields %d\n", x,  (x -= 1));
		x = 2; System.out.printf("%d *= 1 yields %d\n", x,  (x *= 2));
		x = 4; System.out.printf("%d /= 1 yields %d\n", x,  (x /= 2));
		x = 4; System.out.printf("%d %%= 2 yields %d\n", x, (x %= 2));
		x = 4; System.out.printf("%d %%= 3 yields %d\n", x, (x %= 3));
				
		// Unary Operators
		System.out.println("\n3. Unary:\n");
		x = 1;  System.out.printf("x =  %d; - x yields %d\n", x,  (- x));
		x = -1; System.out.printf("x = %d; - x yields  %d\n", x,  (- x));
		x = 1;  System.out.printf("x =  %d; ++x yields %d\n", x, ++x);
		x = 1;  System.out.printf("x =  %d; x++ yields ", x); x++; System.out.printf("%d\n", x);
		x = 1;  System.out.printf("x =  %d; --x yields %d\n", x, --x);
		x = 1;  System.out.printf("x =  %d; x-- yields ", x); x--; System.out.printf("%d\n", x);

		bo = true; System.out.printf("b =  %b; ! b yields %b\n", bo,  (! bo));
		
		// Equality and Relational Operators
		System.out.println("\n4. Equality and Relational:\n");
		a = 1; b = 1; System.out.printf("a = %d; b = %d; (a == b) yields %s\n", a, b, (a == b));
		a = 1; b = 1; System.out.printf("a = %d; b = %d; (a != b) yields %s\n", a, b, (a != b));
		a = 2; b = 1; System.out.printf("a = %d; b = %d; (a > b)  yields %s\n", a, b, (a > b));
		a = 2; b = 1; System.out.printf("a = %d; b = %d; (a < b)  yields %s\n", a, b, (a < b));
		a = 2; b = 2; System.out.printf("a = %d; b = %d; (a >= b) yields %s\n", a, b, (a >= b));
		a = 2; b = 2; System.out.printf("a = %d; b = %d; (a <= b) yields %s\n", a, b, (a <= b));

		// Conditional Operators
		System.out.println("\n5. Conditional:\n");
		a = 1; b = 1; System.out.printf("a = %d; b = %d; (a == 1 && b == 1) yields %s\n", a, b, (a == 1 && b == 1));
		a = 1; b = 1; System.out.printf("a = %d; b = %d; (a == 1 && b == 2) yields %s\n", a, b, (a == 1 && b == 2));
		a = 1; b = 2; System.out.printf("a = %d; b = %d; (a == 1 || b == 1) yields %s\n", a, b, (a == 1 || b == 1));
		a = 1; b = 2; System.out.printf("a = %d; b = %d; (a == 2 || b == 1) yields %s\n", a, b, (a == 2 || b == 1));
		
		a = 1; b = 2; System.out.printf("a = %d; b = %d; (a < b) ? %d : %d yields %s\n", a, b, a, b, (a < b) ? a : b);
		a = 1; b = 2; System.out.printf("a = %d; b = %d; (a > b) ? %d : %d yields %s\n", a, b, a, b, (a > b) ? a : b);
		a = 1; b = 2; System.out.printf("a = %d; b = %d; (a > a) ? %d : %d yields %s\n", a, b, a, b, (a > a) ? a : b);

		// Type Comparison Operator
		System.out.println("\n6. Type Comparison:\n");
		Byte by1 = 1; System.out.printf("Byte by1 = 1; (Number) by1 instanceof Byte    yields %s\n", ((Number) by1 instanceof Byte));
		Byte by2 = 1; System.out.printf("Byte by2 = 1; (Number) by2 instanceof Integer yields %s\n", ((Number) by2 instanceof Integer));

		// Bit Shift
		System.out.println("\n7. Bit Shift:\n");
		x = 1; System.out.printf("%d    %s <<=  1 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x <<= 1), HelloBinary.getBinaryString(x));
		x = 1; System.out.printf("%d    %s <<=  2 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x <<= 2), HelloBinary.getBinaryString(x));
		x = 1; System.out.printf("%d    %s <<=  3 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x <<= 3), HelloBinary.getBinaryString(x));

		x = 1000; System.out.printf("%d %s >>=  1 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x >>= 1), HelloBinary.getBinaryString(x));
		x = 1000; System.out.printf("%d %s >>=  2 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x >>= 2), HelloBinary.getBinaryString(x));
		x = 1000; System.out.printf("%d %s >>=  3 yields %d \t\t%s\n", x, HelloBinary.getBinaryString(x), (x >>= 3), HelloBinary.getBinaryString(x));

		x = -1; System.out.printf("%d   %s >>>= 1 yields %d \t%s\n", x, HelloBinary.getBinaryString(x), (x >>>= 1), HelloBinary.getBinaryString(x));
		x = -1; System.out.printf("%d   %s >>>= 2 yields %d \t%s\n", x, HelloBinary.getBinaryString(x), (x >>>= 2), HelloBinary.getBinaryString(x));
		x = -1; System.out.printf("%d   %s >>>= 3 yields %d \t%s\n", x, HelloBinary.getBinaryString(x), (x >>>= 3), HelloBinary.getBinaryString(x));

		// Bitwise
		System.out.println("\n8. Bitwise:\n");
		a = 0b0011_1100; b = 0b0000_1100; System.out.printf("%s &\n%s yields\n%s\n\n", 
				HelloBinary.getBinaryString(a), 
				HelloBinary.getBinaryString(b),  
				HelloBinary.getBinaryString((byte)(a & b)));

		a = 0b0011_1100; b = 0b0000_1100; System.out.printf("%s |\n%s yields\n%s\n\n", 
				HelloBinary.getBinaryString(a), 
				HelloBinary.getBinaryString(b),  
				HelloBinary.getBinaryString((byte)(a | b)));

		a = 0b0011_1100; b = 0b0000_1100; System.out.printf("%s ^\n%s yields\n%s\n\n", 
				HelloBinary.getBinaryString(a), 
				HelloBinary.getBinaryString(b),  
				HelloBinary.getBinaryString((byte)(a ^ b)));

		a = 0b0011_1100; System.out.printf("a = %s; ~a yields %s ", 
				HelloBinary.getBinaryString(a),  
				HelloBinary.getBinaryString((byte)(~a)));
	}
}
