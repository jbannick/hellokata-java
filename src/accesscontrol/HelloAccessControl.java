public class HelloAccessControl {
    public static void main(String... args) {
        System.out.println("Hello Access Control!!");

        MyClass myClass = new MyClass();

        myClass.defaultVar = 1;
        myClass.publicVar = 2;
        // myClass.privateVar = 3; Causes compiler error
        myClass.setPrivateVar(3);

        System.out.printf("myClass.defaultVar = %s\n", myClass.defaultVar);
        System.out.printf("myClass.publicVar  = %s\n", myClass.publicVar);
        System.out.printf("myClass.privateVar = %s\n", myClass.getPrivateVar());
        
        // TODO: Complete this Kata
    }
}

class MyClass {
    int defaultVar;
    public int publicVar;
    private int privateVar;

    void setPrivateVar(int value) {
        privateVar = value;
    }

    int getPrivateVar() {
        return privateVar;
    }
}
