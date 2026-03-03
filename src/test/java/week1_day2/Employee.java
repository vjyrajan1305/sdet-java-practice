package week1_day2;

class EmployeeInfo {
	String name;
	Double salary;
	String dept;

	EmployeeInfo(String name, Double salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
//method overloading - Same method name, but behaves differently based on what you pass in.
	void data() {
		System.out.println(name + " works in " + dept);
	}

	void data(boolean showsalary) {
		if (showsalary) {
			System.out.println("Salary is " + salary);
		} else {
			System.out.println("Salary not Disclosed");
		}
	}

	void data(String name, Double salary) {
		System.out.println(name + " works in " + dept + " with salary of " + salary);
	}
}

public class Employee {

	public static void main(String[] args) {
		EmployeeInfo em = new EmployeeInfo("Vijay", 100000.00, "QA");
		em.data();
		em.data(false);
		em.data(true);
		em.data("Keerthi", 30000.44);
	}

}
