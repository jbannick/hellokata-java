
public class HelloStringTrim {

    public static void main(String... args) {
        System.out.println("Hello String Trim!");

        String str01 = "\n\t   Hello World!   \t\n".trim();

        System.out.printf("\"\\n\\t   Hello World!   \\t\\n\".trim(); = <%s>\n", str01);
    }
}
