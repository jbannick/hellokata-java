import java.util.Iterator;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HelloScannerMatchResult {
    public static void main(String... args) {
        System.out.println("Hello Scanner MatchResult!");

        // ---

        String string01 = "Scanner 1 2.0 true";

        String string02 = "They seek him here, they seek him there\nThose Frenchies seek him every where";

        Scanner sc = new Scanner(string01);
        String st01 = sc.next();
        MatchResult mr01 = sc.match();

        sc.skip(Pattern.compile(" \\d"));
        MatchResult mr02 = sc.match();

        double db01 = sc.nextDouble();
        MatchResult mr03 = sc.match();

        boolean bo01 = sc.nextBoolean();
        MatchResult mr04 = sc.match();

        sc.close();

        System.out.println("---");
        System.out.println(string01);

        System.out.println("---");
        System.out.printf("sc.next(); = <%s>\n", st01);
        displayMatchResult(mr01);

        System.out.println("---");
        System.out.println("sc.skip(Pattern.compile(\" \\\\d\"));");
        displayMatchResult(mr02);

        System.out.println("---");
        System.out.printf("sc.nextDouble(); = %s\n", db01);
        displayMatchResult(mr03);

        System.out.println("---");
        System.out.printf("sc.nextBoolean(); = %s\n", bo01);
        displayMatchResult(mr04);

        // ---

        sc = new Scanner(string02);

        Stream<MatchResult> matchResults = sc.findAll(Pattern.compile("[ a-z]{2}ere"));

        System.out.println("---");
        System.out.println(string02);

        System.out.println("---");
        System.out.println("sc.findAll(Pattern.compile(\"[ a-z]{2}ere\"));");

        Iterator<MatchResult> it = matchResults.iterator();
        while (it.hasNext()) {
            MatchResult mr = it.next();
            displayMatchResult(mr);
        }

        sc.close();
    }

    static void displayMatchResult(MatchResult mr) {
        System.out.printf("MatchResult: start = %3d, end = %3d, groupCount = %3d, \tgroup = <%s>\n", mr.start(),
                mr.end(), mr.groupCount(), mr.group());
        StringJoiner sj = new StringJoiner(", ");
        if (mr.groupCount() > 0) {
            for (int i = 0; i < mr.groupCount(); i++) {
                sj.add(mr.group(i));
            }
            System.out.printf("%s\n", sj);
        }
    }
}
