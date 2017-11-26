import java.time.LocalDate;

public class HelloStringBuilders {
    public static void main(String... args) {
        System.out.println("Hello StringBuilders!");

        // append
        StringBuilder sb01 = new StringBuilder("Hello World!");
        StringBuilder sb02 = new StringBuilder().append("Hello").append(" ").append("World!");
        StringBuilder sb03 = new StringBuilder(":").append(true);
        StringBuilder sb04 = new StringBuilder(":").append('a');
        StringBuilder sb05 = new StringBuilder().append("Hello World!".toCharArray());
        StringBuilder sb06 = new StringBuilder().append("Hello World!".toCharArray(), 6, 6);
        StringBuilder sb07 = new StringBuilder(":").append(Double.MAX_VALUE);
        StringBuilder sb08 = new StringBuilder(":").append(Float.MAX_VALUE);
        StringBuilder sb09 = new StringBuilder(":").append(Integer.MAX_VALUE);
        StringBuilder sb10 = new StringBuilder(":").append(Long.MAX_VALUE);
        StringBuilder sb11 = new StringBuilder(":").append(LocalDate.now());
        StringBuilder sb12 = new StringBuilder().append(new StringBuilder("Hello ")).append(new StringBuilder("World!"));

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\"); \t\t\t\t\t= <%s>\n", sb01);
        System.out.printf("new StringBuilder().append(\"Hello\").append(\" \").append(\"World!\"); \t= <%s>\n", sb02);
        System.out.printf("new StringBuilder(\":\").append(true); \t\t\t\t\t= <%s>\n", sb03);
        System.out.printf("new StringBuilder(\":\").append('a'); \t\t\t\t\t= <%s>\n", sb04);
        System.out.printf("new StringBuilder().append(\"Hello World!\".toCharArray()); \t\t= <%s>\n", sb05);
        System.out.printf("new StringBuilder().append(\"Hello World!\".toCharArray(), 6, 6); \t\t= <%s>\n", sb06);
        System.out.printf("StringBuilder(\":\").append(Double.MAX_VALUE); \t\t\t\t= <%s>\n", sb07);
        System.out.printf("new StringBuilder(\":\").append(Float.MAX_VALUE); \t\t\t\t= <%s>\n", sb08);
        System.out.printf("new StringBuilder(\":\").append(Integer.MAX_VALUE); \t\t\t= <%s>\n", sb09);
        System.out.printf("new StringBuilder(\":\").append(Long.MAX_VALUE); \t\t\t\t= <%s>\n", sb10);
        System.out.printf("new StringBuilder().append(LocalDate.now()); \t\t\t\t= <%s>\n", sb11);
        System.out.printf("new StringBuilder(\"Hello \")).append(new StringBuilder(\"World!\"));\t= <%s>\n", sb12);

