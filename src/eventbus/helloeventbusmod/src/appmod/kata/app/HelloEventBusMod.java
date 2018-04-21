package kata.app;

public class HelloEventBusMod {
    public static void main(String... args) {
        System.out.println("Hello EventBus Modularized!");

        Publisher pub = new Publisher();
        Subscriber sub = new Subscriber();

        pub.publish("Pizza in the break room");
    }
}
