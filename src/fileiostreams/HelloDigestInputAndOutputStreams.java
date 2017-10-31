import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelloDigestInputAndOutputStreams {

    private static final String FILENAME = "md5.txt";

    public static void main(String... args) {
        System.out.println("Hello Digest Input and Output Streams");

        try (DigestOutputStream dos = new DigestOutputStream(new FileOutputStream(FILENAME),
                MessageDigest.getInstance("md5"))) {

            for (int i = 0; i < 100; i++) {
                dos.write("Hello World\n".getBytes());
            }

            MessageDigest md = dos.getMessageDigest();
            String digestStr = new BigInteger(1, md.digest()).toString(16);
            System.out.printf("Message Digest after writing: %s\n", digestStr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DigestInputStream dis = new DigestInputStream(new FileInputStream(FILENAME),
                MessageDigest.getInstance("md5"))) {

            while (dis.read() != -1) {
                // null-op
            }

            MessageDigest md = dis.getMessageDigest();
            String digestStr = new BigInteger(1, md.digest()).toString(16);
            System.out.printf("Message Digest after reading: %s\n", digestStr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
