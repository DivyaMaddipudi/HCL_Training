package com.inner_classes;

class Outer {
	private int i = 66;
	class Inner {
		private int i = 99;
		public void doInner() {
			System.out.println("Inner class" +this.i + " " + Outer.this.i);
		}
	}
	
	public static void doOuter() {
		Inner inner = new Outer().new Inner();
		inner.doInner();
	}
}

public class DemoOnInnerClasses {
	
	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.doOuter();
		
	}

}
