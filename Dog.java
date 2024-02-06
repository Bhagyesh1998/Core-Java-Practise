package Trashs;

class Student2{

	String name;
	int age;
	String sun;
	
	void sleep() {
		System.out.println("Chintz Sleeping");
	}
	
	void eat() {
		System.out.println("Chintz Eating");
	}
	
	void study() {
		System.out.println("Chintz Studying");
	}

}
class Employee{
	int SSn;
	String name;
	int age;
	String gender;
	int salary;
	String Dependents;
	
	void eat() {
		double a = 2.345123E+3;
		System.out.println("Eating");
	}
	void sleep() {
		System.out.println("Sleeping");
	}
	void work() {
		System.out.println("Working");
	}
}
class Dog{
	public static void main(String[] args) {
		Employee chintu = new Employee();
		Employee vishnu = new Employee();
		Employee sai = new Employee();
		
		chintu.SSn=1234;
		chintu.name = "Chintu";
		chintu.age = 24;
		chintu.gender = "Male";
		chintu.salary = 24525;
		chintu.Dependents = "Mother"; chintu.age=22; sai.name="Bhagyesh"; 
		chintu.eat();
		chintu.sleep();
		chintu.work();
		System.out.println(chintu.SSn+" "+chintu.name+" "+chintu.age+" "+chintu.gender+" "+chintu.salary+" "+chintu.Dependents);
		
		vishnu.SSn=123;
		vishnu.name = "vishnu";
		vishnu.age = 24;
		vishnu.gender = "Male";
		vishnu.salary = 24525;
		vishnu.Dependents = "Mother";
		vishnu.eat();
		vishnu.sleep();
		vishnu.work();
		System.out.println(vishnu.SSn+" "+vishnu.name+" "+vishnu.age+" "+vishnu.gender+" "+vishnu.salary+" "+vishnu.Dependents);
		
		sai.SSn=12;
		sai.name = "Sai";
		sai.age = 24;
		sai.gender = "Male";
		sai.salary = 24525;
		sai.Dependents = "Mother";
		sai.eat();
		sai.sleep();
		sai.work();
		System.out.println(sai.SSn+" "+sai.name+" "+sai.age+" "+sai.gender+" "+sai.salary+" "+sai.Dependents);
		
		new Employee().work();
		
	}
}
