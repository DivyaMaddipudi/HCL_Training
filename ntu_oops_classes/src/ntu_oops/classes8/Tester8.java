package ntu_oops.classes8;

public class Tester8 {
	
	public static void main(String[] args) {
		Time time = new Time(00, 59, 59);
		
		System.out.println("Previous second is: " +time.previousSecond());
		System.out.println("Given current second is: " + time.toString());
		System.out.println("next second is: " + time.nextSecond());
		
		
	}

}
