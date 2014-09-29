package biswajeet;

public class ClassPractice {

	public static void main(String[] args) {
		
		Person rinku = new Person("Male", 5);
		
		System.out.println( rinku.speak("rinku") );
		
		rinku.setEducation("B.E C.Sc");
		
		System.out.println( rinku.getEducation() );
		
		
		Person.getGender();
		
	}

}
