import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;


public class HelloCheckedInputAndOutputStreams {
	private static final String FILENAME = "checkediostreams.txt";
	public static void main(String...args) {
		System.out.println("Hello Checked Input and Output Streams!");

		long cksumOut = 0;
		try {
			
			CheckedOutputStream cos = new CheckedOutputStream(
					new FileOutputStream(FILENAME),  new CRC32());
			
			for (int i = 0; i < 100; i++) {
				cos.write("Hello World\n".getBytes());
			}

			cos.close();
			
			cksumOut = cos.getChecksum().getValue();
			System.out.printf("cksumOut %s\n", Long.toHexString(cksumOut));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// TODO: Use Adler32 checksum
		// TODO: How do we use MD5 and SHA-1???
		
		long cksumIn = 0;
		try {
			CheckedInputStream cis = new CheckedInputStream(
				new FileInputStream(FILENAME), new CRC32());
			
			while (cis.available() > 0)  {
				System.out.print((char)cis.read());
			}
			cis.close();
			cksumIn = cis.getChecksum().getValue();
			System.out.printf("cksumIn %s\n", Long.toHexString(cksumIn));
			
			if (cksumIn == cksumOut) {
				System.out.println("CHecksums are equal");
			} else {
				System.err.println("CHecksums NOT equal");				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
