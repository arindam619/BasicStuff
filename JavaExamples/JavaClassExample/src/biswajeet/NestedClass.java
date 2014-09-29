package biswajeet;

public class NestedClass {
	
	public String message;
	public Inner inner;
	
	//inner class example
	class Inner {
		
		public String innerMessage;
		
		public Inner() {
			innerMessage = message + " from Inner Class";
		}
		
		public void greetInner() {
			System.out.println( innerMessage );
		}
		
	}
	
	
	public NestedClass(String message) {
		
		this.message = message;
		 inner  = new Inner();
	}
	
	
	public void callOuterGreet() {
		
		System.out.println(message + " from outer class");
		
	}
	
	
	public void callInnerGreet() {
		inner.greetInner();
	}
	
	
	public void lcExample() {
		
		//local class example
		class LocalClass {
			
			public void messgLocalClass() {
				System.out.println(message + " from local class");
			}
			
		}
		
		LocalClass lc = new LocalClass();
		lc.messgLocalClass();
		
	}
	
	
	public void anonymousClass() {
		
		//anonymous class example
		new Object() {
			
			public void out() {
				System.out.println(message + " from Anonymous class");
			}
			
		}.out();
		
	}
	
}
