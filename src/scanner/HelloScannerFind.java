import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HelloScannerFind {
    public static void main(String... args) {
        System.out.println("Hello Scanner Find!");

        String string01 = "My name is Ozymandias, king of kings: Look on my works, ye Mighty, and despair!";
        String string02 = "They seek him here, they seek him there\nThose Frenchies seek him every where";

        // ---

        Scanner sc = new Scanner(string01);
        String st01 = sc.findInLine("Ozymandias");
        sc.close();
        sc = new Scanner(string01);
        String st02 = sc.findInLine(Pattern.compile("Ozy[a-z]*"));
        sc.close();

        System.out.println("---");
        System.out.println(string01);
        System.out.println("---");

        System.out.printf("sc.findInLine(\"Ozymandius\"); = <%s>\n", st01);
        System.out.printf("sc.findInLine(Pattern.compile(\"Ozy[a-z]*\")); = <%s>\n", st02);

        // ---

        sc = new Scanner(string02);
        List<String> li01 = sc.findAll(Pattern.compile("[ a-z]{2}ere")).map(MatchResult::group)
                .collect(Collectors.toList());
        sc.close();

        System.out.println("---");
        System.out.println(string02);
        System.out.println("---");

        String st10 = String.join("><", li01);
        System.out.printf("sc.findAll(Pattern.compile(\"[ a-z]{2}ere\")); = <%s>\n", st10);

        // ---

        sc = new Scanner(string01);
        String st20 = sc.findWithinHorizon("Ozymandias", 37);
        String st21 = sc.findWithinHorizon("Mighty", 37);
        sc.close();

        System.out.println("---");
        System.out.printf("sc.findWithinHorizon(\"Ozymandias\", 37); = <%s>\n", st20);
        System.out.printf("sc.findWithinHorizon(\"Mighty\", 37); = <%s>\n", st21);

        sc = new Scanner(string01);
        String st30 = sc.findWithinHorizon(Pattern.compile("Ozy[a-z]*"), 37);
        String st31 = sc.findWithinHorizon(Pattern.compile("Mig[a-z]*"), 37);
        sc.close();

        System.out.println("---");
        System.out.printf("sc.findWithinHorizon(Pattern.compile(\"Ozy[a-z]*\"), 37); = <%s>\n", st30);
        System.out.printf("sc.findWithinHorizon(Pattern.compile(\"Mig[a-z]*\"), 37); = <%s>\n", st31);
    }
}
