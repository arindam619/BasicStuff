package biswajeet;

public class WatchOveriding {

	public static void main(String[] args) {
		B b = new B();
		
		b.display();
	}

}


class A {
	
	public void display() {
		
		System.out.println("Displaying...");
		
	}
	
}


class B extends A {

	
	@Override
	public void display() {
		
		System.out.println("----------------");
		super.display();
		System.out.println("----------------");
		
	}
	
	
	
	
	
}