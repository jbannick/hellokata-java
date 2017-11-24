import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.StringJoiner;

public class HelloStringConcatenate {

    public static void main(String... args) {
        System.out.println("Hello String Concatenate!");

        // Using the + Operator

        String st01 = "Hello" + " " + "World!";
        String st02 = "Hello";
        st02 += " ";
        st02 += "World!";

        String st10 = "Test: ";
        st10 += 'a';
        
        String st11 = "Test: ";
        st11 += true;
        
        String st12 = "Test: ";
        st12 += Short.MIN_VALUE;
        
        String st13 = "Test: ";
        st13 += Integer.MIN_VALUE;
        
        String st14 = "Test: ";
        st14 += Long.MIN_VALUE;
        
        String st15 = "Test: ";
        st15 += Float.MIN_VALUE;
        
        String st16 = "Test: ";
        st16 += Double.MIN_VALUE;
        
        String st17 = "Test: ";
        st17 += BigDecimal.TEN;
        
        String st18 = "Test: ";
        st18 += BigInteger.TWO;

        System.out.println("---");
        System.out.printf("\"Hello\" + \" \" + \"World!\"; \t\t= <%s>\n", st01);
        System.out.printf("\"Hello\"; st02 += \" \"; st02 += \"World!\"; \t= <%s>\n", st02);

        System.out.println("---");
        System.out.printf("st10 = \"Test: \"; st10 += 'a'; \t\t\t= <%s>\n", st10);
        System.out.printf("st11 = \"Test: \"; st11 += true; \t\t\t= <%s>\n", st11);
        System.out.printf("st12 = \"Test: \"; st12 += Short.MIN_VALUE; \t= <%s>\n", st12);
        System.out.printf("st13 = \"Test: \"; st13 += Integer.MIN_VALUE; \t= <%s>\n", st13);
        System.out.printf("st14 = \"Test: \"; st14 += Long.MIN_VALUE; \t= <%s>\n", st14);
        System.out.printf("st15 = \"Test: \"; st15 += Float.MIN_VALUE; \t= <%s>\n", st15);
        System.out.printf("st16 = \"Test: \"; st16 += Double.MIN_VALUE; \t= <%s>\n", st16);
        System.out.printf("st17 = \"Test: \"; st17 += BigDecimal.TEN; \t= <%s>\n", st17);
        System.out.printf("st18 = \"Test: \"; st18 += BigInteger.TWO; \t= <%s>\n", st18);

        // Using the String.concat() Method

        String st20 = "Hello".concat(" ").concat("World!");

        System.out.printf("\"Hello\".concat(\" \").concat(\"World!\"); \t= <%s>\n", st20);

        // Using the String.join() Method

        String[] array = { "Hello", "World!" };
        String st30 = String.join(" ", "Hello", "World!");
        String st31 = String.join(" ", array);
        String st32 = String.join(" ", List.of(array));

        System.out.println("---");
        System.out.printf("String.join(\" \", \"Hello\", \"World!\"); \t= <%s>\n", st30);
        System.out.printf("String.join(\" \", array); \t\t= <%s>\n", st31);
        System.out.printf("String.join(\" \", List.of(array)); \t= <%s>\n", st32);

        // Using the StringJoiner Class

        StringJoiner sj01 = new StringJoiner(", ");
        sj01.add("Moe");
        sj01.add("Larry");
        sj01.add("Curly");
        String st40 = sj01.toString();

        String st41 = new StringJoiner(".", "[", "]").add("192").add("168").add("2").add("81").toString();

        StringJoiner sj02 = new StringJoiner(",", "{", "}").add("one").add("two");
        StringJoiner sj03 = new StringJoiner(":", "[", "]").add("aaa").add("bbb");
        String st42 = sj02.merge(sj03).toString();

        StringJoiner sj04 = new StringJoiner(", ").setEmptyValue("Ain't nothin'here.");

        System.out.println("---");
        System.out.printf(
            "sj01 = StringJoiner(\", \"); sj01.add(\"Moe\"); sj01.add(\"Larry\"); sj01.add(\"Curly\"); sj01.toString();\t= <%s>\n",
            st40);
        System.out.printf(
            "StringJoiner(\".\", \"[\", \"]\").add(\"192\").add(\"168\").add(\"2\").add(\"81\").toString(); \t\t\t= <%s>\n",
            st41);

        System.out.println("---");
        System.out.printf("sj02 = StringJoiner(\",\", \"{\", \"}\").add(\"one\").add(\"two\"); \t= <%s>\n",
                sj02.toString());
        System.out.printf("sj03 = StringJoiner(\":\", \"[\", \"]\").add(\"aaa\").add(\"bbb\"); \t= <%s>\n",
                sj03.toString());
        System.out.printf("sj02.merge(sj03).toString(); \t\t\t\t\t= <%s>\n", st42);

        System.out.println("---");
        System.out.printf("sj04 = StringJoiner(\", \").setEmptyValue(\"Ain't nothin' here.\"); sj04.toString(); = <%s>\n", sj04.toString());

        // Using the StringBuilder and StringBuffer Classes

        String str50 = new StringBuilder(12).append("Hello").append(" ").append("World!").toString();
        String str51 = new StringBuffer(12).append("Hello").append(" ").append("World!").toString();

        System.out.println("---");
        System.out.printf(
            "new StringBuilder(12).append(\"Hello\").append(\" \").append(\"World!\").toString(); = <%s>\n", str50);
        System.out.printf(
            "new StringBuffer(12).append(\"Hello\").append(\" \").append(\"World!\").toString();  = <%s>\n", str51);

    }
}
