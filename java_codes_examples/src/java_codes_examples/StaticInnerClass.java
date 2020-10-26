package java_codes_examples;

public class StaticInnerClass {
	public static void main(String[] args) {
		OuterClass.InnerClass objInner = new OuterClass.InnerClass();
		objInner.getVariable();
	}
}

class OuterClass {
	static int i = 10;
	final int j = 20;
	private int k = 30;
	static class InnerClass {
		int a = 100; // need not to be static
		public void getVariable() {
			System.out.println(i);
			System.out.println(a);
//			System.out.println(j); // static nested class can access only static members of outer class
//			System.out.println(k);
		}
	}
}

