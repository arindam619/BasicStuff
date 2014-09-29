package biswajeet;

public class Person {
	
	//constant
	public static final String PERSON_REV = "1.0 beta";
	
	public String gender;
	public int height;
	private String education;
	
	
	Person(String gender, int height) {
		
		this.gender = gender;
		this.height = height;
		
	}
	
	
	public String speak(String message) {
		
		message = "Hellow from " + message; 
		
		return message;
		
	}
	
	
	public String getEducation() {
		return education;
	}

	
	public void setEducation(String education) {
		this.education = education;
	}
	
	
	public static void getGender() {
		System.out.println("dummy gender");
	}
	
}
