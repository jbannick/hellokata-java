import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloConsoleIOBufferedReader {
    public static void main(String... args) {
        System.out.println("Hello Console IO Buffered Reader!");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter something: ");
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
