import static java.lang.Math.PI;
import java.lang.Math;
import static java.lang.System.out;
public class HelloStaticImports {
	public static void main(String...args) {
		out.println("Hello Static Imports!");
		double radius = 10.d;
		double area = PI * Math.pow(radius, 2);
		out.printf("radius %s yields area %s\n", radius, area);
	}
}
