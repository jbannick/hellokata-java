import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ObjDoubleConsumer;

public class HelloLambdasObjDoubleConsumer {
	public static void main(String... args) {
		System.out.println("Hello Lambdas ObjDoubleConsumer!");

		List<Double> doubles = Arrays.asList(2.0d, 3.0d, 4.0d);

		Map<String, Double> map = new HashMap<>();
		for (Double dbl : doubles) {
			map.put("val_" + dbl, dbl);
		}

		// Simplest - As Lambda Object
		ObjDoubleConsumer<String> odc1 = (s, d) -> System.out.println(s + " " + d);
		odc1.accept("abc", 123d);

		ObjDoubleConsumer<String> odc2 = (s, d) -> System.out.printf(s, d);
		odc2.accept("value = %s\n", 123d);

		// ObjDoubleConsumer Lambda Object Method Reference Inlined
		System.out.println("---");
		map.forEach(odc1::accept);

		// ObjDoubleConsumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		ObjDoubleConsumer<Double> odc3 = (s, d) -> System.out.println("" + s + " " + d);
		printAllPairs(doubles, odc3);

		// ObjDoubleConsumer Lambda Object as a Referring Method
		ObjDoubleConsumer<Map<String, Double>> objCon = HelloLambdasObjDoubleConsumer::adder;
		System.out.println("---");
		objCon.accept(map, 2.0d);
	}

	static void printAllPairs(final List<Double> doubles, final ObjDoubleConsumer<Double> printer) {
		Double first = null;
		Double previous = null;
		for (Double dbl : doubles) {
			if (null == first) {
				first = dbl;
			} else {
				printer.accept(previous, dbl);
			}
			previous = dbl;
		}
		if (null != previous && null != first) {
			printer.accept(previous, first);
		}
	}

	static void adder(final Map<String, Double> map, final double value) {
		map.forEach(
				(key, val) -> System.out.println(String.format("%3.1f + %3.1f = %3.1f", val, value, (val + value))));
	}
}
