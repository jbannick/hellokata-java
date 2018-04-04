package kata.app;

public class HelloModulesUsingNonModLib {
    public static void main(String... args) {
        System.out.println("Hello Modules Using a Non-Modularized Library!");

        Publisher pub = new Publisher();
        Subscriber sub = new Subscriber();

        pub.publish("Pizza in the break room");
    }
}
