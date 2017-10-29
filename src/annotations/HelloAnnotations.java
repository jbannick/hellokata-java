import java.util.ArrayList;
import java.util.List;

public class HelloAnnotations {
    public static void main(String... args) {
        System.out.println("Hello Annotations!");

        HelloAnnotations ha = new HelloAnnotations();
        ha.myMethod();

        MyAnnotations ma = new MyAnnotations();
        ma.myMethod();

        ha.unCheckedGenerics();
        ha.unCheckedGenerics2();
        
        // TODO: Complete this Kata
    }

    public void myMethod() {
        System.out.println("MyMethod");
    }

    @SuppressWarnings("unchecked")
    public void unCheckedGenerics() {
        @SuppressWarnings("rawtypes")
        List animals = new ArrayList();
        animals.add("cat");
        System.out.println(animals);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void unCheckedGenerics2() {
        List animals = new ArrayList();
        animals.add("dog");
        System.out.println(animals);
    }
}

class MyAnnotations extends HelloAnnotations {
    @Override
    public void myMethod() {
        System.out.println("Overriden MyMethod");
    }
}
