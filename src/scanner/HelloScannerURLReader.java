import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Pattern;
import jdk.nashorn.api.scripting.URLReader;

public class HelloScannerURLReader {

    public static void main(String... args) {
        System.out.println("Hello URL Reader!");

        Pattern jbPattern = Pattern.compile(".*John.*|.*Bannick.*");

        System.out.println("---");

        try (Scanner sc = new Scanner(new URLReader(new URL("http://www.johnbannick.com")))) {
            while (sc.hasNext()) {
                if (sc.hasNext(jbPattern)) {
                    String st01 = sc.next(jbPattern);
                    System.out.printf("sc.next(Pattern.compile(\"*.John.*|.*Bannick.*\")); = %s\n", st01);
                } else {
                    sc.next();
                }
            }
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            System.exit(-1);
        }
    }
}
