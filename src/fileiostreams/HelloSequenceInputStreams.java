import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class HelloSequenceInputStreams {
	private static String FILENAME01 = "hello.txt";
	private static String FILENAME02 = "world.txt";
	private static final int LINECOUNT = 5;
	
	public static void main(String...args) {
		System.out.println("Hello Sequence Input Streams!");
		
		try (
			BufferedOutputStream bos01 = new BufferedOutputStream(
				new FileOutputStream(
					new File(FILENAME01)));
				
			BufferedOutputStream bos02 = new BufferedOutputStream(
				new FileOutputStream(
					new File(FILENAME02)));
			) {
			
			for (int i = 0; i < LINECOUNT; i++)  {
				bos01.write("Hello\n".getBytes());
				bos02.write("World\n".getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (			
			FileInputStream fis01 = new FileInputStream(
				new File(FILENAME01));
				
			FileInputStream fis02 = new FileInputStream(
				new File(FILENAME02));

			SequenceInputStream sis = new SequenceInputStream(fis01, fis02);
			) {

			int data = sis.read();
			while (data != -1) {
				System.out.print((char)data);
				data = sis.read();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
