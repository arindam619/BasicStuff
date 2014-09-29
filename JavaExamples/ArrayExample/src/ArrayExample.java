import java.awt.Frame;
import java.util.Arrays;


public class ArrayExample {

	//public static void main(String[] args) {
		
		//int a[] = {5,10,15,20,25};
		
//		a[0] = 50;
//		System.out.println("elements of the array are:");
//		for(int i=0;i<5;i++)
//		{
//			
//			System.out.println(+ a[i]);
//		    
//		}
		//System.out.println("Elem at pos 0: " + a[0] );		
		
		//System.out.println( Arrays.toString(a) );
		
         /*
		int x[] = new int[5];
		
		
		int lenghtX = x.length;
		
		int i;
		for (i=0; i<lenghtX; i++) {
			
			x[i] = (i+10);
			
		}
		*/
		//System.out.println("The value of i: " + i);
		
		
		
		
		/*
		for (int j=0; j<lenghtX; j++) {
			
			System.out.println( "The elem at pos: " + (j+1) + " is " + x[j] );
			
		}
		*/
		
		//System.out.println();
		
		//char ch[] = {'h','e','l','l','o'};
		
		
		/*
		for(int k=0; k<ch.length;k++)
		{
			System.out.print(ch[k]);
		}
		
		
		//System.out.println( Arrays.toString(x) );
		
		//enhance for loop
		for (int v : x) {
			System.out.println("v: " + v);
		}
		*/
		/*
		int i,j;
		int a[] = new int[6];
		
		int length= a.length;
		
		for (i=0; i<length; i++) {
			a[i] = 5*(i+2);
			
		}
		System.out.println( Arrays.toString(a) );
		
		//print in reverse order
		for ( j=(length-1); j>=0; j--) {
			System.out.println("the elements in the reverse order with their position: " +
					j + " is " + a[j]);
		}
		*/
		
		//fruitStore();
		
	//}
	
	
	public static void fruitStore() {
		
		
		String[][] fs = {
				{"apple", "red"},
				{"banana", "yellow"},
				{"grapse", "green"},
				{"mango", "yellowish green"}
		};
		
		String output = "";
		
		for (int i=0; i<fs.length; i++) {
			
			String[] fruitArray = fs[i];
			//System.out.println("the fruit: "+fruitArray[0] + " color is " +fruitArray[1]);
			
			for (int j=0; j<fruitArray.length; j++) {
				
				//fruit
				if (j==0)
					output += "Fruit: " + fruitArray[j];
					
				//color
				else
					output += " Color: " + fruitArray[j];
			}
			
			output += "\n";
			
		}
		
		System.out.println(output);
		
	}
	

}
