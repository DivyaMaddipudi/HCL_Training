package practice_programs.day2;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(int id, String firstName, String lastName, double salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return getFirstName() + getLastName();
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getRaisedSalary(int percentage) {
		double newSalary = 0.0;
		if (!(percentage < 0 || percentage > 100)) {
			newSalary = salary + (salary * (percentage / 100));
		}
		return newSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",  Name=" + lastName + ", salary=" + salary
				+ "]";
	}

}
