import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ObjLongConsumer;

public class HelloLambdasObjLongConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas ObjLongConsumer!");

		List<Long> longs = Arrays.asList(4_000_000_002L, 4_000_000_003L, 4_000_000_004L);

		Map<String, Long> map = new HashMap<>();
		for (Long longVal : longs) {
			map.put("val_" + longVal, longVal);
		}

		// Simplest - As Lambda Object
		ObjLongConsumer<String> odc1 = (s, x) -> System.out.println(s + " " + x);
		odc1.accept("abc", 4_000_000_123L);

		ObjLongConsumer<String> odc2 = (s, d) -> System.out.printf(s, d);
		odc2.accept("value = %,d\n", 4_000_000_123L);

		// ObjLongConsumer Lambda Object Method Reference Inlined
		System.out.println("---");
		map.forEach(odc1::accept);

		// ObjLongConsumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		ObjLongConsumer<Long> odc3 = (s, i) -> System.out.println("" + s + " " + i);
		printAllPairs(longs, odc3);

		// ObjLongConsumer Lambda Object as a Referring Method
		ObjLongConsumer<Map<String, Long>> objCon = HelloLambdasObjLongConsumer::adder;
		System.out.println("---");
		objCon.accept(map, 4_000_000_000L);
	}

	static final void printAllPairs(final List<Long> longs, final ObjLongConsumer<Long> printer) {
		Long first = null;
		Long previous = null;
		for (Long longVal : longs) {
			if (null == first) {
				first = longVal;
			} else {
				printer.accept(previous, longVal);
			}
			previous = longVal;
		}
		if (null != previous && null != first) {
			printer.accept(previous, first);
		}
	}

	static final void adder(final Map<String, Long> map, final long value) {
		map.forEach((key, val) -> System.out.println(String.format("%,d + %,d = %,d", val, value, (val + value))));
	}
}
