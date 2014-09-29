package biswajeet;

public class ExceptIonTest {
	
	public void divide(int a, int b) throws ArithmeticException {
		
		if (b == 0) {
			throw new ArithmeticException("Error: divide by zero");
		}
		
		int result = a/b;
		System.out.println("Result: " + result);
		
	}
	
}
