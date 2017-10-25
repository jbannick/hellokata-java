
// TODO: INCLUDE STATIC ABSTRACT CLASS

public class HelloStaticClasses {
	
	static class StaticClass {
		static String sString = "Original String in StaticClass";
	}
	public static void main(String...args) {
		System.out.println("Hello Static Classes!");
		
		System.out.printf("StaticClass.sString = %s\n", StaticClass.sString);
		StaticClass.sString = "String put in StaticClass";
		System.out.printf("StaticClass.sString = %s\n", StaticClass.sString);
	}
}
