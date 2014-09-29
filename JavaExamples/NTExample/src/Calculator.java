import java.util.Scanner;


public class Calculator {
	
	private Scanner input;
	private double a, b;
	private int option;
	
	
	public Calculator() {

		input = new Scanner(System.in); 
		
	}
	
	public void displayMenu() {
		
		System.out.print("Enter first value: ");
		a = input.nextDouble();
		
		
		System.out.print("Enter second value: ");
		b = input.nextDouble();
		
		
		System.out.println("Select operation - 1: Add, 2: Sub");
		option = input.nextInt();
		
		
		getResult();
		
	}
	
	
	private void getResult() {
		
		double result;
		
		switch (option) {
		
			case 1:
				result = a+b;
				System.out.println("Sum is: " + result );
				break;
				
			case 2:
				result = a-b;
				System.out.println("Sub is: " + result );
				break;
	
			default:
				System.out.println("Option not available");
				break;
				
		}
		
		input.close();
	}
	
	
}
