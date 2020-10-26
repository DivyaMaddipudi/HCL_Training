package java_codes_examples;


public class NonStaticInnerClass {
	public static void main(String[] args) {
		OuterClas outObj = new OuterClas();
		OuterClas.InnerClass objInner = new OuterClas().new InnerClass();
		outObj.doOuter();
	}
}

class OuterClas {
	static int a = 10;
	private int b = 20;
	int i = 30;
	final int d = 40;
	class InnerClass {
		int i = 10;
		public void getVariable() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(d);
			System.out.println(this.i + " " + OuterClas.this.i + d );
		}
	}
	public void doOuter() {
		InnerClass inn = this.new InnerClass();
		inn.getVariable();
	}
}

