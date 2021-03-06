package day_1_hcl;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increment(double percentage) {
		if (percentage < 1)
			salary = salary + salary * percentage;
		else
			System.out.println("% should be < 1");

	}

	public void print() {
		System.out.println(id + " " + name + " " + salary);
	}

}

public class DemoAbstractionAndEncapInRealLife {

	public static void main(String[] args) {
		Employee emp = new Employee(121, "divya", 3000);
		emp.print();
		emp.increment(0.2);
		emp.print();

	}

}
