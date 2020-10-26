package java_codes_examples;


class Calculator {
	
	public int cal(int a, int b) {
		return 1;
	}
}
class SciCal extends Calculator {
	
	public int cal(int a, int b) {
		return 2;
	}
}

public class example {
	
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		Calculator cal = new SciCal();
		System.out.println(cal.cal(10, 20));
//		System.gc();
	}

}
