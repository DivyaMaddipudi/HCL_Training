package ntu_oops.classes6;

public class Tester6 {
	
	public static void main(String[] args) {
		
		Account account = new Account("123", "divya", 9000);
		account.credit(1000);
		System.out.println("Account details after crediting: " + account.toString());
		
		account.debit(5000);
		System.out.println("Account details after debiting: " + account.toString());
		
		Account account1 = new Account("124", "ram", 3000);
		account.transferTo(account1, 5000);
		System.out.println("Account details after crediting:" + account1.toString());
		System.out.println("Account details after transfered to another account:" + account.toString());
	}

}