        // insert
        StringBuilder sb20 = new StringBuilder("Goodbye World!").insert(8, "Cruel ");
        StringBuilder sb21 = new StringBuilder("::").insert(1, true);
        StringBuilder sb22 = new StringBuilder("Hug duck!").insert(4, ' ').insert(4, 'a');
        StringBuilder sb23 = new StringBuilder("Goodbye World!").insert(8, "Cruel ".toCharArray());
        StringBuilder sb24 = new StringBuilder("::").insert(1, Double.MIN_VALUE);
        StringBuilder sb25 = new StringBuilder("::").insert(1, Float.MIN_VALUE);
        StringBuilder sb26 = new StringBuilder("::").insert(1, Integer.MIN_VALUE);
        StringBuilder sb27 = new StringBuilder("::").insert(1, Long.MIN_VALUE);
        StringBuilder sb28 = new StringBuilder("::").insert(1, LocalDate.now());
        StringBuilder sb29 = new StringBuilder("Hello ").insert(6, new StringBuilder("World!"));

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Goodbye World!\").insert(8, \"Cruel \"); \t\t= <%s>\n", sb20);
        System.out.printf("new StringBuilder(\"::\").insert(1, true); \t\t\t\t= <%s>\n", sb21);
        System.out.printf("new StringBuilder(\"Hug duck!\").insert(4, ' ').insert(4, 'a'); \t\t= <%s>\n", sb22);
        System.out.printf("new StringBuilder(\"Goodbye World!\").insert(8, \"Cruel \".toCharArray()); \t= <%s>\n", sb23);
        System.out.printf("new StringBuilder(\"::\").insert(1, Double.MIN_VALUE); \t\t\t= <%s>\n", sb24);
        System.out.printf("new StringBuilder(\"::\").insert(1, Float.MIN_VALUE); \t\t\t= <%s>\n", sb25);
        System.out.printf("new StringBuilder(\"::\").insert(1, Integer.MIN_VALUE); \t\t\t= <%s>\n", sb26);
        System.out.printf("new StringBuilder(\"::\").insert(1, Long.MIN_VALUE); \t\t\t= <%s>\n", sb27);
        System.out.printf("new StringBuilder(\"::\").insert(1, LocalDate.now()); \t\t\t= <%s>\n", sb28);
        System.out.printf("new StringBuilder(\"Hello \").insert(6, new StringBuilder(\"World!\")); \t= <%s>\n", sb29);

        // setCharAt
        StringBuilder sb31 = new StringBuilder("Hello World!");
        sb31.setCharAt(11, '?');

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\"); sb30.setCharAt(11, '?'); = <%s>\n", sb31);

        // replace
        StringBuilder sb32 = new StringBuilder("Hello World!").replace(6, 9, "𓃣𓄇𓅂");

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").replace(6, 9, \"𓃣𓄇𓅂\"); = <%s>\n", sb32);

        // reverse
        StringBuilder sb33 = new StringBuilder("Hello World!").reverse();
        StringBuilder sb34 = new StringBuilder("madamimadam").reverse();

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").reverse(); = <%s>\n", sb33);
        System.out.printf("new StringBuilder(\"madamimadam\").reverse();  = <%s>\n", sb34);

        // delete
        StringBuilder sb35 = new StringBuilder("Hello World!").delete(3, 10);
        StringBuilder sb36 = new StringBuilder("Hello World!").deleteCharAt(5);

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").delete(3, 10);   = <%s>\n", sb35);
        System.out.printf("new StringBuilder(\"Hello World!\").deleteCharAt(5); = <%s>\n", sb36);

        // charAt
        char ch01 = new StringBuilder("Hello World!").charAt(6);

        // getChars
        char[] chars02 = "aaaaaaaaa".toCharArray();
        new StringBuilder("cccBBBccc").getChars(3, 6, chars02, 3);

        // substring
        String st01 = new StringBuilder("Hello World!").substring(6);
        String st02 = new StringBuilder("Hello World!").substring(3, 8);

        // subSequence
        String st03 = new StringBuilder("Hello World!").subSequence(3, 8).toString();

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").charAt(6); \t\t\t\t\t= <%s>\n", ch01);
        System.out.printf("new StringBuilder(\"cccBBBccc\").getChars(3, 6, \"aaaaaaaaa\".toCharArray(), 3);\t= <%s>\n",
                new String(chars02));
        System.out.printf("new StringBuilder(\"Hello World!\").substring(6); \t\t\t\t\t= <%s>\n", st01);
        System.out.printf("new StringBuilder(\"Hello World!\").substring(3, 8); \t\t\t\t= <%s>\n", st02);
        System.out.printf("new StringBuilder(\"Hello World!\").subSequence(3, 8); \t\t\t\t= <%s>\n", st03);

        // indexOf
        int idx01 = new StringBuilder("Hello World!").indexOf("World!");

        // lastIndexOf
        int idx02 = new StringBuilder("Hello World!").lastIndexOf("l", 6);

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").indexOf(\"World!\");   = %s\n", idx01);
        System.out.printf("new StringBuilder(\"Hello World!\").lastIndexOf(\"l\", 6); = %s\n", idx02);

        // length
        int len01 = new StringBuilder("Hello World!").length();

        // setLength
        StringBuilder sb41 = new StringBuilder("Hello World!");
        sb41.setLength(5);

        // clear
        StringBuilder sb42 = new StringBuilder("Hello World!");
        sb42.setLength(0);

        System.out.println("---");
        System.out.printf("new StringBuilder(\"Hello World!\").length(); = %s\n", len01);
        System.out.printf("new StringBuilder(\"Hello World!\"); sb41.setLength(5); = <%s>\n", sb41);
        System.out.printf("new StringBuilder(\"Hello World!\"); sb42.setLength(0); = <%s>\n", sb42);
    }
}
