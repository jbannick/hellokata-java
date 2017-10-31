public class HelloEnumsOverriddenToString {

    public enum Simplest {
        A, B, C, D;
        @Override
        public String toString() {
            switch (this) {
            case A:
                return "A is for Alligator";
            case B:
                return "B is for Beer";
            case C:
                return "C is for Catterpiggle";
            case D:
                return "D is for Dear";
            default:
                return "Unknown";
            }
        }
    };

    public static void main(String... args) {
        System.out.println("Hello Enums Overridden toString!");

        for (Simplest s : Simplest.values()) {
            System.out.println(s);
        }
    }
}
