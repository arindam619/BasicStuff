import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;


public class MyList {
	
	
	public void listExample() {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(10);
		list.add(15);
		
		System.out.println( list.size() );
		
		list.add(20);
		list.add(25);
		
		System.out.println( list.size() );
		
		list.add(35);
		
		//list.remove(0);
		//list.remove(0);
		
		System.out.println( list.size() );
		
		//convert to array
		Integer[] ar = list.toArray( new Integer[ list.size() ] );
		
		System.out.println( Arrays.toString(ar) );
		
		System.out.println("===========================");
		
		
		//loop ArrayList using iterator
		/*
		Iterator<Integer> iterator = list.iterator();
		
		while ( iterator.hasNext() ) {
			System.out.println( iterator.next() );
		}
		*/
		
		
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		while ( listIterator.hasNext() ) {
			System.out.println( listIterator.next() );
		}
		
		
		
	}
	
}
