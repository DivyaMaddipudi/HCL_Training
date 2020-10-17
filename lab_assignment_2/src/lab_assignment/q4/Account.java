package lab_assignment.q4;

import java.util.Random;

public class Account {
	
	private String memberName;
	private String accountBalance;
	
	Random random = new Random();
	private String accountNumber = "" + random.nextInt(10) + random.nextInt(10) + random.nextInt(10) + random.nextInt(10);
	
	public Account(String memberName, String accountBalance) {
		super();
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}
	
	
	

}
