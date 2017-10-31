import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class HelloDeflaterAndInflaterStreams {
    private static final String FILENAME = "deflated.txt";

    public static void main(String... args) {
        System.out.println("Hello Deflater and Inflater Streams");

        try {
            DeflaterOutputStream dos = 
                new DeflaterOutputStream(new FileOutputStream(new File(FILENAME)));

            for (int i = 0; i < 100; i++) {
                dos.write("Hello World\n".getBytes());
            }
            dos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DeflaterInputStream dis = 
                new DeflaterInputStream(new FileInputStream(new File(FILENAME)));

            for (int i = 0; i < 100; i++) {
                System.out.print(dis.read());
            }
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
