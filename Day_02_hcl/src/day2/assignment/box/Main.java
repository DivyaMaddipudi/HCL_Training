package day2.assignment.box;

class Box2D {
	private int length;
	private int breadth;
	
	Box2D() {
		
	}
	public Box2D(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void print() {
		System.out.println("length:" + length +" breadth:"+breadth);
	}
}

class Box3D extends Box2D {
	private int height;
	
	Box3D() {
		
	}
	public Box3D(int length, int breadth, int height) {
		
		super(length, breadth);
		
		this.height = height;
	}
	
	public void print() {
		super.print();
		System.out.println("Height: " + height);
	}
}

class Box3DWithColor extends Box3D {
	private String color;
	
	Box3DWithColor() {
		
	}
	public Box3DWithColor(int length, int breadth, int height, String color) {
		super(length, breadth, height);
		this.color = color;
	}
	
	public void print() {
		super.print();
		System.out.println("color: " + color);
	}
}
public class Main {
	
	public static void main(String[] args) {
		
		Box3DWithColor bx = new Box3DWithColor(3, 4, 5, "red");
		bx.print();
	}
	

}
