package week1_day3;

class Animalinfo {
	String name;
	int age;

	Animalinfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void eat() {
		System.out.println(name + " is eating");
	}

	void age() {
		System.out.println(name + " age" + " is " + age);
	}
}

class Dog extends Animalinfo {
	String breed;

	Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	void breed() {
		System.out.println("Dog breed is " + breed + " ,Name is " + name + " ,Age is " + age);
	}
}

public class Animal {

	public static void main(String[] args) {
		Animalinfo af = new Animalinfo("Johnny", 3);
		af.eat();
		af.age();
		Dog d = new Dog("maggi", 10, "Pomerian");
		d.eat();
		d.age();
		d.breed();
	}

}
