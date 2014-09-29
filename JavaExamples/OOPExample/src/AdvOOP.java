
public class AdvOOP {
	
	
	//inner class
	class Inner {
		
		public void sayHello() {
			System.out.println("Hello world from inner class");
		}
		
	}
	
	
	public void callInner() {
		
		Inner a = new Inner();
		a.sayHello();
		
	}
	
	
	public void localExample() {
		
		//local class
		class Local {
			
			public void sayHello() {
				System.out.println("Hello world from local class");
			}
			
		};
		
		Local b = new Local();
		b.sayHello();
		
		
	}
	

}
