package lab_assignment_3.q1;

import lab_assignment_3.q2.Payable;

abstract class Employee implements Payable{
	
	private int rate;
	
	public Employee() {
		
	}
	
	public abstract int getSalary();

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
