package oopexample;

public class InnerClassExample {
	
	//inner class        
	class Inner {
		
		public String innerProperty = "Inner class property";
		
		public void displayInnerProperty() {
			System.out.println(innerProperty);
		}
		
	}
	
	
	public void innerClassAccess() {
		new Inner().displayInnerProperty();
	}
	
	
}
