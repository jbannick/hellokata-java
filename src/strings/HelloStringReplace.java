public class HelloStringReplace {

    public static void main(String... args) {
        System.out.println("Hello String Replace!");

        String st01 = "Hello World!".replace('l', '*');

        System.out.println("---");
        System.out.printf("\"Hello World!\".replace('l', '*'); = <%s>\n", st01);

        String st02a = "ASCII𓄇𓀰𓃧only𓃣𓅂here𓃒𓅢";
        String st02b = st02a.replaceAll("[^\\p{ASCII}]", "*");
        System.out.printf("%s.replaceAll(\"[^\\\\p{ASCII}]\", \"*\") \t= <%s>\n", st02a, st02b);

        String st03a = "<B>This must not be bold.<\\B>";
        String st03b = st03a.replaceAll("\\<.*?\\>", "");
        System.out.printf("%s.replaceAll(\"\\\\<.*?\\\\>\", \"\"); \t= <%s>\n", st03a, st03b);
    }
}
