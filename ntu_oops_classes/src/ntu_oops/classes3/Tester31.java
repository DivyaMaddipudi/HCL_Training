package ntu_oops.classes3;

public class Tester31 {
	
	public static void main(String[] args) {
		
		MyComplex myComplex = new MyComplex(5, 3);
		System.out.println(myComplex);
		
		System.out.println("Is imaginary: " +myComplex.isImaginary());
		
		System.out.println("Magnitute: " +myComplex.magnitude());
		
		MyComplex myComplex1 = new MyComplex(4, 3);
		
		System.out.println(myComplex.equals(myComplex1));
		
		System.out.println("sum of current instance " + myComplex.add(myComplex));
		
		System.out.println("sum of another instance " + myComplex1.addNew(myComplex));
		
		System.out.println(myComplex1.conjugate());
	}

}
