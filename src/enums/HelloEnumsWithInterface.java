public class HelloEnumsWithInterface {

    public interface Price {
        public double price();
    }

    public enum Books implements Price {
        WAR_AND_PEACE(25.99), CATCH_22(15.99);

        private final double price;

        Books(double price) {
            this.price = price;
        }

        @Override
        public double price() {
            return this.price;
        }
    }

    public static void main(String... args) {
        System.out.println("Hello Enums with Interface!");

        Books book = Books.CATCH_22;
        double price = book.price();

        System.out.printf("Book = %s, price = %s\n", book, price);
    }
}
