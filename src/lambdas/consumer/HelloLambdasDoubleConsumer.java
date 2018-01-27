import java.util.Arrays;
import java.util.function.DoubleConsumer;

public class HelloLambdasDoubleConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas DoubleConsumer!");

		// Simplest
		System.out.println("---");
		DoubleConsumer dc = x -> System.out.println(x * x);
		dc.accept(2.0);

		// AndThen
		System.out.println("---");
		DoubleConsumer dc2 = b -> System.out.println(b * 2);
		dc.andThen(dc2).accept(10);

		// Stream forEach
		System.out.println("---");
		double[] doubles = { 2.0d, 3.0d, 4.0d };
		Arrays.stream(doubles).forEach(x -> System.out.println(x * x));
	}
}
