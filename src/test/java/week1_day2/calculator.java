package week1_day2;

class calculatorinfo {
	int num1;
	int num2;

	calculatorinfo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void add() {
		System.out.println("Add:" + (num1 + num2));
	}

	void subtract() {
		System.out.println("Subtract:" + (num1 - num2));
	}

	void multiply() {
		System.out.println("Multiply:" + (num1 * num2));
	}

	void divide() {
		if (num2 == 0) {
			System.out.println("Cannot divide by Zero");
		} else {
			System.out.println("Divide:" + (num1 / num2));
		}
	}
}

public class calculator {

	public static void main(String[] args) {
		calculatorinfo cf = new calculatorinfo(20, 0);
		cf.add();
		cf.subtract();
		cf.multiply();
		cf.divide();
	}

}
