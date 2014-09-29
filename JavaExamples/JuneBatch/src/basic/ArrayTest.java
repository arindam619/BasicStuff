package basic;

//import java.util.Arrays;

public class ArrayTest {

	
	public void arrayStudy() {
		
		
		//declare an array
		//int[] numElem;
		
		
		//array initialization
		//numElem = new int[5];
		
		
		//insert elem
	/*	
		numElem[0] = 5;
		numElem[1] = 10;
		numElem[2] = 15;
		numElem[3] = 20;
		numElem[4] = 25;
		
		
		System.out.println( Arrays.toString(numElem) );
		//System.out.println("size: " + numElem.length);
		
		//System.out.println("Elem at pos-2 is " + numElem[2]);
		
		/*
		for (int i=0; i<numElem.length; i++) {
			System.out.println( numElem[i] );
		}
		*/
		
		//System.out.println( numElem[5] );
		
		//String Elm[]= {"Black","Blue","Red"};
		
		
        
		String[] color = {"Black","Blue","Green"};
		
		/*
		for(int i=0;i<color.length;i++)
			System.out.println("elements " +(i+1) + " is" + color[i]);
		*/
		
		
	}
	
	
	//nested array
	public void nestedExample() {
		
		//[ [], [], [], ]
		
		String[][] fruit = {
			{"apple", "red"},
			{"banana", "yellow"},
			{"grapse", "green"},
			{"orange", "amber"}
		};
		
		
		for (int i=0; i<fruit.length; i++) {
			
			String[] fruitSet = fruit[i];
			
			System.out.println( fruitSet[0] +" : "+ fruitSet[1] );
			
		}
		
		
	}
	
	
}
