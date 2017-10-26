import java.util.Objects;

public class HelloStringComparison {
	public static void main(String...args) {
		System.out.println("Hello String Comparison!");
		
		// 1. equals
		
		// equals()
				
		boolean bo01 = "string01".equals("string01");
		boolean bo02 = "string01".equals("string02");
		
		System.out.printf("\"string01\".equals(\"string01\"); \t\t= %s\n", bo01);
		System.out.printf("\"string01\".equals(\"string02\"); \t\t= %s\n", bo02);
		
		// Objects.equal()

		boolean bo03 = Objects.equals("string01", "string01");
		boolean bo04 = Objects.equals("string01", "string02");
		boolean bo05 = Objects.equals("string01", null);
				
		System.out.printf("Objects.equals(\"string01\", \"string01\"); = %s\n", bo03);
		System.out.printf("Objects.equals(\"string01\", \"string02\"); = %s\n", bo04);
		System.out.printf("Objects.equals(\"string01\", null); \t= %s\n", bo05);

		// ==
		
		
		// 2. equalsIgnoreCase
		// 3. compareTo
		// 4. compareToIgnoreCase
		// 5. regionMatches
		// 6. matches
		// 7. startsWith
		// 8. endsWith
	}
}
