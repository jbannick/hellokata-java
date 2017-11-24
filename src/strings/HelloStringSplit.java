import java.util.Arrays;
import java.util.regex.Pattern;

public class HelloStringSplit {
    private static String string01 = "We hold these truths to be self-evident, " 
        + "that all men are created equal, "
        + "that they are endowed by their Creator with certain unalienable Rights, "
        + "that among these are Life, Liberty and the pursuit of Happiness.";

    private static String string02 = "Work hard. Dream big.";
    private static String string03 = "123abc456DEF789";
    private static String string04 = "123-456789";

    private static String string05 = "Out of the night that covers me,\n" 
        + "Black as the pit from pole to pole,\n"
        + "I thank whatever gods may be\n" + "For my unconquerable soul.";

    public static void main(String... args) {
        System.out.println("Hello String Split!");

        String[] parts01 = string01.split(",");
        String[] parts02 = string01.split(" ");
        String[] parts03 = string01.split(" ", 5);

        System.out.println("---");
        System.out.println("string.split(\",\"); =\n");
        for (String part : parts01) {
            System.out.println(part);
        }
        System.out.println("---");
        System.out.println("string.split(\" \"); =\n");
        for (String part : parts02) {
            System.out.println(part);
        }
        System.out.println("---");
        System.out.println("string.split(\" \", 5); =");
        for (String part : parts03) {
            System.out.println(part);
        }

        String[] parts11 = string02.split("\\.");
        String[] parts12 = string02.split("\\.-1");
        String[] parts13 = string02.split(Pattern.quote("."));

        System.out.println("---");
        System.out.printf("\"Work hard. Dream big.\".split(\"\\.\"); \t\t\t= %s\n", Arrays.toString(parts11));
        System.out.printf("\"Work hard. Dream big.\".split(\"\\.-1\"); \t\t\t= %s\n", Arrays.toString(parts12));
        System.out.printf("\"Work hard. Dream big.\".split(Pattern.quote(\".\")); \t= %s\n", Arrays.toString(parts13));

        String[] parts21 = string03.split("[a-zA-Z]+");
        String[] parts22 = string03.split("\\d+");

        String[] parts23 = string04.split("(?<=-)");
        String[] parts24 = string04.split("(?=-)");

        System.out.println("---");
        System.out.printf("\"123abc456DEF789\".split(\"[a-zA-Z]+\"); \t= %s\n", Arrays.toString(parts21));
        System.out.printf("\"123abc456DEF789\".split(\"\\d+\"); \t\t= %s\n", Arrays.toString(parts22));

        System.out.printf("\"123-456789\".split(\"(?<=-)\"); \t\t= %s\n", Arrays.toString(parts23));
        System.out.printf("\"123-456789\".split(\"(?=-)\"); \t\t= %s\n", Arrays.toString(parts24));

        int countLines = string05.split("\n").length;

        System.out.println("---");
        System.out.printf("string05.split(\"\\n\").length; = <%s>\n", countLines);
    }
}
