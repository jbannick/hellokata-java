import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloBufferedInputAndOutputStreams {
    private static String FILENAME = "test.txt";
    private static final int LINECOUNT = 5;

    public static void main(String... args) {
        System.out.println("Hello Buffered Input and Output Streams!");

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(FILENAME)));) {

            for (int i = 0; i < LINECOUNT; i++) {
                bos.write("Hello World\n".getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(FILENAME)));) {

            while (bis.available() != 0) {
                System.out.print((char) bis.read());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
