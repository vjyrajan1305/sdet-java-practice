package week1_day6;
//Encapsulation
class Person {
	private String name;
	private int age;
	private String email;

	public Person(String name, int age, String email) {
		setName(name);
		setAge(age);
		setEmail(email);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			System.out.println("Invalid Name: " + name);
		} else {
			this.name = name;
		}
	}

	public void setAge(int age) {
		if (age < 1 || age > 120) {
			System.out.println("Invalid age: " + age);
		} else {
			this.age = age;
		}
	}

	public void setEmail(String email) {
		if (email == null || !email.contains("@")) {
			System.out.println("Invalid email: " + email);
		} else {
			this.email = email;
		}
	}

	public void display() {
		System.out.println("Name is " + name + "," + "Age is " + age + "," + "Email is " + email);
	}

}

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("Vijay", 30, "vijay@wns.com");
		p.setName("Vijay");
		p.setAge(30);
		p.setEmail("Vijay@wns.com");
		p.display();
	}

}
