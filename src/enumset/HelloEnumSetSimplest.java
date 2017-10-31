import java.util.EnumSet;

enum Simple {
    A, B, C
}

public class HelloEnumSetSimplest {
    public static void main(String... args) {
        System.out.println("Hello EnumSet Simplest!");

        EnumSet<Simple> eSet = EnumSet.of(Simple.A, Simple.B, Simple.C);

        System.out.println(eSet);
    }
}
