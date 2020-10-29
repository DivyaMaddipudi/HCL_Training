package com.inner_classes;

class A {
	public void foo() {
		
		int i = 9; //effictively final
		class B {
			public void secreteLogic() {
				System.out.println("secret logic that should not be exposed to the world" + i);
			}
		}
		
		B b = new B();
		b.secreteLogic();
	}
	
}

public class MethodLocalInnerClass {
	
	public static void main(String[] args) {
		
	}

}
