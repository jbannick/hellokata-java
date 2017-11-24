public class HelloStringChangeCase {

    public static void main(String... args) {
        System.out.println("Hello String Change Case!");

        String str60 = "Hello World!".toLowerCase();
        String str61 = "Hello World!".toUpperCase();

        System.out.println("---");
        System.out.printf("\"Hello World!\".toLowerCase(); = <%s>\n", str60);
        System.out.printf("\"Hello World!\".toUpperCase(); = <%s>\n", str61);
    }
}
