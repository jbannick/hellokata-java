import java.awt.Point;

// TODO: anonymous inner class (Wikipedia example)

public class HelloFinalVariables {
	public static void main(String...args) {
		System.out.println("Hello Final Variables!");
		Circle circle = new Circle(2.0d);
		System.out.printf("circle: radius = %s\n", circle.getRadius());
		
		CircleWithReference circleWithReference = new CircleWithReference(new Point(2, 3));
		System.out.printf("circleWithReference: center(2,3) = %s\n", circleWithReference.getCenter());
		circleWithReference.setCenter(7, 9);
		System.out.printf("circleWithReference: center(7,9) = %s\n", circleWithReference.getCenter());
		
		Circle[] circles = {new Circle(1.0d), new Circle(2.0d), new Circle(3.0d)};
		
		for (final Circle c : circles) {
			System.out.printf("circle: radius = %s\n", c.getRadius());
		}
	}
}

class Circle {
	private final double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	// Bad Code
	// The final field Circle.radius cannot be assigned
	void badCode() {
//		this.radius = 7; 
	}
}

class CircleWithReference {
	private final Point center;
	
	CircleWithReference(Point center) {
		this.center = center;
	}
	
	Point getCenter() {
		return this.center;
	}
	
	void setCenter(int x, int y) {
		this.center.setLocation(x, y);
	}	
}