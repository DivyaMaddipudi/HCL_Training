package practice_programs.day2;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Divya", "Maddipudi", 10000.0);

		System.out.println(emp.toString());

		emp.getRaisedSalary(40);

		System.out.println(emp.toString());

		try {
			int i, sum;
			sum = 10;
			for(i=-1;i<3;i++) {
				sum = (sum/i);
			}
		} catch (ArithmeticException e) {
			System.out.println("0");
		}
	}
}
