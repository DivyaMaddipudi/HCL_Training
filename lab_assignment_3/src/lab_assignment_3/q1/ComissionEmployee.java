package lab_assignment_3.q1;

public class ComissionEmployee extends Employee implements IncreaseSalary{
	
	private int perecentage;
	private int weeklySale;
	
	public ComissionEmployee(int perecentage, int weeklySale) {
		this.perecentage = perecentage;
		this.weeklySale = weeklySale;
	}

	@Override
	public int getSalary() {
		System.out.println("Salary of comission employee is ");
		return (perecentage*weeklySale)/100;
	}

}
