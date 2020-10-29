package com.day2.interfaceex;

interface swimmable {
	
	public void swim();
}

interface flyable {
	
	public void fly();
}


class Birds {
	public void sound() {
		System.out.println("some sound of bird");
	}
	
	public void eat() {
		System.out.println("eat rice, wheat and fruits");
	}
	
}

class Duck implements swimmable {

	@Override
	public void swim() {
		System.out.println("duck is championion in swimming");
		
	}
}
class Eagle implements flyable{

	@Override
	public void fly() {
		System.out.println("Rock! in flying");
	}
}

class Emu extends Birds {
	
}
public class Bird {
	
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.fly();
		
	}
}
