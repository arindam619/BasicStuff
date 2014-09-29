package oopexample;

public class MyTools implements MyInterface {

	@Override
	public int mySum(int x, int y) {
		return (x+y);
	}

	@Override
	public int div(int x, int y) {
		return (x/y);
	}

}
