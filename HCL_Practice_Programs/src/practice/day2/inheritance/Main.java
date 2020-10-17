package practice.day2.inheritance;

public class Main extends Object{
	
	public static void main(String[] args) {
		Person person = new Person("Divya", "Chennai");
		System.out.println(person.toString());
		
		Staff staff = new Staff("HCL", 1000.0, "Divya", "Banglore");
		System.out.println(staff.toString());
		
		Students student = new Students("Java", 2020, 12000.0, "Satya", "Banglore");
		System.out.println(student.toString());
		
	}

}
