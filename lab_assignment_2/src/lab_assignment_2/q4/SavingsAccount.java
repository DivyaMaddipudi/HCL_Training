package lab_assignment_2.q4;

class SavingsAccount extends Account{

	private final static double RATE = 5;
	private final static double MAX_WITHDRAW_LIMIT = 5000.0;
	private final static double MIN_BALANCE = 500.0;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(String memberName, double accountBalance) {
		super(memberName, accountBalance);
	}
	
	//This method calculates total interest to the account balance
	//and returns the interest
	public double getBalance() {
		double interest;
		if(getAccountBalance() >= MIN_BALANCE) {
			interest = getAccountBalance() * RATE;
		} else 
			interest = 0.0;
		return interest;
	}
	
	public void withDraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}
