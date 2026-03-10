package week1_day4;

// Basic Overloading

class Printer {

	void print(String message) {
		System.out.println("Message is:" + message);
	}

	void print(int num) {
		System.out.println("Integer is:" + num);
	}

	void print(String message, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Message is:" + message);
		}
	}

	void print(double value) {
		System.out.println("Value is:" + value);
	}

}

public class PrinterTest {

	public static void main(String[] args) {
		Printer p = new Printer();
		p.print("Vijay");
		p.print(100);
		p.print("Keerthi", 3);
		p.print(99.99);
	}

}
