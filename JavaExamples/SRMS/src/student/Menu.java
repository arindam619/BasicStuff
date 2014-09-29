package student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.Scanner;

public class Menu {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		mainMenu();
		
	}
	
	
	public static HashMap<String, String> getInput(String mode, int id) {
		HashMap<String, String> data = null;
		String name = "";
		
		if (mode == "edit" && id <= 0 ) {
			return data;
		}
		else {
			Info info = Info.Instance();
			name = info.getStudentName(id);				
		}
		
		data = new HashMap<>();
		
		if (mode != "edit") {
			System.out.println("Enter name:");
			name = input.next();
		}
		else {
			System.out.println("Edit record for - " + name);
		}
		
		System.out.println("Enter subject:");
		String subject = input.next();
		
		System.out.println("Enter theory mark:");
		String theory = input.next();
		
		
		System.out.println("Enter practical mark:");
		String practical = input.next();
		
		data.put("name", name);
		data.put("subject", subject);
		data.put("theory", theory);
		data.put("practical", practical);
		
		return data;		
	}
	
	public static void mainMenu() {
		
		Info info = Info.Instance();
		Boolean taskErr = true;
		
		System.out.println( "STUDENT RECORD MANAGEMENT SYSTEM" );
		System.out.println( "------------------------>" );
		
		System.out.print("Action Menu \n <0> View records \n <1> Add record \n <2> Edit record \n <3> Delete record \n <4> Exit \nEnter option: ");
		int o = input.nextInt();
		
		switch(o) {
		
			case 0:
				
				info.displayRecord();
				taskErr = false;
				break;
				
			case 1:
				
				HashMap<String, String> data = getInput("add", 0);
				if ( null != data ) {
					if ( info.addRecord(data) );
						System.out.println("New record added successfully...");
				}
				else
					System.out.println("Error adding new record");
				taskErr = false;
				break;
				
			case 2:
				
				System.out.print("Enter id for edit: ");
				int id = input.nextInt();
				
				HashMap<String, String> editData = getInput("edit", id); 
				
				if (editData != null) {
					if ( info.updateRecord(id, editData) );
						System.out.println("Record successfully edited...");
					taskErr = false;
				}
				else {					
					System.out.println("Error editing reord.");
				}

				break;
				
			case 3:
				
				System.out.println( "Enter id for Delete :" );
				int idToDelete = input.nextInt();
				

				
				if ( info.deleteRecord(idToDelete)) {
						System.out.println("Record successfully Deleted...");
					taskErr = false;
				}
				else 					
					System.out.println("Error deleting reord.");
				

				break;
				
			case 4:
				
				System.out.println( "Thank you for using STUDENT RECORD MANAGEMENT SYSTEM Application." );
				System.exit(0);
				break;
				
			default:
				System.out.println("Selection not match");
				mainMenu();
				break;
		
		};
		
		System.out.println("----------------------->");
		
		if (!taskErr) {
			mainMenu();
		}
		
		else {
			System.exit(0);
		}
		//info.displayRecord();
		
		/*
		HashMap<String, String> data = new HashMap<>();
		
		data.put("name", "Supriya");
		data.put("subject", "C++");
		data.put("theory", "60");
		data.put("practical", "15");
		
		if ( info.updateRecord(41, data) ) {
			System.out.println("record for id 41 is updated");
		}
		
		
		if ( info.deleteRecord(41) ) {
			System.out.println("record id:41 deleted");
			
		*/
		
		
	}
	
}
	
	
	

