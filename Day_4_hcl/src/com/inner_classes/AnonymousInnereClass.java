package com.inner_classes;

//annonymous inner class: a class with no name

interface Cookable {
	public void cook();
}

//class StreatFood implements Cookable {
//
//	@Override
//	public void cook() {
//		System.out.println("streat food!");
//	}
//	
//}
public class AnonymousInnereClass {
	public static void main(String[] args) {
//		StreatFood food = new StreatFood();
//		food.cook();

		// hey java create an annonymous implementation of cookable interface
		// and i dont care abt the name of that impl...just give me name
		Cookable cookable = ()-> {
				System.out.println("good in health and light!");
			
		};

		Cookable cookable1 = ()->{	
			System.out.println("1 good in health and light!");
		};

		Cookable cookable2 = ()-> {
				System.out.println("2 good in health and light!");

		};
		
		cookable.cook();

	}
}
