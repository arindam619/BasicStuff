
public class Account {
	
	private String accountHolder;
	private int balance;
	
	public Account(String accountHolder, int balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int ammount) {
		balance += ammount;
		
		String message = "Ammount deposited: " + ammount + "\n";
		message += "Cleared A/C balance: Rs. " + balance + "\n"; 
				
		System.out.println(message);
		
	}
	
	public void withdraw(int amt) {
		
		if (amt > balance) {
			System.out.println("Not available balance" + "\n");
			return;
		}
		
		balance -= amt;
		System.out.println("Ammount: " + amt + " withdrawn.");
		System.out.println("Cleared A/C balance: Rs. " + balance + "\n");
		
	}
	
	
	public String toString() {
		
		String message;
		
		message = "Account: " + accountHolder;
		message += "\n";
		message += "Available balance: Rs. " + balance + "\n";
		
		System.out.println(message);
		return "";
		
	}
	
	
}
