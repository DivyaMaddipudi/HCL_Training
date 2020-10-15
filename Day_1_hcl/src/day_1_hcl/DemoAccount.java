package day_1_hcl;

class Account {

	private int id;
	private String name;
	private double balance;
	
	private static String bankName;

	// default ctr: it is provided by default

	public Account() {
		System.out.println("Default");
	}

	public Account(int id, String name, double balance) {

		// id = id // bad code assigning local var to local var and has no effect
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// copy ctr: used to create a new object from older object
	public Account(Account acc) {

		// id = id // bad code assigning local var to local var and has no effect
		this.id = acc.id;
		this.name = acc.name;
		this.balance = acc.balance;
	}

	public void print() {
		System.out.println("the account details:" + id + " " + name + " " + balance);
	}

}

public class DemoAccount {

	public static void main(String[] args) {
		Account acc = new Account(11, "divya", 50000);
		acc.print();
		
		Account acc1 = new Account(acc);
		acc1.print();
	}

}
