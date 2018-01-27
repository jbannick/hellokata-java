import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

class HelloLambdasBiConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas BiConsumer!");

		List<String> strings = Arrays.asList("Shadrach", "Meshach", "Abednego", "Fred");

		Map<String, String> map = new HashMap<>();
		for (String string : strings) {
			map.put(string.toUpperCase().substring(0, 4), string);
		}

		// Simplest BiConsumer Lambda Inlined
		System.out.println("---");
		map.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println("---");
		map.forEach((k, v) -> System.out.println(k.toLowerCase() + " " + v.toUpperCase()));

		// BiConsumer Lambda Inlined with Explicit Data Types
		System.out.println("---");
		map.forEach((String k, String v) -> System.out.println(k + " " + v));

		// BiConsumer Lambda Inlined as a Block Statement
		System.out.println("---");
		map.forEach((k, v) -> {
			String z = k + " " + v;
			System.out.println(z);
		});

		// BiConsumer Lambda as an Object
		BiConsumer<String, String> printerJoin = (a, b) -> System.out.println(a + " " + b);
		System.out.println("---");
		printerJoin.accept("Hello", "World");

		// BiConsumer Lambda Object as a Block Statement
		BiConsumer<String, String> printerJoinBlock = (x, y) -> {
			String z = x + " " + y;
			System.out.println(z);
		};
		System.out.println("---");
		printerJoinBlock.accept("Goodbye", "Columbus");

		// BiConsumer Lambda Object Method Reference Inlined
		System.out.println("---");
		map.forEach(printerJoin::accept);

		// BiConsumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		printAllPairs(strings, printerJoin);

		// BiConsumer Lambda Object as a Referring Method
		BiConsumer<Map<String, String>, String> biCon = HelloLambdasBiConsumer::showMap;
		System.out.println("---");
		biCon.accept(map, "Entries");

		// BiConsumer Composed Using andThen()
		BiConsumer<String, String> printerSwap = (a, b) -> System.out.println(b + " " + a);

		System.out.println("---");
		printerJoin.andThen(printerSwap).accept("Hello", "Swap1");

		System.out.println("---");
		printerSwap.andThen(printerJoin).accept("Hello", "Swap2");
	}

	static final void printAllPairs(final List<String> strings, final BiConsumer<String, String> printer) {
		String first = null;
		String previous = null;
		for (String string : strings) {
			if (null == first) {
				first = string;
			} else {
				printer.accept(previous, string);
			}
			previous = string;
		}
		if (null != previous && null != first) {
			printer.accept(previous, first);
		}
	}

	static final void showMap(final Map<String, String> map, final String string) {
		System.out.println("=== " + string + " ===");
		map.forEach((key, val) -> System.out.println(key + " " + val));
	}
}
