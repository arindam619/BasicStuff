package Netinfosys;

import java.util.Scanner;



public class StudentManagerMenu {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		studentMenu();
	}
	
	
	public static boolean pushData(StudentManager sm) {
		
		String[] info;
		String name, subject, mark;
		
		System.out.print("\n Enter name: ");
		name = input.next();
		
		System.out.print("\n Enter Subject: ");
		subject = input.next();
		
		System.out.print("\n Enter Mark: ");
		mark = input.next();
		
		info = new String[]{subject, mark};
		
		return sm.setInfo(name, info) ? true : false;		
		
	}
	
	
	public static void studentMenu() {
		
		StudentManager sm = new StudentManager();		
		Boolean taskError = true;
		
		System.out.println("Student info system menu.");
		System.out.println("------------------------>");
		
		if ( !sm.f.exists() ) {
			
			System.out.println("Enter student record");
						
			if ( pushData(sm) ) {
				System.out.println("Data successfully saved...");
				taskError = false;
			}
			else {
				System.out.println("Error: data could\'t be saved!");
			}

			
		}
		else {
			
			System.out.print("Action Menu \n 0: View records, \n 1: Write record \n 2: Search record \n 3: Delete record \n 4: Exit \nEnter option: ");
			int o = input.nextInt();
			
			System.out.println("----------------------->");
			
			switch (o) {
				
				case 0:
					sm.displayRecord();
					taskError = false;
					break;
				
				case 1:
					
					if ( pushData(sm) ) {
						System.out.println("Data successfully saved...");
						taskError = false;
					}
					else {
						System.out.println("Error: data could\'t be saved!");
					}
					
					break;
				
				case 2:
					
					System.out.print("Search by student name: ");
					String name = input.next();
					
					String[] studentData = sm.loadInfo(name);
					
					if (studentData != null) {
						System.out.println("Query against "+ StudentManager.capitalized(name) + " is found --->");
						System.out.println("Subject: " + studentData[0] + ", Mark: " + studentData[1]);
					}
					else
						System.out.println("Query against "+ name + "is not found");
					
					taskError = false;					
					break;
					
				case 3:
					System.out.println("Delete record not implemented.");
					taskError = false;
					break;
					
				case 4:
					System.out.println("Thank you for using Student Manager Application.");
					System.exit(0);
					break;
					
			};
			System.out.println("");
		
		}		
				
		if (!taskError) {
			studentMenu();
		}
		else {
			System.exit(0);
		}
	
	}
	
}//end StudentManagerMenu
