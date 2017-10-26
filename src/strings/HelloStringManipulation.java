import java.util.Arrays;
import java.util.Scanner;

public class HelloStringManipulation {
	private static String string01 = "We hold these truths to be self-evident, " 
		+ "that all men are created equal, " 
		+ "that they are endowed by their Creator with certain unalienable Rights, " 
		+ "that among these are Life, Liberty and the pursuit of Happiness.";
	
	private static String string02 = "My name is Ozymandias";

	public static void main(String...args) {
		System.out.println("Hello String Manipulation!");
		
		// 1. Trim
		
		String str01 = "\n\t   Hello World   \t\n".trim();
		System.out.printf("\"\\n\\t   Hello World   \\t\\n\".trim(); = <%s>\n",  str01);
		
		// 2. Split
		
		String[] parts = string01.split(" ");
		System.out.printf("string.split(\" \"); = %s\n", Arrays.toString(parts));
		
		parts = string01.split(" ", 5);
		System.out.println("string.split(\" \", 5); =");
		for (String part : parts) {
			System.out.println(part);
		}
		
		// 3. Tokenizer
		
		// TODO: Implement <<<<<<<<<<<<<<<<<<
		
		// 4. Scanner

		// TODO: THIS COULD HAVE A BUNCH OF DIFFERENT THINGS TO DEMO <<<<<<<<<<<<<<<<<<

		System.out.println("scanner.next() =");
		Scanner scanner = new Scanner(string02);
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
		
		// 5. Concatenate
		
		String helloWorld = "Hello" + " " + "World";
		System.out.printf("String helloWorld = \"Hello\" + \" \" + \"World\"; = <%s>\n", helloWorld);
		
		// 6. Change Case
		
		String str02 = "Hello World".toLowerCase();
		String str03 = "Hello World".toUpperCase();
		
		System.out.printf("\"Hello World\".toLowerCase(); = <%s>\n", str02);
		System.out.printf("\"Hello World\".toUpperCase(); = <%s>\n", str03);
		
		// 7. Replace
		
		String str04 = "Hello World".replace('l', '*');
		
		System.out.printf("\"Hello World\".replace('l', '*'); = <%s>\n", str04);
		
	}
}
