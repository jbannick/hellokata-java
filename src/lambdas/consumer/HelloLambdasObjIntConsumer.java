import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ObjIntConsumer;

public class HelloLambdasObjIntConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas ObjIntConsumer!");

		List<Integer> integers = Arrays.asList(2, 3, 4);

		Map<String, Integer> map = new HashMap<>();
		for (Integer integer : integers) {
			map.put("val_" + integer, integer);
		}

		// Simplest - As Lambda Object
		ObjIntConsumer<String> odc1 = (s, i) -> System.out.println(s + " " + i);
		odc1.accept("abc", 123);

		ObjIntConsumer<String> odc2 = (s, d) -> System.out.printf(s, d);
		odc2.accept("value = %s\n", 123);

		// ObjIntConsumer Lambda Object Method Reference Inlined
		System.out.println("---");
		map.forEach(odc1::accept);

		// ObjIntConsumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		ObjIntConsumer<Integer> odc3 = (s, i) -> System.out.println("" + s + " " + i);
		printAllPairs(integers, odc3);

		// ObjIntConsumer Lambda Object as a Referring Method
		ObjIntConsumer<Map<String, Integer>> objCon = HelloLambdasObjIntConsumer::adder;
		System.out.println("---");
		objCon.accept(map, 2);
	}

	static final void printAllPairs(final List<Integer> integers, final ObjIntConsumer<Integer> printer) {
		Integer first = null;
		Integer previous = null;
		for (Integer integer : integers) {
			if (null == first) {
				first = integer;
			} else {
				printer.accept(previous, integer);
			}
			previous = integer;
		}
		if (null != previous && null != first) {
			printer.accept(previous, first);
		}
	}

	static final void adder(final Map<String, Integer> map, final int value) {
		map.forEach((key, val) -> System.out.println(String.format("%d + %d = %d", val, value, (val + value))));
	}
}
