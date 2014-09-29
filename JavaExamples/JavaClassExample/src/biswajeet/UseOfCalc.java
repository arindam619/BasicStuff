package biswajeet;

public class UseOfCalc {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(15, 2);
		
		System.out.println( "sum: " + calculator.sum() );
		System.out.println( "sub: " + calculator.sub() );
		System.out.println( "multiply: " + calculator.multiply() );
		
	}

}
