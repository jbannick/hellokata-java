import java.util.Arrays;
import java.util.function.IntConsumer;

public class HelloLambdasIntConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas IntConsumer!");

		// Simplest
		System.out.println("---");
		IntConsumer dc = x -> System.out.println(x * x);
		dc.accept(2);

		// AndThen
		System.out.println("---");
		IntConsumer dc2 = b -> System.out.println(b * 2);
		dc.andThen(dc2).accept(10);

		// Stream forEach
		System.out.println("---");
		int[] ints = { 2, 3, 4 };
		Arrays.stream(ints).forEach(x -> System.out.println(x * x));
	}
}
