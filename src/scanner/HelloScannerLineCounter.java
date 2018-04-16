import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloScannerLineCounter {
    private static final String FILENAME = "lorem.txt";
    public static void main(String... args) {
        System.out.println("Hello Scanner Line Counter!");
        int count = 0;
        try {
            Scanner file = new Scanner(new File(FILENAME));
            while (file.hasNextLine()) {
                file.nextLine();
                count++;
            }
            System.out.println(String.format("Found %d lines", count));
        } catch(FileNotFoundException fnf){
            fnf.printStackTrace();
        }
    }
}
