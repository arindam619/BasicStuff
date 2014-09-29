package biswajeet;


public class WatchOverloading {

	public static void main(String[] args) {

		Sample sample = new Sample();
		
		sample.addNum(5,3);
		sample.addNum(5,3,2);
	}

}

class Sample {
	
	public void addNum(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public void addNum(int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
	public void addNum(int a, int b, int c, int d) {
		
		System.out.println(a+b+c+d);
		
	}

}