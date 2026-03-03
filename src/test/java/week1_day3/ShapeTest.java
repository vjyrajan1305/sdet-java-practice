package week1_day3;

class Shape {
	String color;

	Shape(String color) {
		this.color = color;
	}

	void displayinfo() {
		System.out.println("Color is: " + color);
	}
}
//Method Overriding — the most important new concept here. Same method name in parent AND child,
//but each version does something different.
class Circle extends Shape {
	double radius;

	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	void displayinfo() {
		super.displayinfo();
		System.out.println("Radius:" + radius);
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle("Red", 30);
		c.displayinfo();
	}

}
