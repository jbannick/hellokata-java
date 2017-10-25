
import java.io.Console;
import java.util.Arrays;

public class HelloConsoleIOConsole {
	public static void main(String...args) {
		System.out.println("Hello Console IO Console!");
		
		Console console = System.console();
		if (null == console) {
			System.err.println("Can not instantiate Console");
			System.exit(-1);
		}
		System.out.println("Enter username: ");
		String username = console.readLine("user: ");
		System.out.println(username);
		
		char[] correctPassword = "swordfish".toCharArray();
		System.out.println("Enter password: ");
		char[] password = console.readPassword("password: ");
		if (Arrays.equals(password, correctPassword)) {
			System.out.println("Correct!");
		} else {
			System.out.println("Fail!");
		}
	}
}
