package biswajeet;

import java.util.Scanner;

public class ChoiceMenu {
	
	public Scanner input;
	
	public ChoiceMenu() {
		input = new Scanner( System.in );
	}
	
	public int getChoice() {
		
		int choice = 0;
		
		System.out.println("Enter choice: 1, 2, 3 \r");
		choice = input.nextInt(); 
		
		return choice;
		
	}
	
	
	public void processChoice(int choice) {
		
		switch(choice) {
			
			case 1:
				System.out.println("you entered choice 1");
				break;

			case 2:
				System.out.println("you entered choice 2");
				break;
				
			case 3:
				System.out.println("you entered choice 3");
				break;
				
			default:
				System.out.println("default choice");
				break;
				
		};
		
	}
	
	
	public void run() {
		
		int choice = getChoice();
		processChoice(choice);
		
		System.out.println("Enter 0 to exit or 1 to continue");
		int selection = input.nextInt();
		
		if (selection != 0) {
			System.out.println("------------------------->");
			run();
		}
		else {
			System.out.println("Thanks for using our menu...");
			System.exit(0);
		}
		
	}
	

}
