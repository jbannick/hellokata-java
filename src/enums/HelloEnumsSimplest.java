public class HelloEnumsSimplest {
	
	public enum Simplest {A, B, C}
	
	public static void main(String...args) {
		System.out.println("Hello Enums Simplest!");
		
		Simplest simplestA = Simplest.A;
		System.out.printf("SimplestA = %s\n", simplestA);
		System.out.printf("Simplest.B = %s\n", Simplest.B);
	}
}
