import java.util.Scanner;


public class Misc {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		
		System.out.println("Enter choice -\n\r 0: fruit query \n\r 1: color query");
		int choice = input.nextInt();
		
		
		String arg = "";
		boolean userChoice = true;
		
		
		if ( choice == 0 ) {
			userChoice = true;
			
			System.out.println("Enter fruit");
			arg = input.next();
		}	
		
		if ( choice == 1 ) {
			userChoice = false;
			
			System.out.println("Enter color");
			arg = input.next();
			
		}
		
		//System.out.println( "arg: "+arg + " option: "+userChoice  );
		
		String r = fruitStore(arg, userChoice);
		
		System.out.println("The query for " + arg + " is " + r );
			
		
	}
	
	

	public static String fruitStore(String arg, boolean fruit) {
		
		String result = "match not found";
		
		/*
		String[][] fs = new String[4][4];
		
		fs[0][0] = "apple";
		fs[0][1] = "red";
		
		fs[1][0] = "banana";
		fs[1][1] = "yellow";
		
		fs[2][0] = "grapes";
		fs[2][1] = "green";
		
		fs[3][0] = "pinaple";
		fs[3][1] = "pink";
		*/
		
		String[][] fs = { 
				{"apple", "red"}, 
				{"banana", "yellow"}, 
				{"grapes", "green"},
				{"pinaple", "pink"}
		};
		
		
		for ( String[] fruitColor : fs ) {
			
			String f = fruitColor[0];
			String c = fruitColor[1];
			
			//fruit
			if (fruit) {
				
				if ( f.equals( arg.toLowerCase() ) ) {
					result = c;
					break;
				}
					
				
			}
			
			//color
			else {
				
				if ( c.equals( arg.toLowerCase() ) ) {
					result = f;
					break;
				}

			}
			
		}
		
		
		
		return result;
		
	}
	

}
