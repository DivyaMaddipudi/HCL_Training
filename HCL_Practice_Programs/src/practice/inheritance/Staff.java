package practice.inheritance;

public class Staff extends Person{
	
	private String deptName;
	private double pay;
	
	public Staff() {
		
	}
	
	public Staff(String name, String address, String deptName, double pay) {
		super(name, address);
		this.deptName = deptName;
		this.pay = pay;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff ["+ super.toString() +" ,DeptName=" + deptName + ", pay=" + pay + "]";
	}

}
