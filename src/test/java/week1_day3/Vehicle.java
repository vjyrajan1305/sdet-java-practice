package week1_day3;

class Vehicles {
	String brand;
	int speed;

	Vehicles(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}

	void start() {
		System.out.println(brand + " is starting");
	}

	void stop() {
		System.out.println(brand + " is stopping");
	}

}

class Car extends Vehicles {
	String countrymake;

	Car(String brand, int speed, String countrymake) {
		super(brand, speed);
		this.countrymake = countrymake;
	}

	void displayinfo() {
		System.out.println(brand + " top speed is " + speed + ". Made from " + countrymake);
	}
}

public class Vehicle {

	public static void main(String[] args) {
		Car c = new Car("Audi", 250, "Germany");
		c.displayinfo();
		c.start();
		c.stop();
	}

}
