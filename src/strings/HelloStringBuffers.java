import java.time.LocalDate;

public class HelloStringBuffers {
    public static void main(String... args) {
        System.out.println("Hello StringBuffers!");

        // append
        StringBuffer sb01 = new StringBuffer("Hello World!");
        StringBuffer sb02 = new StringBuffer().append("Hello").append(" ").append("World!");
        StringBuffer sb03 = new StringBuffer(":").append(true);
        StringBuffer sb04 = new StringBuffer(":").append('a');
        StringBuffer sb05 = new StringBuffer().append("Hello World!".toCharArray());
        StringBuffer sb06 = new StringBuffer().append("Hello World!".toCharArray(), 6, 6);
        StringBuffer sb07 = new StringBuffer(":").append(Double.MAX_VALUE);
        StringBuffer sb08 = new StringBuffer(":").append(Float.MAX_VALUE);
        StringBuffer sb09 = new StringBuffer(":").append(Integer.MAX_VALUE);
        StringBuffer sb10 = new StringBuffer(":").append(Long.MAX_VALUE);
        StringBuffer sb11 = new StringBuffer(":").append(LocalDate.now());
        StringBuffer sb12 = new StringBuffer().append(new StringBuffer("Hello ")).append(new StringBuffer("World!"));

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\"); \t\t\t\t= <%s>\n", sb01);
        System.out.printf("new StringBuffer().append(\"Hello\").append(\" \").append(\"World!\");\t= <%s>\n", sb02);
        System.out.printf("new StringBuffer(\":\").append(true); \t\t\t\t= <%s>\n", sb03);
        System.out.printf("new StringBuffer(\":\").append('a'); \t\t\t\t= <%s>\n", sb04);
        System.out.printf("new StringBuffer().append(\"Hello World!\".toCharArray()); \t= <%s>\n", sb05);
        System.out.printf("new StringBuffer().append(\"Hello World!\".toCharArray(), 6, 6); \t= <%s>\n", sb06);
        System.out.printf("StringBuffer(\":\").append(Double.MAX_VALUE); \t\t\t= <%s>\n", sb07);
        System.out.printf("new StringBuffer(\":\").append(Float.MAX_VALUE); \t\t\t= <%s>\n", sb08);
        System.out.printf("new StringBuffer(\":\").append(Integer.MAX_VALUE); \t\t= <%s>\n", sb09);
        System.out.printf("new StringBuffer(\":\").append(Long.MAX_VALUE); \t\t\t= <%s>\n", sb10);
        System.out.printf("new StringBuffer().append(LocalDate.now()); \t\t\t= <%s>\n", sb11);
        System.out.printf("new StringBuffer(\"Hello \")).append(new StringBuffer(\"World!\"));\t= <%s>\n", sb12);

