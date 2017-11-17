import java.time.LocalDateTime;
import java.util.Arrays;

public class HelloStrings {
    public static void main(String... args) {
        System.out.println("Hello Strings!");

        // 1. Value by Assigning a Literal

        String str01 = "Hello World!";

        System.out.printf("\nString str01 = \"Hello World!\" = <%s>\n", str01);

        // 2. Value by Instantiation

        String str02 = new String();
        String str03 = new String("Hello World!");
        String str04 = new String("Hello World!".getBytes());
        String str05 = new String("Hello World!".getBytes(), 6, 6);

        String str06 = new String("Hello World!".toCharArray());
        String str07 = new String("Hello World!".toCharArray(), 0, 6);

        System.out.printf("new String(); = <%s>\n", str02);
        System.out.printf("new String(\"Hello World!\"); = <%s>\n", str03);
        
        System.out.println("---");
        System.out.printf("new String(\"Hello World!\".getBytes()); = <%s>\n", str04);
        System.out.printf("new String(\"Hello World!\".getBytes(), 6, 5); = <%s>\n", str05);

        System.out.println("---");
        System.out.printf("new String(\"Hello World!\".toCharArray()); = <%s>\n", str06);
        System.out.printf("new String(\"Hello World!\".toCharArray(), 0, 6); = <%s>\n", str07);

        // 3. Value by Explicit Conversion

        String str08 = String.valueOf(true);
        String str09 = String.valueOf(Integer.MAX_VALUE);
        String str10 = String.valueOf(Float.MAX_VALUE);
        String str11 = String.valueOf(Double.MAX_VALUE);

        String str12 = String.valueOf('a');
        String str13 = String.valueOf("Hello World!".toCharArray());
        String str14 = String.valueOf("Hello World!".toCharArray(), 6, 6);

        String str15 = String.valueOf(LocalDateTime.now());

        System.out.println("---");
        System.out.printf("String.valueOf(true); = <%s>\n", str08);
        System.out.printf("String.valueOf(Integer.MAX_VALUE); = <%s>\n", str09);
        System.out.printf("String.valueOf(Float.MAX_VALUE); = <%s>\n", str10);
        System.out.printf("String.valueOf(Double.MAX_VALUE); = <%s>\n", str11);

        System.out.println("---");
        System.out.printf("String.valueOf('a'); = <%s>\n", str12);
        System.out.printf("String.valueOf(\"Hello World!\".toCharArray()); = <%s>\n", str13);
        System.out.printf("String.valueOf(\"Hello World!\".toCharArray(), 6, 6); = <%s>\n", str14);

        System.out.printf("String.valueOf(LocalDateTime.now()); = <%s>\n", str15);

        // 4. Value by Implicit Conversion (autoboxing)
        
        Character ch = 'a';
        
        System.out.println("---");
        System.out.printf("Character ch = \'a\'; = <%s>\n", ch);
        
        // 5. Value by toString()

        Boolean bo01  = true;
        String  str16 = bo01.toString();
        
        Short   sh01  = Short.MAX_VALUE;
        String  str17 = sh01.toString();
        
        Integer in01  = Integer.MAX_VALUE;
        String  str18 = in01.toString();
        
        Long    lo01  = Long.MAX_VALUE;
        String  str19 = lo01.toString();
        
        Float   fl01  = Float.MAX_VALUE;
        String  str20 = fl01.toString();
        
        Double  db01  = Double.MAX_VALUE;
        String  str21 = db01.toString();
        
        String  str22 = Character.valueOf('a').toString();
        String  str23 = LocalDateTime.now().toString();

        System.out.println("---");
        System.out.printf("boolean   bo01 = true; String str16 = bo01.toString(); = <%s>\n", str16);
        System.out.printf("short     sh01 = Short.MAX_VALUE; String str17 = sh01.toString(); = <%s>\n", str17);
        System.out.printf("Integer   in01 = Integer.MAX_VALUE; String str18 = in01.toString(); = <%s>\n", str18);
        System.out.printf("Long      lo01 = Long.MAX_VALUE; String str19 = lo01.toString(); = <%s>\n", str19);
        System.out.printf("Float     fl01 = Float.MAX_VALUE; String str20 = fl01.toString(); = <%s>\n", str20);
        System.out.printf("Double    db01 = Double.MAX_VALUE; String str21 = db01.toString(); = <%s>\n", str21);
        System.out.printf("String    st22 = Character.valueOf('a').toString(); = <%s>\n", str22);
        System.out.printf("String    st23 = LocalDateTime.now().toString(); = <%s>\n", str23);

        // 6. Value by Reference
        
        String str24 = str01.intern();
        
        System.out.println("---");
        System.out.printf("str01.intern(); = <%s>\n", str24);

        // 7. Getting Characters

        char[] chars = new char[5];
        "Hello World!".getChars(0, 5, chars, 0);
        
        System.out.println("---");
        System.out.printf(
            "char[] chars = new char[5]; \"Hello World!\".getChars(0, 5, chars, 0); = %s\n",
            Arrays.toString(chars));

        // 8. Getting Bytes

        byte[] bytes = "Hello World!".getBytes();
        
        System.out.printf("byte[] bytes = \"Hello World!\".getBytes(); = %s\n", Arrays.toString(bytes));

        // 9. Getting Length

        int length = "Hello World!".length();
        boolean bo02 = str01.isEmpty();
        boolean bo03 = str02.isEmpty();
        
        System.out.println("---");
        System.out.printf("\"Hello World!\".length(); = %s\n", length);
        System.out.printf("\"Hello World!\".isEmpty(); = %s\n", bo02);
        System.out.printf("str02 = new String(); str02.isEmpty(); = %s\n", bo03);
    }
}
