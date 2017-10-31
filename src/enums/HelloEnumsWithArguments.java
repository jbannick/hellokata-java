public class HelloEnumsWithArguments {

    public enum Animals {
        HUMAN("Bob", 2, false), CAT("Tammy", 4, true);

        private String name;
        private int legs;
        private boolean tail;

        private Animals(String name, int legs, boolean tail) {
            this.name = name;
            this.legs = legs;
            this.tail = tail;
        }

        public String getName() {
            return this.name;
        }

        public int getLegs() {
            return this.legs;
        }

        public boolean hasTail() {
            return this.tail;
        }
    }

    public static void main(String... args) {
        System.out.println("Hello Enums with Arguments!");

        Animals aCat = Animals.CAT;
        Animals aHuman = Animals.HUMAN;

        Animals isWhat = aCat;
        String name = aCat.getName();
        int legs = aCat.getLegs();
        boolean hasTail = aCat.hasTail();

        System.out.printf("isWhat = %s \tname = %s\tlegs = %s\t\thasTail = %s\n", isWhat, name, legs, hasTail);

        isWhat = aHuman;
        name = aHuman.getName();
        legs = aHuman.getLegs();
        hasTail = aHuman.hasTail();

        System.out.printf("isWhat = %s \tname = %s\tlegs = %s\t\thasTail = %s\n", isWhat, name, legs, hasTail);
    }
}