        // insert
        StringBuffer sb20 = new StringBuffer("Goodbye World!").insert(8, "Cruel ");
        StringBuffer sb21 = new StringBuffer("::").insert(1, true);
        StringBuffer sb22 = new StringBuffer("Hug duck!").insert(4, ' ').insert(4, 'a');
        StringBuffer sb23 = new StringBuffer("Goodbye World!").insert(8, "Cruel ".toCharArray());
        StringBuffer sb24 = new StringBuffer("::").insert(1, Double.MIN_VALUE);
        StringBuffer sb25 = new StringBuffer("::").insert(1, Float.MIN_VALUE);
        StringBuffer sb26 = new StringBuffer("::").insert(1, Integer.MIN_VALUE);
        StringBuffer sb27 = new StringBuffer("::").insert(1, Long.MIN_VALUE);
        StringBuffer sb28 = new StringBuffer("::").insert(1, LocalDate.now());
        StringBuffer sb29 = new StringBuffer("Hello ").insert(6, new StringBuffer("World!"));

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Goodbye World!\").insert(8, \"Cruel \"); \t\t\t= <%s>\n", sb20);
        System.out.printf("new StringBuffer(\"::\").insert(1, true); \t\t\t\t\t= <%s>\n", sb21);
        System.out.printf("new StringBuffer(\"Hug duck!\").insert(4, ' ').insert(4, 'a'); \t\t= <%s>\n", sb22);
        System.out.printf("new StringBuffer(\"Goodbye World!\").insert(8, \"Cruel \".toCharArray()); \t= <%s>\n", sb23);
        System.out.printf("new StringBuffer(\"::\").insert(1, Double.MIN_VALUE); \t\t\t= <%s>\n", sb24);
        System.out.printf("new StringBuffer(\"::\").insert(1, Float.MIN_VALUE); \t\t\t= <%s>\n", sb25);
        System.out.printf("new StringBuffer(\"::\").insert(1, Integer.MIN_VALUE); \t\t\t= <%s>\n", sb26);
        System.out.printf("new StringBuffer(\"::\").insert(1, Long.MIN_VALUE); \t\t\t= <%s>\n", sb27);
        System.out.printf("new StringBuffer(\"::\").insert(1, LocalDate.now()); \t\t\t= <%s>\n", sb28);
        System.out.printf("new StringBuffer(\"Hello \").insert(6, new StringBuffer(\"World!\")); \t= <%s>\n", sb29);

        // setCharAt
        StringBuffer sb31 = new StringBuffer("Hello World!");
        sb31.setCharAt(11, '?');

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\"); sb30.setCharAt(11, '?'); = <%s>\n", sb31);

        // replace
        StringBuffer sb32 = new StringBuffer("Hello World!").replace(6, 9, "𓃣𓄇𓅂");

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").replace(6, 9, \"𓃣𓄇𓅂\"); = <%s>\n", sb32);

        // reverse
        StringBuffer sb33 = new StringBuffer("Hello World!").reverse();
        StringBuffer sb34 = new StringBuffer("madamimadam").reverse();

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").reverse(); = <%s>\n", sb33);
        System.out.printf("new StringBuffer(\"madamimadam\").reverse(); = <%s>\n", sb34);

        // delete
        StringBuffer sb35 = new StringBuffer("Hello World!").delete(3, 10);
        StringBuffer sb36 = new StringBuffer("Hello World!").deleteCharAt(5);

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").delete(3, 10);   = <%s>\n", sb35);
        System.out.printf("new StringBuffer(\"Hello World!\").deleteCharAt(5); = <%s>\n", sb36);

        // charAt
        char ch01 = new StringBuffer("Hello World!").charAt(6);

        // getChars
        char[] chars02 = "aaaaaaaaa".toCharArray();
        new StringBuffer("cccBBBccc").getChars(3, 6, chars02, 3);

        // substring
        String st01 = new StringBuffer("Hello World!").substring(6);
        String st02 = new StringBuffer("Hello World!").substring(3, 8);

        // subSequence
        String st03 = new StringBuffer("Hello World!").subSequence(3, 8).toString();

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").charAt(6); \t\t\t\t\t= <%s>\n", ch01);
        System.out.printf("new StringBuffer(\"cccBBBccc\").getChars(3, 6, \"aaaaaaaaa\".toCharArray(), 3);\t= <%s>\n",
                new String(chars02));
        System.out.printf("new StringBuffer(\"Hello World!\").substring(6); \t\t\t\t\t= <%s>\n", st01);
        System.out.printf("new StringBuffer(\"Hello World!\").substring(3, 8); \t\t\t\t= <%s>\n", st02);
        System.out.printf("new StringBuffer(\"Hello World!\").subSequence(3, 8); \t\t\t\t= <%s>\n", st03);

        // indexOf
        int idx01 = new StringBuffer("Hello World!").indexOf("World!");

        // lastIndexOf
        int idx02 = new StringBuffer("Hello World!").lastIndexOf("l", 6);

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").indexOf(\"World!\");   = %s\n", idx01);
        System.out.printf("new StringBuffer(\"Hello World!\").lastIndexOf(\"l\", 6); = %s\n", idx02);

        // length
        int len01 = new StringBuffer("Hello World!").length();

        // setLength
        StringBuffer sb41 = new StringBuffer("Hello World!");
        sb41.setLength(5);

        // clear
        StringBuffer sb42 = new StringBuffer("Hello World!");
        sb42.setLength(0);

        System.out.println("---");
        System.out.printf("new StringBuffer(\"Hello World!\").length(); = %s\n", len01);
        System.out.printf("new StringBuffer(\"Hello World!\"); sb41.setLength(5); = <%s>\n", sb41);
        System.out.printf("new StringBuffer(\"Hello World!\"); sb42.setLength(0); = <%s>\n", sb42);
    }
}
