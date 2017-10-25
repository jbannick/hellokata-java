import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class HelloGZIPInputAndOutputStreams {
	
	private static final String FILENAME = "gzipped.zip";
	
	public static void main(String...args) {
		System.out.println("Hello GZIP Input and Output Streams!");
		
		try(GZIPOutputStream gos = new GZIPOutputStream(
				new FileOutputStream(FILENAME)
			)) {
			
			for (int i = 0; i < 10; i++) {
				gos.write("Hello GZIP\n".getBytes("UTF-8"));
			}
			
			gos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		InputStream fileStream;
		try {
			fileStream = new FileInputStream(FILENAME);
			InputStream gzipStream = new GZIPInputStream(fileStream);
			Reader decoder = new InputStreamReader(gzipStream, "UTF-8");
			BufferedReader buffered = new BufferedReader(decoder);
			char[] buffer = new char[1024];
			int bytesRead = buffered.read(buffer);
			while (bytesRead != -1) {
				bytesRead = buffered.read(buffer);
				System.out.println(buffer);
			}
			buffered.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try(GZIPInputStream gis = new GZIPInputStream(
//				new FileInputStream(FILENAME)
//			)) {
//			
//			byte[] buffer = new byte[1024];
//			
//			int bytesRead = gis.read(buffer);
//			while (bytesRead != -1) {
//				bytesRead = gis.read(buffer);
//				System.out.println(buffer);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
}
