package lab_assignment_3.q1;

public class HourlyEmployee extends Employee {
	
	private int salaryPerHour;
	private int numOfHours;

	public HourlyEmployee(int salary, int numOfHours) {
		this.salaryPerHour = salary;
		this.numOfHours = numOfHours;
		
	}

	@Override
	public int getSalary() {
		System.out.println("Hourly employee ");		
		return salaryPerHour * numOfHours;
	}

}
