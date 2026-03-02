package week1Day2;

class Bankinfo {
	String name;
	double balance;

	Bankinfo(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println(balance);
	}

	void withdrawal(double amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println(balance);
		} else {
			System.out.println("Insufficient fund");
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		Bankinfo bf = new Bankinfo("Vijay", 10000);
		bf.deposit(2000);
		bf.withdrawal(11000);
		bf.withdrawal(2000);
	}

}
