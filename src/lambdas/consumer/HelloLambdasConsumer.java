import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class HelloLambdasConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas Consumer!");
		List<String> strings = Arrays.asList("Moe", "Larry", "Curly");

		// Simplest Consumer Lambda - Inlined
		System.out.println("---");
		strings.forEach(x -> System.out.println(x));

		System.out.println("---");
		strings.forEach(x -> System.out.println(x.toLowerCase()));

		// Inlined with parentheses
		System.out.println("---");
		strings.forEach((x) -> System.out.println(x.toLowerCase()));

		// Inlined with explicit data type
		System.out.println("---");
		strings.forEach((String x) -> System.out.println(x.toLowerCase()));

		// Inlined as a Block Statement
		System.out.println("---");
		strings.forEach(x -> {
			StringBuilder sb = new StringBuilder(x);
			System.out.println(sb.reverse());
		});

		// Consumer Lambda as an Object
		Consumer<String> printUpper = x -> System.out.println(x.toUpperCase());
		System.out.println("---");
		printUpper.accept("Hello World!");

		// Consumer Lambda Object as a Block Statement
		Consumer<String> printReversed = x -> {
			StringBuilder sb = new StringBuilder(x);
			System.out.println(sb.reverse());
		};
		System.out.println("---");
		printReversed.accept("Hello World!");

		// Consumer Lambda Object Method Reference Inlined
		Consumer<String> printLower = x -> System.out.println(x.toLowerCase());
		System.out.println("---");
		strings.forEach(printLower::accept);

		// Consumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		printStrings(strings, printUpper);

		// Consumer Lambda Object In a Stream
		System.out.println("---");
		strings.stream().forEach(printReversed);
	}

	private static final void printStrings(final List<String> strings, final Consumer<String> printer) {
		strings.forEach(printer::accept);
	}
}
