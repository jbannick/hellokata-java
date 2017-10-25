
public class HelloStaticMethods {
	public static void main(String...args) {
		System.out.println("Hello Static Methods!");
		Dog dog1 = new Dog();
		System.out.printf("dog1: Create id = %s, countDogs = %s\n", dog1.getID(), Dog.getCountDogs());
		Dog dog2 = new Dog();
		System.out.printf("dog2: Create id = %s, countDogs = %s\n", dog2.getID(), Dog.getCountDogs());
		Dog dog3 = new Dog();
		System.out.printf("dog3: Create id = %s, countDogs = %s\n", dog3.getID(), Dog.getCountDogs());
		System.out.printf("dog1: instance id = %s, static countDogs = %s\n", dog1.getID(), Dog.getCountDogs());
		System.out.printf("dog2: instance id = %s, static countDogs = %s\n", dog2.getID(), Dog.getCountDogs());
		System.out.printf("dog3: instance id = %s, static countDogs = %s\n", dog3.getID(), Dog.getCountDogs());
	}
}

class Dog {
	private static int countDogs = 0;
		
	private int id;
	
	Dog() {
		id = ++countDogs;
	}
	
	static int getCountDogs() {
		return countDogs;
	}
	
	int getID() {
		return this.id;
	}
}
