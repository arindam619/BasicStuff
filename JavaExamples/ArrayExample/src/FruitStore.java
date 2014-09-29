
public class FruitStore {
	
	
	public static void main(String[] args) {
		
		String output = queryStore("orange", false);
		
		System.out.println( output );
		
	}

	
	public static String queryStore(String arg, boolean f) {
		
		// f ? fruit : color
		
		
		String result = null;
		
		String[][] fs = {
				{"apple", "red"},
				{"banana", "yellow"},
				{"grapse", "green"},
				{"mango", "yellowish green"}
		};
		
		
		for (int i=0; i<fs.length; i++) {
			
			//fruit
			if (f) {
				
				if ( fs[i][0].equals(arg) ) {
					
					result = "Match found - ";
					result += "The color of " + arg + " is " + fs[i][1];
					break;
					
				}
					
				
			}
			
			//color
			else {
				
					if ( fs[i][1].equals(arg) ) {
					
						result = "Match found - ";
						result += "The color with " + arg + " contains fruit "  + fs[i][0]; 
						break;
					
				}
				
			}
			
		}
		
		
		if (result == null)
			result = "No mathched!";
		
		return result;
		
	}
	
	
	
}
