import java.util.Formatter;

public class HelloFormatting {
	public static void main(String...args) {
		System.out.println("Hello Formatting!");
		int x = 1; 
		String s1 = String.format("x = %d", x);
		System.out.println(s1);
		System.out.format("x = %d\n", x);
		StringBuffer sb = new StringBuffer();
		Formatter fmtr = new Formatter(sb);
		fmtr.format("x = %d", x);
		System.out.println(sb.toString());
		
		//TODO: FORMAT SPECIFIERS: %s, %d, etc
		
		//TODO: WHICH SPECIFIERS? BIGDECIMAL?
		
		//TODO: SPECIFYING WIDTH
		
		//TODO: PADDING, TRUNCATING
		
		//TODO: SIGNS (AND PAREN)
		
		//TODO: DATA AND TIME FORMATTING
		
		//TODO: ARGUMENT INDEX: 1$
		
		//TODO: CLASS FORMATTER: CONSTRUCTORS, METHODS
		
		//NOTE: PUT INTERNATIONALIZATION IN SEPARATE KATA

	}
}
