package ntu_oops.classes6;

public class Account {
	
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int credit(int amount) {
		int newAmount = getBalance() + amount;
		this.balance = newAmount;
		return newAmount;
	}
	
	public int debit(int amount) {
		int newAmount = 0;
		if(amount <= getBalance()) {
			newAmount = getBalance() - amount;
			this.balance = newAmount;
		} else
			System.out.println("amount exceeded");
		return newAmount;
	}
	
	public int transferTo(Account account, int amount) {
		int newAmount = 0;
		if(amount <= getBalance()) {
			newAmount = getBalance() - amount;
			this.balance = newAmount;
			account.balance = account.balance + amount;
			
		} else 
			System.out.println("amount exceeded");
		return newAmount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
