package week1Day2;

class Rect {
	double length;
	double width;

	Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
//	void method()    →  does something, gives you NOTHING back
//	double method()  →  does something, gives you a NUMBER back
//	boolean method() →  does something, gives you TRUE/FALSE back

	double area() {
		return length * width;
	}

	double perimeter() {
		return 2 * (length + width);
	}

	boolean issquare() {
		return length == width;

	}

}

public class Rectangle {

	public static void main(String[] args) {
		Rect r1 = new Rect(10, 10);
		Rect r2 = new Rect(10, 5);
		System.out.println("Area: "+r1.area());
		System.out.println("Is Square: "+r1.issquare());
		System.out.println("Perimeter: "+r2.perimeter());
		System.out.println("Is Square: "+r2.issquare());
	}

}
