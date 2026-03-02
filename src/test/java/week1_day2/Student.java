package week1_day2;

class Studentinfo {
	String name;
	int age;
	String course;

	Studentinfo(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	void displayinfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Course: "+course);
	}
}

public class Student {

	public static void main(String[] args) {
		Studentinfo s1 = new Studentinfo("Vijay", 30, "Lead SDET");
		Studentinfo s2 = new Studentinfo("Keerthi", 26, "SDET");
		s1.displayinfo();
		s2.displayinfo();
	}

}
