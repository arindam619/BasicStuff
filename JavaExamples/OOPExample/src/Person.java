
public class Person {
	
	public int hands = 2;
	public int legs = 2;
	
	public String name;
	
	
	public Person(String name) {
		this.name = name;
	}
	
	
	public void speak(String message) {
		System.out.println(message);
	}
	
	public void myName() {
		System.out.println("My name is " + name);
	}
	
	
}
