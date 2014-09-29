package ni;
import java.util.HashMap;


public class SentenceParser {
	
	private String gpsId[] = {"$GPGLL", "$GPGGA", "$GPRMC"};
	private HashMap<String, String[]> gpsField;
	
	public int totalItemParse = 0;
	
	SentenceParser() {

		gpsField = new HashMap<>();
		
		//$GPGLL,2730.7202,S,15255.8472,E,234837.52,A*74
		String[] gll = {"id", "latitude", "ns", "longitude", "ew", "utc", "status", "checksum"};
		gpsField.put("$GPGLL", gll);
		
		//$GPGGA,234837.52,2730.7202,S,15255.8472,E,1,03,3.1,0.0,M,,M,,*6E
		String[] gga = {"id", "utc", "latitude", "ns", "longitude", "ew", 
				"position fix", "satellites used", "hdop", "altitude", 
				"altitude units", "geoid seperation", "seperation units", 
				"dgps time", "dgps station id", "checksum"};
		gpsField.put("$GPGGA", gga);
		
		//$GPRMC,234837.52,A,2730.7202,S,15255.8472,E,0.0,56.7,130106,,,A*72
		String[] rmc = {"id", "utc", "status", "latitude", "ns", "longitude", "ew", 
				"speed over ground", "course over ground", "utc date", 
				"magnetic variation", "magnetic variation", "checksum"};
		gpsField.put("$GPRMC", rmc);
		
		
				
	}
	
	
	public Boolean displayFieldData(String gpsDataString) {
		
		String fieldValue;
		String[] fields;
		
		String[] parseFiles = gpsDataString.split(",");		
		
		String id = parseFiles[0];
		
		Boolean match = false;
		for (int x=0; x<3; x++) {

			if ( gpsId[x].equals(id) ) {
				match = true;
				break;
			}
			else {
				match = false;
			}
			
		}
		
		if (!match) return false;
		
		System.out.println("--------"+ id +" Parsing Start---------\n");
		
		//get all fields.
		fields = gpsField.get(id);
		int cfl = fields.length;
		
		
		for (int i=1; i<parseFiles.length; i++) {
			
			fieldValue = parseFiles[i];
			
			if ( i == (parseFiles.length-1) ) {
				
				//get last field
				String[] lastFieldValue = fieldValue.split("\\*");
				
				int j = cfl-2;
				for (int fl=0; fl<2; fl++) { 
					
					if ( !lastFieldValue[fl].isEmpty() ) {
						System.out.println( fields[j] +": "+ lastFieldValue[fl] );
					}
					j++;
					
				}
				
			}
			else {
				System.out.println( fields[i] + ": " + fieldValue );
			}
			
			
		}
		
		System.out.println("--------"+ id +" Parsing End---------\n");
		
		totalItemParse++;
		return true;
		
	}
	
	
}
