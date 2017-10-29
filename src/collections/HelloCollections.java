import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloCollections {
    public static void main(String... args) {
        System.out.println("Hello Collections!");

        // Vector ?????
        // Streams ???

        // List
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("orange");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("---");

        List<String> train = new LinkedList<>();
        train.add("engine");
        train.add("flatcar");
        train.add("tankcar");
        train.add("boxcar");
        train.add("caboose");
        for (String traincar : train) {
            System.out.println(traincar);
        }
        System.out.println("---");

        ((LinkedList<String>) train).addFirst("engine2");
        ((LinkedList<String>) train).addLast("caboose2");
        train.add(4, "hoppercar");
        train.remove("caboose");
        for (String traincar : train) {
            System.out.println(traincar);
        }
        System.out.println("---");

        // Set

        // Queue

        // Dequeue

        // Map

        // TODO: Complete this Kata
    }
}
