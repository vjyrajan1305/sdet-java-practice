package week1_day6;
//Encapsulation
class Bank {
	private String name;
	private double balance;
	private boolean active;

	Bank(String name, double balance, boolean active) {
		this.name = name;
		setBalance(balance);
		this.active = true;
	}

	public String getname() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			System.out.println("Balance cant be -ve");
		} else {
			this.balance = balance;
		}
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid amount");
		} else {
			balance += amount;
			System.out.println("New balance: " + balance);
		}
	}

	public void closeAccount() {
		this.active = false;
		System.out.println("Account closed for: " + name);
	}
}

public class BankTest {

	public static void main(String[] args) {
		Bank bk = new Bank("Vijay", 2000, true);
		bk.setBalance(3000);
		bk.deposit(2322);
		bk.closeAccount();
		System.out.println(bk.isActive());
	}

}
