import java.util.Arrays;


public class BasicDataType {

	
	public static void main(String[] args) {
		
//		System.out.println( "The sum of x & y from result method: " + result(5,5) );
		
//		float a = 10.5f;
//		double b = 25.1235874d;
		
//		System.out.println( greet("Pinku!") );
		
		
		//arrays
//		int[] ar = {5,10,15,20};
		
//		int arrayLength = ar.length;
//		System.out.println( "The array length: " + arrayLength );
//		
//		int elemAtPos = 4;
//		
//		if ( elemAtPos < ar.length )
//			System.out.println( "The array elem in pos 4: " + ar[elemAtPos] );
//		else
//			System.out.println("Element is not available at pos: " + elemAtPos);
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println("The elem in pos: " + i + " is " + ar[i]);
//		}
		
		
//		
//		//System.out.println( Arrays.toString(ar) );
//		
		
		
				
		String[] strAr = {"red", "blue", "green"};
		
		
		System.out.println( Arrays.toString(strAr));
		
		for (int i = 0; i < strAr.length; i++) {
			
			if ( strAr[i] == "green" ) strAr[i] = "yellow";
			
		}
	
		
		System.out.println( Arrays.toString(strAr) );
		
		
	}
	
	
	public static int result(int x, int y) {
		
		int result = 0;
		
		result = x + y;
		
		
		return result;
		
	}
	
	
	public static String greet(String text) {
		
		String message = "Hello from " + text;
		
		return message;
		
	}
	

}
