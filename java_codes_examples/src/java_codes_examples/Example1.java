package java_codes_examples;

class Two {
	int x; //initially 0, if string initially null
}

class Example1 {
	
	public static void main(String[] args) {
		Example1 p = new Example1();
		p.start();
	}

	void start() {
		Two t = new Two();
		System.out.print(t.x + " ");
		Two t2 = fix(t);
		System.out.println(t.x + " " + t2.x);
	}

	Two fix(Two tt) {
		tt.x = 42;
		return tt;
	}
}
