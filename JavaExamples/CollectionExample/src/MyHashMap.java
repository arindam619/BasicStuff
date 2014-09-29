import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MyHashMap {
	
	private HashMap<String, String> fruit;
	
	
	public MyHashMap() {
		
		fruit = new HashMap<>();
		
		fruit.put("apple", "red");
		fruit.put("banana", "yellow");
		fruit.put("grapse", "green");
	
	}

	
	public void runMyMap() {

		/*
		if ( fruit.isEmpty() )
			System.out.println("fruit is empty");
		else
			System.out.println("fruit is not empty");
		*/
		
		
		//System.out.println( "The color of banana: "+ fruit.get("banana") );
		
		
		//System.out.println( "size: " + fruit.size() );
		
		Set<String> key = fruit.keySet();
		
		Iterator<String> iterator = key.iterator();
		
		String fruitName;
		while (iterator.hasNext()) {
			fruitName = (String) iterator.next();
			System.out.println( fruitName + " : " + fruit.get(fruitName) );
			
		}
		
		
		
	}
	
	
	public String getFruit(String color) {
		
		String resultFruit = "Fruit not found";

		if ( fruit.containsValue(color) ) {
			
			Set<String> key = fruit.keySet();
			
			Iterator<String> iterator = key.iterator();
			
			String fruitName;
			while (iterator.hasNext()) {
				fruitName = (String) iterator.next();
				if ( fruit.get(fruitName).equals(color) ) {
					resultFruit = fruitName; 
				}
				
			}
			
		}
		
		return resultFruit;
		
	}
	
	
}
