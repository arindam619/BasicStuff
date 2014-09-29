package biswajeet;

public class Calculator extends Calc {
	
	public int x;
	public int y;
	
	Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int sum() {
		int sum = 0;
		sum = x+y;
		
		return sum;
	}
	
	public int sub() {
		int sub = 0;
		sub = x - y;
		
		return sub;
	}
	
	public int multiply() {
		int multiply = 0;
		multiply = x * y;
		
		return multiply;
	}
	

}
