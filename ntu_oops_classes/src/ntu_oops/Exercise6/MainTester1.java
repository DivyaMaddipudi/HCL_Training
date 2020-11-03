package ntu_oops.Exercise6;

/**
 * @author Maddipudi SatyaDivya
 * @since  03-11-2020
 *
 */
public class MainTester1 {
	
	public static void main(String[] args) {
		
		Shape circleShape = new Circle(1, "pink", false);
		System.out.println(circleShape.getArea());
		System.out.println(circleShape.getPerimeter());
		System.out.println(circleShape);
		
		Circle c1 = (Circle) circleShape;
		System.out.println(c1.getArea());
		
		System.out.println("---------------------------rectangle------------------------");
		Shape rectangleShape = new Rectangle(10, 20);
		System.out.println(rectangleShape.getArea());
		System.out.println(rectangleShape.getPerimeter());
		System.out.println(rectangleShape);
		
		System.out.println("------------------square-----------------");
		Shape square = new Square(10, "orange", true);
		System.out.println(square.getArea());
		System.out.println(square.getColor());
		System.out.println(square);
	}

}
