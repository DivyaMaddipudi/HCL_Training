package ntu_oops.classes2.composition5;

public class Tester5 {
	
	public static void main(String[] args) {
		MyTriangle triangle = new MyTriangle(1, 2, 0, 0, 2, 1);
		System.out.println(triangle.getPerimeter());
		System.out.println(triangle.getType());
	}
}
