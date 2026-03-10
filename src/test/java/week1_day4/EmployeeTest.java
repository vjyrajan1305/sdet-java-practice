package week1_day4;

class Employee {
	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void displayRole() {
		System.out.println(name + " is a Employee");
	}

	double calBonus() {
		return salary * 0.10;
	}
}

class Manager extends Employee {

	Manager(String name, double salary) {
		super(name, salary);
	}
@Override
	void displayRole() {
		System.out.println(name + " is a Manager");
	}
@Override
	double calBonus() {
		return salary * 0.20;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee em = new Employee("Ram", 30000.50);
		Manager mg = new Manager("Vijay", 100000.23);

		em.displayRole();
		System.out.println("Bonus is " + em.calBonus());

		mg.displayRole();
		System.out.println("Bonus is " + mg.calBonus());
	}

}
