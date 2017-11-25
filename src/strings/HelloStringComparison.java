import java.util.Objects;

public class HelloStringComparison {
    public static void main(String... args) {
        System.out.println("Hello String Comparison!");

        // equals()

        boolean bo01 = "string01".equals("string01");
        boolean bo02 = "string01".equals("string02");

        System.out.println("---");
        System.out.printf("\"string01\".equals(\"string01\"); \t\t= %s\n", bo01);
        System.out.printf("\"string01\".equals(\"string02\"); \t\t= %s\n", bo02);

        // Objects.equals()

        boolean bo10 = Objects.equals("string01", "string01");
        boolean bo11 = Objects.equals("string01", "string02");
        boolean bo12 = Objects.equals("string01", null);
        String st01 = "string";
        String st02 = "string";
        boolean bo13 = Objects.equals(st01, st02);
        String st03 = "string01";
        String st04 = "string02";
        boolean bo14 = Objects.equals(st03, st04);

        boolean bo15 = st01.intern() == "string";
        boolean bo16 = st02.intern() == "string";
        boolean bo17 = st01 == st02;
        boolean bo18 = "string" == "string";
        boolean bo19 = new String("string") == "string";

        System.out.println("---");
        System.out.printf("st01 = \"string\";   st02 = \"string\";\n");
        System.out.printf("st03 = \"string01\"; st04 = \"string02\"\n\n");

        System.out.printf("Objects.equals(\"string01\", \"string01\"); = %s\n", bo10);
        System.out.printf("Objects.equals(\"string01\", \"string02\"); = %s\n", bo11);
        System.out.printf("Objects.equals(\"string01\", null); \t= %s\n", bo12);
        System.out.printf("Objects.equals(st01, st02); \t\t= %s\n", bo13);
        System.out.printf("Objects.equals(st03, st04); \t\t= %s\n", bo14);

        System.out.println("---");
        System.out.printf("st01.intern() == \"string\"; \t\t= %s\n", bo15);
        System.out.printf("st02.intern() == \"string\"; \t\t= %s\n", bo16);
        System.out.printf("st01 == st02; \t\t\t\t= %s\n", bo17);
        System.out.printf("\"string\" == \"string\"; \t\t\t= %s\n", bo18);
        System.out.printf("new String(\"string\") == \"string\"; \t= %s\n", bo19);

        // equalsIgnoreCase

        boolean bo20 = "string".equalsIgnoreCase("STRING");

        System.out.println("---");
        System.out.printf("string\".equalsIgnoreCase(\"STRING\"); = %s\n", bo20);

        // compareTo

        System.out.println("---");
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.printf("%3c ", (char) i);
        }
        System.out.print("\n\n");
        for (int i = 97; i <= 122; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
        for (int i = 97; i <= 122; i++) {
            System.out.printf("%3c ", (char) i);
        }
        System.out.print("\n\n");

        int int30 = "bbb".compareTo("ccc");
        int int31 = "bbb".compareTo("bbb");
        int int32 = "bbb".compareTo("aaa");
        int int33 = "aaa".compareTo("zzz");
        int int34 = "zzz".compareTo("aaa");

        int int35 = "BBB".compareTo("ccc");
        int int36 = "BBB".compareTo("bbb");
        int int37 = "BBB".compareTo("aaa");
        int int38 = "AAA".compareTo("zzz");
        int int39 = "ZZZ".compareTo("aaa");

        System.out.printf("\"bbb\".compareTo(\"ccc\"); = %s\n", int30);
        System.out.printf("\"bbb\".compareTo(\"bbb\"); = %s\n", int31);
        System.out.printf("\"bbb\".compareTo(\"aaa\"); = %s\n", int32);
        System.out.printf("\"aaa\".compareTo(\"zzz\"); = %s\n", int33);
        System.out.printf("\"zzz\".compareTo(\"aaa\"); = %s\n", int34);

        System.out.println("---");
        System.out.printf("\"BBB\".compareTo(\"ccc\"); = %s\n", int35);
        System.out.printf("\"BBB\".compareTo(\"bbb\"); = %s\n", int36);
        System.out.printf("\"BBB\".compareTo(\"aaa\"); = %s\n", int37);
        System.out.printf("\"AAA\".compareTo(\"zzz\"); = %s\n", int38);
        System.out.printf("\"ZZZ\".compareTo(\"aaa\"); = %s\n", int39);

        // compareToIgnoreCase

        int int41 = "bbb".compareToIgnoreCase("CCC");
        int int42 = "bbb".compareToIgnoreCase("BBB");
        int int43 = "bbb".compareToIgnoreCase("AAA");
        int int44 = "aaa".compareToIgnoreCase("ZZZ");
        int int45 = "ZZZ".compareToIgnoreCase("aaa");

        System.out.println("---");
        System.out.printf("\"bbb\".compareToIgnoreCase(\"CCC\"); = %s\n", int41);
        System.out.printf("\"bbb\".compareToIgnoreCase(\"BBB\"); = %s\n", int42);
        System.out.printf("\"bbb\".compareToIgnoreCase(\"AAA\"); = %s\n", int43);

        System.out.printf("\"aaa\".compareToIgnoreCase(\"ZZZ\"); = %s\n", int44);
        System.out.printf("\"ZZZ\".compareToIgnoreCase(\"aaa\"); = %s\n", int45);

        // contentEquals

        StringBuffer sb05 = new StringBuffer("Hello World!");
        StringBuilder sb06 = new StringBuilder("Hello World!");

        boolean bo50 = "Hello World!".contentEquals("Hello World!");
        boolean bo51 = "Hello World!".contentEquals("World Hello!");
        boolean bo52 = "Hello World!".contentEquals("HELLO WORLD!");
        boolean bo53 = "Hello World!".contentEquals(sb05);
        boolean bo54 = "Hello World!".contentEquals(sb06);

        System.out.println("---");
        System.out.printf("\"Hello World!\".contentEquals(\"Hello World!\"); = %s\n", bo50);
        System.out.printf("\"Hello World!\".contentEquals(\"World Hello!\"); = %s\n", bo51);
        System.out.printf("\"Hello World!\".contentEquals(\"HELLO WORLD!\"); = %s\n", bo52);
        System.out.printf("\"Hello World!\".contentEquals(new StringBuffer(\"Hello World!\")); = %s\n", bo53);
        System.out.printf("\"Hello World!\".contentEquals(new StringBuilder(\"Hello World!\")); = %s\n", bo54);

        // regionMatches
        boolean bo60 = "Hello World!".regionMatches(6, "World!", 0, 6);
        boolean bo61 = "Hello World!".regionMatches(0, "World!", 0, 6);

        boolean bo62 = "Hello World!".regionMatches(true, 6, "WORLD!", 0, 6);

        System.out.println("---");
        System.out.printf("\"Hello World!\".regionMatches(6, \"World!\", 0, 6); = %s\n", bo60);
        System.out.printf("\"Hello World!\".regionMatches(0, \"World!\", 0, 6); = %s\n", bo61);
        System.out.printf("\"Hello World!\".regionMatches(6, \"WORLD!\", 0, 6); = %s\n", bo62);

        // matches Regex

        boolean bo70 = "Hello World!".matches(".*World!$");
        boolean bo71 = "Hello World!".matches(".*llo Wor.*");
        boolean bo72 = "Hello World!".matches("^Hello.*");

        System.out.println("---");
        System.out.printf("\"Hello World!\".matches(\".*World!$\"); = %s\n", bo70);
        System.out.printf("\"Hello World!\".matches(\".*llo Wor.*\"); = %s\n", bo71);
        System.out.printf("\"Hello World!\".matches(\"^Hello.*\"); = %s\n", bo72);

        // startsWith

        boolean bo80 = "Hello World!".startsWith("Hello");
        boolean bo81 = "¡Hola Mundo!".startsWith("Hello");

        System.out.println("---");
        System.out.printf("\"Hello World!\".startsWith(\"Hello\"); = %s\n", bo80);
        System.out.printf("¡Hola Mundo!\".startsWith(\"Hello\"); = %s\n", bo81);

        // endsWith

        boolean bo90 = "Hello World!".endsWith("World!");
        boolean bo91 = "Hello World!".endsWith("Mundo!");

        System.out.println("---");
        System.out.printf("\"Hello World!\".endsWith(\"World!\"); = %s\n", bo90);
        System.out.printf("\"Hello World!\".endsWith(\"Mundo!\"); = %s\n", bo91);
    }
}
