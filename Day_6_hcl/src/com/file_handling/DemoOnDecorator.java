package com.file_handling;

interface Greet{
	public String greet();
}

class SimpleGreet implements Greet {

	@Override
	public String greet() {
		return "good morning";
	}
}

class SpecialGreet implements Greet {

	public SpecialGreet(SimpleGreet simpleGreet) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String greet() {
		return "special greet" + this.greet();
	}
}

class NewYearGreet implements Greet {

	@Override
	public String greet() {
		return "Happy Diwali" + this.greet();
	}
}



public class DemoOnDecorator {
	
	public static void main(String[] args) {
		Greet greet = new NewYearGreet();
		
	}

}
