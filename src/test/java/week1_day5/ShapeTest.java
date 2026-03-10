package week1_day5;
//abstraction
abstract class shape {
	String color;

	shape(String color) {
		this.color = color;
	}

	void displayColor() {
		System.out.println("Color: " + color);
	}

	abstract double area();
}

class circle extends shape {
	double radius;

	public circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		return 3.14 * radius * radius;
	}

}

public class ShapeTest {

	public static void main(String[] args) {
		shape sh = new circle("Red", 4);
		sh.displayColor();
		System.out.println("Area: " + sh.area());
	}

}
