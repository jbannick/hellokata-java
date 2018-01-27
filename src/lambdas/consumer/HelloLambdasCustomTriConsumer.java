import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Objects;

class HelloLambdasCustomTriConsumer {

	@FunctionalInterface
	interface TriConsumer<T, U, V> {
		void accept(T t, U u, V v);

		default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> after) {
			Objects.requireNonNull(after);
			return (a, b, c) -> {
				accept(a, b, c);
				after.accept(a, b, c);
			};
		}
	}

	public static void main(String... args) {
		System.out.println("Hello Lambdas Custom TriConsumer!");

		List<String> saints = Arrays.asList("Shadrach", "Meshach", "Abednego");
		List<String> stooges = Arrays.asList("Moe", "Larry", "Curly");
		List<String> presidents = Arrays.asList("Washington", "Jefferson", "Roosevelt");

		List<List<String>> triples = new ArrayList<>();
		triples.add(saints);
		triples.add(stooges);
		triples.add(presidents);

		// Simplest TriConsumer Inlined
		System.out.println("---");
		triples.forEach(x -> System.out.printf("%s %s %s\n", x.get(0), x.get(1), x.get(2)));

		// TriConsumer Lambda as an Object
		System.out.println("---");
		TriConsumer<String, String, String> triPrinter = (x, y, z) -> System.out
				.println(String.format("%s %s %s", x, y, z));
		triPrinter.accept("Hello", "my", "friends");

		// TriConsumer Lambda Object Method Reference Inlined
		System.out.println("---");
		HelloLambdasCustomTriConsumer cct = new HelloLambdasCustomTriConsumer();
		TriList triList = cct.new TriList(stooges);
		triList.forEach(triPrinter::accept);

		// TriConsumer Lambda Object As a Parameter to a Separate Method
		System.out.println("---");
		printAllTriples(triples, triPrinter);

		// TriConsumer Lambda Inlined As a Parameter to a Separate Method
		System.out.println("---");
		printAllTriples(triples, (x, y, z) -> System.out.println(x + y + z));

		// TriConsumer Lambda Object as a Referring Method
		System.out.println("---");
		TriConsumer<List<String>, String, String> triCon = HelloLambdasCustomTriConsumer::showTriple;
		triCon.accept(stooges, "Stooges", "rock!");

		// TriConsumer Composed Using andThen()
		TriConsumer<String, String, String> triPrinterSwap = (x, y, z) -> System.out
				.println(String.format("%s %s %s", z, y, x));
		System.out.println("---");
		triPrinter.andThen(triPrinterSwap).accept("Hello1", "my1", "friends1");

		System.out.println("---");
		triPrinterSwap.andThen(triPrinter).accept("Hello2", "my2", "friends2");
	}

	static final void printAllTriples(final List<List<String>> triples,
			final TriConsumer<String, String, String> triPrinter) {
		for (List<String> triple : triples) {
			triPrinter.accept(triple.get(0), triple.get(1), triple.get(2));
		}
	}

	static final void showTriple(final List<String> triple, final String who, final String exclamation) {
		System.out.println(
				String.format("%s: %s %s %s - %s", who, triple.get(0), triple.get(1), triple.get(2), exclamation));
	}

	class TriList extends ArrayList<Object> {
		private static final long serialVersionUID = 1L;

		TriList() {
			super();
		}

		TriList(List<?> list) {
			super(list);
		}

		@SuppressWarnings("unchecked")
		<T, U, V> void forEach(TriConsumer<? super T, ? super U, ? super V> action) {
			Objects.requireNonNull(action);

			T t;
			U u;
			V v;
			try {
				t = (T) get(0);
				u = (U) get(1);
				v = (V) get(2);
			} catch (IllegalStateException ise) {
				throw new ConcurrentModificationException(ise);
			}
			action.accept(t, u, v);
		}
	}
}
