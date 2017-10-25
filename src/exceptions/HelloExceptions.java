import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloExceptions {
	public static void main(String...args) {
		System.out.println("Hello Exceptions!");
		
		String filename = "nonexistent.dat";
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileInputStream fis = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			System.out.printf("FAILED to find file<%s>\n", filename);
			e.printStackTrace();
		}
		
		filename = "potential.txt";
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(filename));
			bw.write("abc");
			bw.flush();
			bw.close();
			bw.write("def");
		} catch (IOException e) {
			System.out.printf("Got IOException writing file<%s> - %s\n", filename, e);
			e.printStackTrace();
		}
		
//		Console con = System.console();
//		InputStreamReader isr = new InputStreamReader(System.in);
//		try {
//			isr.close();
//			String string = con.readLine("%s", "Enter a line:");
//		} catch (IOException e) {
//			System.out.printf("Got IOException. %s\n", e);
//			e.printStackTrace();
//		} catch (IOError ioe) {
//			System.out.printf("Got Error. %s\n", ioe);
//			ioe.printStackTrace();
//			
//		}
		
		
	}
}
