public class HelloFinalArguments {
    public static void main(String... args) {
        System.out.println("Hello Final Arguments!");
        Circle circle = new Circle(3.0d);
        System.out.printf("circle: radius = %s\n", circle.getRadius());
    }
}

class Circle3 {
    private double radius;

    Circle3(final double radius) {
        this.radius = radius;

        // Bad Code
        // The final local variable radius cannot be assigned.
        // It must be blank and not using a compound assignment
        // radius = 7d;
    }

    double getRadius() {
        return this.radius;
    }
}
