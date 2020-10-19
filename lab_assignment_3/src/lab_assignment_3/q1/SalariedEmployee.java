package lab_assignment_3.q1;

public class SalariedEmployee extends Employee implements IncreaseSalary{
	
	private int salary;
	
	public SalariedEmployee(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getSalary() {
		System.out.println("Salaried employee: ");
		return salary;
	}

	@Override
	public int increaseSalary() {
		return 5;
	}
}
