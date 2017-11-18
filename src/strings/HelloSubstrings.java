public class HelloSubstrings {
    static private String string = "We hold these truths to be self-evident,\n" + "that all men are created equal,\n"
            + "that they are endowed by their Creator with certain unalienable Rights,\n"
            + "that among these are Life, Liberty and the pursuit of Happiness.";

    public static void main(String... args) {
        System.out.println("Hello Substrings!");

        System.out.printf("\n%s\n\n", string);
        System.out.printf("length = %s\n\n", string.length());

        // 1. Substrings

        String str01 = string.substring(0, 40);
        String str02 = string.substring(3, 7);
        String str03 = string.substring(199);
        String str04 = string.substring(string.length() - 10);

        System.out.printf("string.substring(0,  40); = <%s>\n", str01);
        System.out.printf("string.substring(3, 7); = <%s>\n", str02);
        System.out.printf("string.substring(199); = <%s>\n", str03);
        System.out.printf("string.substring(string.length() -10); = <%s>\n", str04);

        System.out.println("--------------------");

        // 2. Subsequences

        CharSequence csq01 = string.subSequence(string.length() -10, string.length());
        CharSequence csq02 = string.subSequence(0, 40);

        System.out.printf("string.subSequence(string.length() -10, string.length()); = <%s>\n", csq01);
        System.out.printf("string.subSequence(0,  40); = <%s>\n", csq02);        
    }
}
