package Trashs;

class Demo {
	char department;
	byte age;
	short basicSalary;
	float height;
	boolean martialStatus;
	
	void eat() {
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
	void printPattern() {
		for (int i = 1; i <= 5; i++) 
		{
				for (int j = i; j <= 5; j++) 
				{
					System.out.print("*");
				}
				System.out.println();
		}
	}
}
public class Employee2{
	public static void main(String[] args) {
		Demo d = new Demo();
		
		d.eat();
		d.sleep();
		d.printPattern();
		
		System.out.println(d.department);
		System.out.println(d.age);
		System.out.println(d.basicSalary);
		System.out.println(d.height);
		System.out.println(d.martialStatus);
		new Demo().printPattern();
	}
}
