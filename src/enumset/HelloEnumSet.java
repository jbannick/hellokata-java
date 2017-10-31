import java.util.EnumSet;
import java.util.Iterator;

enum Alphabet {
    A, B, C
}

public class HelloEnumSetIteration {
    public static void main(String... args) {
        System.out.println("Hello EnumSet Iteration!");

        EnumSet<Alphabet> eSet = EnumSet.of(Alphabet.A, Alphabet.B, Alphabet.C);

        System.out.println("Iterator<Alphabet> it = eSet.iterator(); while (it.hasNext()) {...");
        Iterator<Alphabet> it = eSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("for(Alphabet s : Alphabet.values()) {...");
        for (Alphabet s : Alphabet.values()) {
            System.out.println(s);
        }

        System.out.println("for (final Alphabet s : EnumSet.allOf(Alphabet.class)) {...");
        for (final Alphabet s : EnumSet.allOf(Alphabet.class)) {
            System.out.println(s);
        }

        System.out.println("eSet.forEach(System.out::println);");
        eSet.forEach(System.out::println);

        System.out.println("Stream.of(Alphabet.values()).forEach(System.out::println);");
        eSet.stream().forEach(System.out::println);
    }
}
