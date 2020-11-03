package ntu_oops.composition_vs_inh52;

public class MainTester2 {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(100, "red");
		
		Cylinder cylinder = new Cylinder(circle, 10);
		System.out.println(cylinder);
		
		System.out.println("--------------------------Cylinder inherits Circle-------------------------------");
		
		CylinderInheritsCircle cIC = new CylinderInheritsCircle(circle, 10.0);
		System.out.println(cIC);
		
		CylinderInheritsCircle cIC1 = new CylinderInheritsCircle(200, "green", 100);
		System.out.println(cIC1);
		System.out.println(cIC1.getColor());
	}

}
