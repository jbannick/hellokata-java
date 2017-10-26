
public class HelloSubstrings {
	static private String string = "We hold these truths to be self-evident, " 
		+ "that all men are created equal, " 
		+ "that they are endowed by their Creator with certain unalienable Rights, " 
		+ "that among these are Life, Liberty and the pursuit of Happiness.";
	
	public static void main(String...args) {
		System.out.println("Hello Substrings!");
		
		System.out.printf("\n%s\n\n", string);
		
		// 1. Substrings
		
		String str01 = string.substring(string.length() - 10);
		String str02 = string.substring(0,  40);
		
		System.out.printf("string.substring(string.length() - 10); = <%s>\n", str01);
		System.out.printf("string.substring(0,  40); = <%s>\n", str02);
		
		System.out.println("--------------------");
		
		// 2. Subsequences
		
		CharSequence csq01 = string.subSequence(string.length() - 10, string.length());
		CharSequence csq02 = string.subSequence(0, 40);
		
		System.out.printf("string.subSequence(string.length() - 10, string.length()); = <%s>\n", csq01);
		System.out.printf("string.subSequence(0,  40); = <%s>\n", csq02);
	}
}
