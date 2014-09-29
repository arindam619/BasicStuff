package ni;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class GPSdataParser {

	public static void main(String[] args) {
		
		//Scanner input = new Scanner(System.in);
		String gpsf = "gps_data.txt";
		SentenceParser sp = new SentenceParser(); 
		
		
		//load file.
		File gpsDataFile = new File(gpsf);
		
		//check for file exist
		if ( !gpsDataFile.exists() ) {
			System.out.println("File not found: " + gpsf);
			System.exit(0);
		}
		
		//int prompt;
		String line;
		
		try ( BufferedReader buffer = new BufferedReader(new FileReader(gpsDataFile)) ) {

			while ( (line = buffer.readLine()) != null ) {
				//process line.
				sp.displayFieldData(line);
				
				
				/*
				System.out.println("Parse more? Enter 1 = Yes, 0 = No");
				prompt = input.nextInt();
				
				//if (prompt == 1) continue;
				
				if (prompt == 0) {
					System.out.println("Total parse item: " + sp.totalItemParse);
					System.out.println("Thank you for using GPS parser.");
					break;
				}
				else {
					sp.displayFieldData(line);
					continue;
				}
				*/
				
			}
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Error occured.");
		}
		
		
		//input.close();
		
	}

}
