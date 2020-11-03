package ntu_oops.composition_vs_inh5;

public class Tester1 {
	
	public static void main(String[] args) {
		
		Point begin = new Point(10, 20);
		Point end = new Point(20, 30);
		
		LineComposesPoint line = new LineComposesPoint(begin, end);
		System.out.println(line);
		
		LineComposesPoint line1 = new LineComposesPoint(100, 200, 200, 300);
		System.out.println(line1);
		
		System.out.println(line1.getBegin());
		
		line1.setBeginXY(150, 250);
		System.out.println(line1.getBegin());
		
		System.out.println("length of line:" + line1.lengthOfLine());
		
		
		//--------------------------------------------line inherits point--------------------------------------------------
		
		System.out.println("--------------------------------------------line inherits point--------------------------------------------------");
		
		LineInheritsPoint lineIn1 = new LineInheritsPoint(begin, end);
		System.out.println(lineIn1);
		System.out.println(lineIn1.lengthOfLine());

		Point beginIn = new Point(100, 200);
		end.setPoint1(250);
		end.setPoint2(350);
		
		LineInheritsPoint lineIn2 = new LineInheritsPoint(beginIn, end);
		System.out.println(lineIn2.lengthOfLine());
		
		System.out.println(lineIn2.getBegin());
		System.out.println(lineIn2.getEnd());
	}

}
