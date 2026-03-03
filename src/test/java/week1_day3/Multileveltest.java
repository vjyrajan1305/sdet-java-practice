package week1_day3;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void displaybasicinfo() {
		System.out.println("Name:" + name + "|Age is:" + age);
	}

}

class Employee extends Person {
	int salary;

	Employee(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}

	void employeebasicinfo() {
		System.out.println("Name:" + name + "|Age is " + age + "|Salary is " + salary);
	}
}

class Manager extends Employee {
	int teamsize;

	Manager(String name, int age, int salary, int teamsize) {
		super(name, age, salary);
		this.teamsize = teamsize;
	}

	void managerbasicinfo() {
		System.out
				.println("Name:" + name + "|Age is " + age + "|Salary is " + salary + "|Managing team of " + teamsize);
	}
}

public class Multileveltest {

	public static void main(String[] args) {
		Manager m = new Manager("Vijay", 30, 100000, 10);
		m.managerbasicinfo();
	}

}