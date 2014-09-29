
public class OOPExample {
	
	
	public static void main(String[] args) {
		
		Account account = new Account("Rinku Das", 10000);
		
		System.out.println( account );
		
		account.setBalance(2000);

		account.withdraw(15000);
		
		account.toString();
		
	}
	

}
