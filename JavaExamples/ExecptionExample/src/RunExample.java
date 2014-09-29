
public class RunExample {

	public static void main(String[] args) {
		
		
		//int a = 10, b = 0;
		
		//ArithmeticException
		//System.out.println("Result: " + a/b);
		
		
		int[] numPool = {5,10,15};
		//ArrayIndexOutOfBoundsException
		//System.out.println( numPool[3] );
		
		ExecptionExample ee = new ExecptionExample();
		
		try {
			
			int result = ee.getArrayElem(numPool, 3);
			System.out.println("Element is: " + result);
			
			//throw new ArrayIndexOutOfBoundsException("out of bound");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println( e.getMessage() );
		
		} finally {
			
			System.out.println("Finally block always run");
			
		}
		
		
		
		//String sn = "abc";
		
		//NumberFormatException
		//int sni = Integer.parseInt(sn);
		//System.out.println(sni);
		
		
		/*try {
			
			if (b<=0) throw new ArithmeticException("Not divisible by zero");
			
			else System.out.println("Result: " + a/b);
			
			
		} catch (ArithmeticException ae) {
			
			System.out.println( ae.getMessage() );
			
		} finally {
			
			System.out.println("Finally block always run");
			
		}
		*/
		System.out.println("Hello world");
		
		
		
	}

}
