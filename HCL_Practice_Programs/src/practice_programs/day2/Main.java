package practice_programs.day2;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Divya", "Maddipudi", 10000.0);
		
		System.out.println(emp.toString());
		
		emp.getRaisedSalary(40);
		
		System.out.println(emp.toString());
	}
}
