package week1_day5;

abstract class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	void displaySalary() {
		System.out.println("and Salary is " + salary);
	}

	abstract String displayname();
}

class ContractEmployee extends Employee {

	ContractEmployee(String name, int salary) {
		super(name, salary);
	}

	@Override
	String displayname() {
		return name;
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		ContractEmployee obj = new ContractEmployee("Vijay", 150000);
		System.out.println("My Name is " + obj.displayname());
		obj.displaySalary();
	}

}
