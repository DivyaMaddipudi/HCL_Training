package java_codes_examples;

public class MethodLevelInnerClass {

	public static void main(String[] args) {
		
		OuterCla outer = new OuterCla();
		outer.outerMethod();
	}
}

class OuterCla {
	
	int x = 100;
	static int y = 200;
	final int z	 = 300;
	private int a = 400;
	public void outerMethod() {
		final int b = 10;
		int c = 20; //effictively final
		class Inner {
			public void innerMethod() {
				System.out.println("inner method");
				System.out.println(OuterCla.this.x);
				System.out.println(OuterCla.y);
				System.out.println(z);
				
//				c = 30; //can't access 
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		}
		Inner inn = new Inner();
		inn.innerMethod();
	}
}
