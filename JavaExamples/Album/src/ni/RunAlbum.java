package ni;

import java.sql.SQLException;
import java.util.Scanner;



public class RunAlbum {
	
	private Scanner menuInput, titleInput, tracksInput, yearInput;
	private Album album;
	
	public RunAlbum() {
		
		
		try {
			album = new Album();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		menuInput = new Scanner(System.in);
		titleInput = new Scanner(System.in);
		tracksInput = new Scanner(System.in);
		yearInput = new Scanner(System.in);
		
	}
	
	
	public static void main(String[] args) {

		RunAlbum runAlbum = new RunAlbum();
		runAlbum.menu();
		
	}

	public void menu() {
		
		
		Scanner input = new Scanner(System.in);
		
		String menu = "Menu: \n";
		menu += "0: Search record \n";
		menu += "1: View record \n";
		menu += "2: Add record \n";
		menu += "3: Edit record \n";
		menu += "4: Delete record \n\n";
		menu += "Enter option: ";
		
		System.out.print(menu);
		int choice = menuInput.nextInt();
		
		switch (choice) {
		
		case 0:
			
			System.out.println("Enter album name to search: ");
			String searchAlbum = titleInput.nextLine();
			
			try {
				
				if ( !album.searchRecord(searchAlbum) ) {
					System.out.println("Album: " + searchAlbum + " doesn\'t exist!");
				}
				
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		    break;
		
		case 1:
				
				try {
					
					album.viewTitles();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				break;
	
			case 2:
				
				System.out.print("Album name: ");
				String name = titleInput.nextLine();
				
				System.out.print("Total tracks: ");
				int tracks = tracksInput.nextInt();
				
				System.out.print("Year published: ");
				String year = yearInput.next();
				
				Boolean addResult = false;
				
				try {
					addResult = album.addTitle(name, tracks, year);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				if ( addResult )
					System.out.println("Album successfully added to database.");
				else
					System.out.println("Error adding album!");
				
				break;
			
				
			case 3:
				
				System.out.print("Enter record id: ");
				int id = menuInput.nextInt(); 
				
				try {
					
					String[] albumRecord = album.getTitleById(id);
					String[] updateData = new String[3];

					if ( albumRecord != null ) {
						
						System.out.print("Album name: ");
						String albumName = titleInput.nextLine();
						updateData[0] = albumName.isEmpty() ? albumRecord[0] : albumName;
						
						System.out.print("Total tracks: ");
						String totalTracks = tracksInput.nextLine();
						updateData[1] = totalTracks.isEmpty() ? albumRecord[1] : totalTracks;
						
						System.out.print("Year published: ");
						String publishedYear = yearInput.nextLine();
						updateData[2] = publishedYear.isEmpty() ? albumRecord[2] : publishedYear;
						
						if ( album.editRecord(id, updateData) )
							System.out.println("Album successfully updated");
						else
							System.out.println("Album update failed!");
						
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				break;
				
			case 4:
				  System.out.println("Enter id for Delete: ");
				  int deleteId = menuInput.nextInt();
				  
			try {
				if( album.deleteRecord(deleteId) ){
					System.out.println( "Record successfully deleted...");
				}
				else
					System.out.println("Error deleting record");
				
				break;
			} 
			
			catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			default:
				System.out.println("please select an option");
				break;

	
		}
		
		System.out.println("----------->");
		System.out.print("Enter 5 to Exit or 6 to Continue: ");

		if (5 == input.nextInt()) {
			System.out.println("Byee :-)");
			
			try {
				album.cleanUp();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			//input.close();
			
			System.exit(0);	
		}
		else
			menu();
	}
	
}