package Trashs;

class Student1 {
	String name;
	int age;
	String gender;
	String usn;
	
	void eat() {
		System.out.println("Student Eating");
	}
	void sleep() {
		double a = 2.345123e+3;
		boolean b =false;
		System.out.println(b);
		System.out.println(a);
		System.out.println("Student sleeping");
	}
	void study() {
		System.out.println("Student Reading");
	}
	void prodPattern() {
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
	}
}
public class Student{
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.name = "Bhagyesh";
		s.age = 24;
		s.gender = "Male";
		s.usn = "176Q1A0593";
		s.eat();
		s.sleep();
		s.study();
		s.prodPattern();
		System.out.println();
		new Student1().prodPattern();
	}
}
