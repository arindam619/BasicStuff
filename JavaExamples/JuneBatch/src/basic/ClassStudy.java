package basic;

public class ClassStudy {

	//field/property
	private static String roomSize = "Medium";
	private String greetMessage;
	
	
	//constructor
	public ClassStudy(String greetMessage) {
		this.greetMessage = greetMessage;
	}
	
	
	//method/behaviour
	public void greetMe() {
		
		String messg = "Hi from ClassStudy ";
		messg += greetMessage;
		
		System.out.println(messg);
		
	}
	
	
}



