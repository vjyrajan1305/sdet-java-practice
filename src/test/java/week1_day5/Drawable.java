package week1_day5;
//interface
interface DrawableTest {
	void draw();

	void resize(int percent);

	interface Colorable {
		void fillcolor(String color);
	}

}

class Canvas implements DrawableTest, DrawableTest.Colorable {

	@Override
	public void draw() {
		System.out.println("I am Drawing trees");
	}

	@Override
	public void resize(int percent) {
		System.out.println("Completed drawing by " + percent + " percent");
	}

	@Override
	public void fillcolor(String color) {
		System.out.println("Using " + color + " color");
	}

}

public class Drawable {
	public static void main(String[] args) {
		Canvas cv = new Canvas();
		cv.draw();
		cv.resize(50);
		cv.fillcolor("Red");
	}
}
