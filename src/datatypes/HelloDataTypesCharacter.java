import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.List;

public class HelloDataTypesCharacter {
    public static void main(String... args) {
        System.out.println("Hello Data Types Character!");

        System.out.printf("size: %s\n", Character.SIZE);

        System.out.printf("MIN_CODE_POINT = \t\t%,d\n", Character.MIN_CODE_POINT);
        System.out.printf("MIN_SUPPLEMENTARY_CODE_POINT = \t%,d\n", Character.MIN_SUPPLEMENTARY_CODE_POINT);
        System.out.printf("MAX_CODE_POINT = \t\t%,d\n", Character.MAX_CODE_POINT);

        // 1. Value by Assigning a Literal

        char ch1 = Character.MIN_VALUE;
        char ch2 = Character.MAX_VALUE;

        char ch3 = 'a';
        char ch4 = '~';

        char ch5 = '\u0061';
        char ch6 = '\u007e';

        System.out.printf("Character.MIN_VALUE; \t0x%04x\n", (short) ch1);
        System.out.printf("Character.MAX_VALUE; \t0x%04x\n", (short) ch2);
        System.out.printf("char ch3 = 'a'; \t\t%s\n", ch3);
        System.out.printf("char ch4 = '~'; \t\t%s\n", ch4);
        System.out.printf("char ch5 = '\\u0061'; \t%s\n", ch5);
        System.out.printf("char ch6 = '\\u007e'; \t%s\n", ch6);

        // 2. Value by Instantiation

        Character ch8 = Character.valueOf('a');

        System.out.printf("Character ch8 = Character.valueOf('a'); \t%s\n", ch8);

        // 3. Value by Explicit Conversion

        char ch9 = ch8.charValue();

        System.out.printf("char ch9 = ch7.charValue(); \t\t%s\n", ch9);

        // 4. Value by Autoboxing

        char ch10 = ch8;

        System.out.printf("char ch10 = ch7; \t\t\t%s\n", ch10);

        // 5. Value by Parsing

        // There is no parsing method

        // 6. Value by Casting

        byte by1 = 97;
        char ch11 = (char) by1;
        short sh1 = 97;
        char ch12 = (char) sh1;
        int in1 = 97;
        char ch13 = (char) in1;
        long lo1 = 97L;
        char ch14 = (char) lo1;

        System.out.printf("byte by1  = 97;  char ch11 = (char) by1; \t\t\t\t%s\n", ch11);
        System.out.printf("short sh1 = 97;  char ch12 = (char) sh1; \t\t\t\t%s\n", ch12);
        System.out.printf("int in1   = 97;  char ch13 = (char) in1; \t\t\t\t%s\n", ch13);
        System.out.printf("long lo1  = 97L; char ch14 = (char) lo1; \t\t\t\t%s\n", ch14);

        // 7. Value from String, StringBuffer

        String st1 = "a";
        char ch15 = st1.charAt(0);

        StringBuffer sb = new StringBuffer("a");
        char ch16 = sb.charAt(0);

        System.out.printf("String st1 = \"a\"; char ch15 = st1.charAt(0); \t\t\t\t%s\n", ch15);
        System.out.printf("StringBuffer sb = new StringBuffer(\"a\"); char ch16 = sb.charAt(0);\t%s\n", ch16);

        // 8. Value by Code Point

        int cp1 = "a".codePointAt(0);
        char[] chars = Character.toChars(cp1);
        char ch17 = String.copyValueOf(chars).charAt(0);

        int cp2 = "ä".codePointAt(0);
        char[] chars2 = Character.toChars(cp2);
        char ch18 = String.copyValueOf(chars2).charAt(0);
        int cp3 = "𓂀".codePointAt(0);
        char[] chars3 = Character.toChars(cp3);
        String st19 = String.copyValueOf(chars3);

        System.out.printf("int cp1 = \"a\".codePointAt(0); \t%s\n", cp1);
        System.out.printf("char ch17 = String.copyValueOf(Character.toChars(cp1)).charAt(0); \t%s\n", ch17);

        System.out.printf("int cp2 = \"ä\".codePointAt(0); \t%s\n", cp2);
        System.out.printf("char ch18 = String.copyValueOf(Character.toChars(cp2)).charAt(0); \t%s\n", ch18);
        System.out.printf("int cp3 = \"𓂀\".codePointAt(0); \t%s\n", cp3);
        System.out.printf("String st19 = String.copyValueOf(Character.toChars(cp3)).charAt(0); \t%s\n", st19);

        // display(Character.UnicodeBlock.BASIC_LATIN);
        // display(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        // display(Character.UnicodeBlock.EGYPTIAN_HIEROGLYPHS);
    }

    static int[] findCodepointsInUnicodeBlock(Character.UnicodeBlock ub) {
        List<Integer> codePoints = new ArrayList<>();
        for (int codePoint = Character.MIN_CODE_POINT; codePoint <= Character.MAX_CODE_POINT; codePoint++) {
            if (UnicodeBlock.of(codePoint) == ub) {
                codePoints.add(codePoint);
            }
        }
        int[] cp = new int[codePoints.size()];
        for (int i = 0; i < codePoints.size(); i++) {
            cp[i] = codePoints.get(i);
        }
        return cp;
    }

    static void display(Character.UnicodeBlock ub) {
        StringBuilder sb = new StringBuilder();
        System.out.printf("%s:\n", ub.toString());
        int[] codePoints = findCodepointsInUnicodeBlock(ub);
        for (int i = 0; i < codePoints.length; i++) {
            int codePoint = codePoints[i];
            if (Character.isISOControl(codePoint)) {
                System.out.printf("%s ", '\u25CF');
            } else {
                if (Character.isSupplementaryCodePoint(codePoint)) {
                    sb.setLength(0);
                    sb.appendCodePoint(codePoint).toString();
                    System.out.printf("[%s] ", sb.toString());
                } else {
                    System.out.printf("%s ", (char) codePoint);
                }
            }
            if (i > 1 && i % 50 == 0) {
                System.out.println("\n");
            }
        }
        System.out.println("\n");
    }
}
