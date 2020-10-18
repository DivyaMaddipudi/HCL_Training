package practice.inheritance;

public class TeachingStaff extends Staff{
	
	private String teachingSubject;
	private double teachingRating;
	private String qualification;
	
	public TeachingStaff() {
		
	}

	public TeachingStaff(String name, String address, String deptName, double pay, String teachingSubject, double teachingRaating, String qualification) {
		super(name, address, deptName, pay);
		this.teachingSubject = teachingSubject;
		this.teachingRating = teachingRaating;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "TeachingStaff ["+ super.toString() +"teachingSubject=" + teachingSubject + ", teachingRating=" + teachingRating
				+ ", qualification=" + qualification + "]";
	}
}
