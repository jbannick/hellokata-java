public class HelloEnumsWithMethods {

    enum Coins {
        PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
        private static final float INFLATION_SINCE_1920 = 12.0f;
        private int value;

        private Coins(int value) {
            this.value = value;
        }

        public double getValueInflatedSince1920() {
            return this.value * INFLATION_SINCE_1920 / 100;
        }
    }

    public static void main(String... args) {
        System.out.println("Hello Enums with Methods!");

        Coins coin = Coins.QUARTER;

        System.out.printf("A %s in 1920 was the equivalent of $%.2f in 2016\n", coin, coin.getValueInflatedSince1920());

        System.out.printf("A %s in 1920 was the equivalent of $%.2f in 2016\n", Coins.DIME,
                Coins.DIME.getValueInflatedSince1920());
    }
}
