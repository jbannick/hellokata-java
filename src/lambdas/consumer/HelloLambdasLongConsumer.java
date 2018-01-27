import java.util.Arrays;
import java.util.function.LongConsumer;

public class HelloLambdasLongConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas LongConsumer!");

		long longValue = 4_000_000_000L;
		// Simplest
		System.out.println("---");
		LongConsumer dc = x -> System.out.println(x + 2);
		dc.accept(longValue);

		// AndThen
		System.out.println("---");
		LongConsumer dc2 = b -> System.out.println(b + longValue);
		dc.andThen(dc2).accept(longValue);

		// Stream forEach
		System.out.println("---");
		long[] longs = { longValue * 2L, longValue * 3L, longValue * 4L };
		Arrays.stream(longs).forEach(x -> System.out.println(x * 2L));
	}
}
