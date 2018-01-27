import java.util.Arrays;
import java.util.StringJoiner;

class HelloLambdasCustomVarArgsConsumer {

	// VarArgsConsumer
	@FunctionalInterface
	interface VarArgsConsumer {
		void accept(Object... objects);

		default VarArgsConsumer andThen(VarArgsConsumer after) {
			return (Object... objects) -> {
				accept(objects);
				after.accept(objects);
			};
		}
	}

	public static void main(String... args) {
		System.out.println("Hello Lambdas Custom VarArgsConsumer!");

		VarArgsConsumer vArgsPrinter = (vargs) -> {
			StringJoiner sj = new StringJoiner(" ");
			Arrays.stream(vargs).map(e -> e.toString()).forEach(sj::add);
			System.out.println(sj);
		};

		// Simplest Custom VarArgs ConsumerLambda as an Object
		System.out.println("---");
		vArgsPrinter.accept("I", "am", "printing");

		System.out.println("---");
		vArgsPrinter.accept("I", "am");

		System.out.println("---");
		vArgsPrinter.accept("I");

		System.out.println("---");
		vArgsPrinter.accept();

		// Custom VarArgs Consumer Lambda Object as a Parameter to a Separate Method
		System.out.println("---");
		invokeVarArgsConsumer(vArgsPrinter, "Also", "printing");

		System.out.println("---");
		applyWithStillAndPrinting(vArgsPrinter);

		System.out.println("---");
		applyWithStillAndPrinting((Object... vargs) -> System.out.println("Not done"));

		// Custom VarArgs Consumer Lambda Object Method Reference Inlined
		System.out.println("---");
		applyWithStillAndPrinting(vArgsPrinter::accept);
	}

	static void invokeVarArgsConsumer(VarArgsConsumer varArgsConsumer, Object... args) {
		varArgsConsumer.accept(args);
	}

	static void applyWithStillAndPrinting(VarArgsConsumer varArgsConsumer) {
		varArgsConsumer.accept("Still", "Printing");
	}
}
