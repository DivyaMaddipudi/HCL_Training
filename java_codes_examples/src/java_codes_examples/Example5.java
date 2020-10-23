package java_codes_examples;



abstract class A {
	public abstract void foo();
}

class B extends A{
	public void foo() {
		System.out.println("hello");
	}
}
public class Example5 {
	
	public static void main(String[] args) {
		
		A b = new B();
		B a = new B();
		
		
	}

}
