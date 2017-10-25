import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class HelloPushbackInputStream {
	public static void main(String...args) {
		System.out.println("Hello PushbackInputStream!");
		
		byte bytes[] = "x--y-zy--xy".getBytes();
		
		PushbackInputStream pis = new PushbackInputStream(
			new ByteArrayInputStream(bytes)
		);
		
		int c;
		try {
			while ( (c = pis.read()) != -1) {
				if ('-' == c) {
					int nextC;
					
					if ( (nextC = pis.read()) == '-') {
						System.out.print("**");
					} else {
						pis.unread(nextC);
						System.out.print((char)c);
					}
				} else {
					System.out.print((char)c);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
