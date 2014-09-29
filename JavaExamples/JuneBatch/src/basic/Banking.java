package basic;

public class Banking {
	
	public static final String BANK = "SBI";
	
	private String AccountHolderName;
	private int balance;
	private int widthdrawAmmount = 0;
	
	public Banking(String AccountHolderName, int deposite) {
		this.AccountHolderName = AccountHolderName;
		balance = deposite;
	}
	
	
	//implementation of getters / setters
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int amt) {
		this.balance += amt;
	}
	
	public Boolean widthraw(int amt) {
		
		boolean result = false;
		
		//validation
		if (amt < balance) {
			
			balance -= amt;
			widthdrawAmmount = amt;
			result = true;
			
		}
		
		return result;
		
	}
	
	public void myInfo() {
		
		String messg = "Welcome to " + BANK;
		messg += "\n Account holder: " + AccountHolderName;
		messg += "\n Available balance Rs: " + balance;
		messg += "\n-------------------------------\n";
		
		System.out.println(messg);
		
	}
	
}
