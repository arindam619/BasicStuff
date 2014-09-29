package Netinfosys;

import java.util.HashMap;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		
		String value;
		HashMap<String, String> map = new HashMap<>();
		
		map.put("a1", "value 1");
		map.put("a2", "value 2");
		map.put("a3", "value 3");
		
		
		Iterator<String> iterator = map.keySet().iterator();
		
		while ( iterator.hasNext() ) {
			value = map.get( iterator.next() );
			System.out.println( value );
		}
		
		map.put("a4", "value 4");
		
		if ( !map.containsKey("a4") ) {
			System.out.println("a4 is not available");
		}
		else
			System.out.println( map.get("a4") );
		
	}

}
