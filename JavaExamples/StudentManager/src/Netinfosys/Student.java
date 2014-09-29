package Netinfosys;

import java.io.Serializable;
import java.util.HashMap;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HashMap<String, String[]> dataStore;
	
	public Student() {
		dataStore = new HashMap<>();
	}

	public boolean setData(String index, String[] studentInfo) {
			
		String[] info = {studentInfo[0], studentInfo[1]};
		
		dataStore.put(index, info);
		
		return dataStore.containsKey(index) ? true : false;
	}
	
	public String[] getData(String index) {
		String[] studentInfo = null;
		index = index.toLowerCase();
		
		if ( dataStore.containsKey(index) ) {
			studentInfo = new String[2];
			studentInfo = dataStore.get(index);
		}
		
		return studentInfo;
	}	
	
	public HashMap<String, String[]> getAllData() {
		return dataStore;
	}
	
	
}
