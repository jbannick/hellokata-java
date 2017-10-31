public class HelloEnumsWithAbstract {

    public enum GameCharacterType {

        ARCHER {
            @Override
            public double attack() {
                return 10;
            }
        },
        KNIGHT {
            @Override
            public double attack() {
                return 20;
            }
        };

        // calculates damage related to character type
        public abstract double attack();
    }

    public static void main(String... args) {
        System.out.println("Hello Enums with Abstract!");

        GameCharacterType gct = GameCharacterType.ARCHER;
        double attack01 = gct.attack();

        double attack02 = GameCharacterType.KNIGHT.attack();
        System.out.printf("Character = %s, attack<%s>\n", gct, attack01);

        System.out.printf("Character = %s, attack<%s>\n", GameCharacterType.KNIGHT, attack02);
    }
}
