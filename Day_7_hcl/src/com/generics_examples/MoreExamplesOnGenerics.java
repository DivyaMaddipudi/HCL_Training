package com.generics_examples;

interface Liquidity {
	
}
interface Drinkable {
	
}

class Water implements Liquidity, Drinkable {
	
}
class Juice implements Liquidity, Drinkable {
	
}
class Cake {
	
}
class Glass<T extends Liquidity & Drinkable> {
	private T juice;
	Glass() {
		
	}
 	public Glass(T juice) {
		super();
		this.juice = juice;
	}

	public T getJuice() {
		return juice;
	}

	public void setJuice(T juice) {
		this.juice = juice;
	}

	@Override
	public String toString() {
		return "Glass [juice=" + juice + "]";
	}
	
}
public class MoreExamplesOnGenerics {
	//Why generics ?
	
	public static void main(String[] args) {
//		Juice juice = new Juice();
//		Glass glass1 = new Glass();
//		glass1.setJuice(juice);
//		System.out.println(glass1.getJuice());
		
		Glass<Water> glass = new Glass();
		glass.setJuice(new Water());
		Water water = glass.getJuice();
		System.out.println(water);
		
//		Glass<Cake> glass1 = new Glass(); Since cake deos not implements liquidity and drinkable
//		glass1.setJuice(new Cake());
//		Cake cake = glass1.getJuice();
//		System.out.println(cake);
	}
}
