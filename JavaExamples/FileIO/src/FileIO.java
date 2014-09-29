import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

class FileData {
	
	public static String FILE = "test.txt";
	public File file;
	
	public FileData() {
		file = new File(FILE);
	}
	
	
	public String getData() {
		
		String lineData;
		String output = "";
		
		try ( BufferedReader br = new BufferedReader( new FileReader(file) ); ) {
			
			while ( br.ready() )  {
				lineData = br.readLine();
				String[] info = lineData.split(":");
				
				output += "Name: "+info[0].trim() + 
						", Subject: "+info[1].trim() +
						", Mark: "+info[2].trim();
				
				output += "\n";
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return output;
		
	}
	
	//studentName: 
	//Subject:
	//Mark
	public boolean writeData(String[] studentInfo) {
		
		boolean result = false;
		String data = studentInfo[0] + " : " + studentInfo[1] + " : " + studentInfo[2];
		
		try ( FileWriter fw = new FileWriter(file, true); ) {
			
			fw.append(data + "\n");
			result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
		
	}

	
	public void optionMenu() {
		
		//String output = "";
		Scanner input = new Scanner(System.in);
		String[] studentInfo = new String[3];
		
		
		
		System.out.println("Enter 0: load data, 1: write data");
		int choice = input.nextInt();
		
		switch (choice) {
		
			case 0:
				
				String data = getData();
				
				if ( !data.isEmpty() )
					System.out.println(data);
				else 
					System.out.println("No data available.");
				
				break;
				

			case 1:
				
				Scanner input1 = new Scanner(System.in);
				System.out.println("Enter student name:");
				studentInfo[0] = input1.nextLine();
				
				Scanner input2 = new Scanner(System.in);
				System.out.println("Enter subject:");
				studentInfo[1] = input2.nextLine();
				
				Scanner input3 = new Scanner(System.in);
				System.out.print("Enter mark obtained:");
				studentInfo[2] = input3.next();
				
//				System.out.println( Arrays.toString(studentInfo) );
//				System.exit(0);
				
				/*
				for (int i=0; i<studentInfo.length; i++) {
					
					switch(i) {
						case 0:
							studentInfo[i] = input.nextLine();
							System.out.println("Enter student name:");
							break;
						
						case 1:
							studentInfo[i] = input.nextLine();
							System.out.println("Enter subject:");
							break;
						
						case 2:
							System.out.print("Enter mark obtained:");
							//studentInfo[i] = input.next();
							break;
						
					}
					
				}
				*/
								
				
				if ( studentInfo[0].isEmpty() ||
						studentInfo[1].isEmpty() ||
						studentInfo[2].isEmpty() ) {
					
					System.out.println("Invalid data!");
					break;
				}
				
				boolean result = writeData(studentInfo);
				
				if (result)
					System.out.println("Data successfully writen...");
				else 
					System.out.println("Data writen failed.");
				
				break;
				
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Enter 0 exist or 1 to continue");

		if (0 == input.nextInt()) {
			System.out.println("Thank you for using our file data app!");
			input.close();
			System.exit(0);			
		}			
		else 
			optionMenu();
		
		
	}
	
	
}

public class FileIO {

	public static void main(String[] args) {
		
		FileData fd = new FileData();
		fd.optionMenu();
		
	}

}
