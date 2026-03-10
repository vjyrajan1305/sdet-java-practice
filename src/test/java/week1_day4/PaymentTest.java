package week1_day4;

class Payment {
	String amount;

	Payment(String amount) {
		this.amount = amount;
	}

	void processPayment() {
		System.out.println("Processing payment of " + amount);
	}

}

class Creditcard extends Payment {

	Creditcard(String amount) {
		super(amount);
	}

	@Override
	void processPayment() {
		System.out.println("Processing Credit card payment of " + amount);
		System.out.println("Connecting Server....");
		System.out.println("Payment Succesful!!!");
	}

}

public class PaymentTest {

	public static void main(String[] args) {
		Creditcard cd = new Creditcard("13300");
		cd.processPayment();
	}

}
