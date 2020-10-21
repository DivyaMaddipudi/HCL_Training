package java_codes_examples;

import java.util.Vector;


class Gcex {
	private String color;
	public Gcex(String color) {
		this.color = color;
	}
	
	public void finalize() {
		System.out.println(this.color + " cleaned");
	}
}
public class GarbageCollection {
	
	public static void main(String[] args) {
		
		Gcex gar = new Gcex("obj");
		gar = null;
		
		System.out.println(gar);
		Runtime.getRuntime().gc();
		System.out.println(gar);
//		 GarbageCollection gc1 = new GarbageCollection();
//		 GarbageCollection gc2 = garbageMethod(gc1);
//		 GarbageCollection gc3 = new GarbageCollection();
//		 gc2 = gc3;
//		 System.out.println(gc2 == gc3);
//		 System.out.println(gc1);
//		 System.out.println(gc2);
//		 System.out.println(gc3);
	}

//	static GarbageCollection garbageMethod(GarbageCollection gc) {
//		gc = new GarbageCollection();
//		for(int i=0;i<=10;i++) {
//			String count = i + 1 + "";
//			System.out.println(count);
//		}
//		return gc;
//	}

}
