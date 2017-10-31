public class HelloStaticVariables {
    public static void main(String... args) {
        System.out.println("Hello Static Variables!");
        Dog dog1 = new Dog();
        System.out.printf("dog1: Create id = %s, countDogs = %s\n", dog1.getID(), Dog.countDogs);
        Dog dog2 = new Dog();
        System.out.printf("dog2: Create id = %s, countDogs = %s\n", dog2.getID(), Dog.countDogs);
        Dog dog3 = new Dog();
        System.out.printf("dog3: Create id = %s, countDogs = %s\n", dog3.getID(), Dog.countDogs);
        System.out.printf("dog1: instance id = %s, static countDogs = %s\n", dog1.getID(), Dog.countDogs);
        System.out.printf("dog2: instance id = %s, static countDogs = %s\n", dog2.getID(), Dog.countDogs);
        System.out.printf("dog3: instance id = %s, static countDogs = %s\n", dog3.getID(), Dog.countDogs);
    }
}

class Dog {
    static int countDogs = 0;

    private int id;

    Dog() {
        id = ++countDogs;
    }

    int getID() {
        return this.id;
    }
}
