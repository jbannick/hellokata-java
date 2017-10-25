
public class HelloProgramScope {
	
	static int staticVar = 1;
	
	private int nonStaticGlobalVar = 2;
	
	public static void main(String...args) {
		System.out.println("Hello Program Scope!");
		
		HelloProgramScope hps = new HelloProgramScope();
		hps.method(5);
		
	}
	
	public void method(int argument) {
		
		HelloProgramScope hps = new HelloProgramScope();
		
		this.staticVar = 11;
		
		nonStaticGlobalVar = 22;
		
		System.out.printf("staticVar = %s\n", this.staticVar);
		System.out.printf("nonStaticGlobalVar = %s\n", nonStaticGlobalVar);
		System.out.printf("argument = %s\n", argument);

	}
}
