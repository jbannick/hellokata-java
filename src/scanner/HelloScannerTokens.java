import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HelloScannerTokens {
    public static void main(String... args) {
        System.out.println("Hello Scanner Tokens!");

        try (Scanner sc = new Scanner("abc,def,,ghi")) {
            List<String> result = sc
                .useDelimiter(",")
                .tokens()
                .collect(Collectors.toList());
            System.out.println(result);
        }
    }
}
