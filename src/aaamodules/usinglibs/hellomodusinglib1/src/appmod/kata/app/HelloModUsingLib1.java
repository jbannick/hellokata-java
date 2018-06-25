package kata.app;

public class HelloModUsingLib1 {
   
   public static void main(String... args) {
      System.out.println("Hello Modularized Using Library 1!");

      Publisher pub = new Publisher();
      Subscriber sub = new Subscriber();

      pub.publish("Pizza in the break room");
   }
}
