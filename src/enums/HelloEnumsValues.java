public class HelloEnumsValues {
	
	public enum Simplest {A, B, C}
	
	public static void main(String...args) {
		System.out.println("Hello Enums Values!");
		
		Simplest[] s = Simplest.values();
		
		System.out.println(
			"Simplest[] s = Simplest.values(); for (int i = 0; i< s.length; i++)...");
		for (int i = 0; i< s.length; i++) {
			System.out.printf("s[%s] =  %s\n", i, s[i]);
		}
		
		System.out.println("for(Simplest s2 : Simplest.values())...");
		for (Simplest s2 : Simplest.values()) {
			System.out.printf("s2 =  %s\n", s2);
		}
	}
}
