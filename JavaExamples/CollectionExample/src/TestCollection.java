import java.util.Scanner;


public class TestCollection {

	public static void main(String[] args) {
		
		//MyList list = new MyList();
		//list.listExample();
		
		MyHashMap map = new MyHashMap();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter color: ");
		
		String c = input.next();
		
		System.out.println( map.getFruit(c) );
		
		input.close();
		
	}

}
