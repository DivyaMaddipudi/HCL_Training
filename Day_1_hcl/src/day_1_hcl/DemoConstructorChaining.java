package day_1_hcl;

class 	Acc {
	
	private int id;
	private String name;
	
	// calling one ctr frm another ctr
	Acc() {
		this(10, "foo");
	}
	
	Acc(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class DemoConstructorChaining {
	
	public static void main(String[] args) {
		
	}

}
