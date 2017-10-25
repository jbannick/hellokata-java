
public class HelloGenerics {
	public static void main(String...args) {
		System.out.println("Hello Generics!");
		
		Box<Integer> integerBox = new Box<>();
		integerBox.set(1);
		System.out.println(integerBox.get());
		
		Pair<String, Integer> p1 = new OrderedPair<>("aaa", 1);
		Pair<String, String>  p2 = new OrderedPair<>("bbb", "ccc");
		System.out.printf("%s %s\n", p1.getKey(), p1.getValue());
		System.out.printf("%s %s\n", p2.getKey(), p2.getValue());
		
		Pair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());
		p.getValue().set(1);
		System.out.printf("%s %s\n", p.getKey(), p.getValue().get());
		
		Pair<Integer, String> pp1 = new OrderedPair<>(1, "aaa");
		Pair<Integer, String> pp2 = new OrderedPair<>(2, "ccc");
		
		System.out.printf("%s %s\n", pp1.getKey(), pp1.getValue());
		System.out.printf("%s %s\n", pp2.getKey(), pp2.getValue());
		System.out.println(Util.compare(pp1, pp2));
	}
}

class Box<T> {
	private T t;
	void set(T t) {
		this.t = t;
	}
	T get(){
		return this.t;
	}
}

interface Pair<K, V> {
	K getKey();
	V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
	private K key;
	private V value;
	OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}	
}

class Util {
	public static <K, V> boolean compare(Pair<K, V> pp1, Pair<K, V> pp2) {
		return pp1.getKey().equals(pp2.getKey()) && pp1.getValue().equals(pp2.getValue());
	}
}

