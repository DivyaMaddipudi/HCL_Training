package java_codes_examples;

class Outer {
	public static int temp1 = 1;
	private static int temp2 = 2;
	public  int temp3 = 3;
	private  int temp4 = 4;

	public static class Inner {
		private static int temp5 = 5;

		private static int getSum() {
//			return (temp1 + temp2 + temp3 + temp4 + temp5); error since temp3, temp4 are not static
			return 0;
		}
	}

	public static void main(String[] args)

	{
		Outer.Inner obj = new Outer.Inner();
		System.out.println(obj.getSum());
	}
}
