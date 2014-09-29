package biswajeet;

public class MiscTopic {
	
	
	

	public static void main(String[] args) {
		
		//int i = 225;
		
		/*
		Integer I = new Integer(i);
		
		//unboxing
		I += 5;

		System.out.println(I);
		
		
		String s = "100";
		
		
		int total = I + Integer.parseInt(s);
		
		System.out.println(total);
		
		
		//string builder
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append(" world");
		
		
		System.out.println( sb.insert(5, " from my") );
		*/
		
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * at biswajeet.MiscTopic.main(MiscTopic.java:36)
		 */
		
		
		/*
		try {
			
//			int result = i/0;			
//			System.out.println(result);
			
			int[] ar = {5,10,15};
			System.out.println( ar[3] );
			
			
		} catch (ArithmeticException e) {
			
			System.out.print("Error ocured: ");
			System.out.println( e.getMessage() );
			
			
		} catch (ArrayIndexOutOfBoundsException ae) {
			
			System.out.println( ae.getMessage() );
			System.out.println("elem not found");
			
		} finally {
			//always run block regardless of exception
		}
		*/
		
		/*
		ExceptIonTest myTest = new ExceptIonTest();
		
		try {
			myTest.divide(10, 0);			
		} catch (ArithmeticException e) {
			System.out.println( e.getMessage() );
			//e.printStackTrace();
		}
		
		
		System.out.println("running...");S
		
		NestedClass nestedClass = new NestedClass("Say hi");
		
		nestedClass.callOuterGreet();
		nestedClass.callInnerGreet();
		
		nestedClass.lcExample();
		
		nestedClass.anonymousClass();
		*/
		
		System.out.println( Month.JANUARY + " of value " + Month.JANUARY.getMonthValue() );
		
		
		
	}

}
