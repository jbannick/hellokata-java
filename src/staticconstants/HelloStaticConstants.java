public class HelloStaticConstants {
    public static void main(String... args) {
        System.out.println("Hello Static Constants!");
        Circle circle1 = new Circle(1d);
        System.out.printf("circle1: radius = %s, area = %s\n", circle1.getRadius(), circle1.getArea());
        Circle circle2 = new Circle(2d);
        System.out.printf("circle2: radius = %s, area = %s\n", circle2.getRadius(), circle2.getArea());
        Circle circle3 = new Circle(4d);
        System.out.printf("circle3: radius = %s, area = %s\n", circle3.getRadius(), circle3.getArea());
    }
}

class Circle {

    static final double PI = 3.0d;
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return PI * this.radius * this.radius;
    }
}
