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
		return getRate()+2;
	}
	

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}

	@Override
	public double getPayment() {
		System.out.println(this.toString());
		return salary;
	}
}
