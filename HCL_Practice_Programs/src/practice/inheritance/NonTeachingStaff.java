package practice.inheritance;

public class NonTeachingStaff extends Staff{
	
	private String skills;
	
	public NonTeachingStaff() {
		
	}

	public NonTeachingStaff(String name, String address, String deptName, double pay, String skills) {
		super(name, address, deptName, pay);
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "NonTeachingStaff ["+ super.toString() +"skills=" + skills + "]";
	}

	

}
