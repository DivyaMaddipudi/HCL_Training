package practice.inheritance;

public class Tester {
	
	public static void main(String[] args) {
		Staff staff =new Staff("Raj", "Mumbai", "CS", 50000.0);
		System.out.println(staff.toString());
		
		NonTeachingStaff nts = new NonTeachingStaff("Riya", "delhi", "CSE", 10000, "Dancing");
		System.out.println(nts.toString());
		
		TeachingStaff ts = new TeachingStaff("John", "Chennai", "IT", 15000, "Java", 5.0, "Ph.D");
		System.out.println(ts.toString());
	}
}
