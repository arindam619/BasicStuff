
public class StringExample {

	public static void main(String[] args) {
		
		char[] ch = {'H', 'e', 'l', 'l', 'o'};
		
		//System.out.println("length: " + ch.length);
		
		//String text = new String("Hello World");
		String text = new String(ch);
		
		System.out.println(text);
		
		//string compare
		if (text.equalsIgnoreCase("hello")) {
			System.out.println("matched");
		}
		else {
			System.out.println("No matched");
		}
		
		//String is immutable
		text = "Hello world";
		
		System.out.println( "length: " + text.length() );
		
		System.out.println("----------------");
		
		String fs = myStringFormater("Pinku", 30, 56789);
		
		fs += "\nThis is a new line...";
		
		//System.out.println(fs);
		
		//System.out.println( text.replace("world", "Das") );
		
		String ts = tu(2, "gau");
		System.out.println(ts);
	}
	
	
	public static String myStringFormater(String name, int age, int phone) {
		
		String greetings = null;
		
		greetings = "Hi %s !\n";
		greetings += "I am of age %d\n";
		greetings += "Call me @ %d";
		
		
		return greetings.format(greetings, name, age, phone);
		
		//System.out.printf(greetings, name, age, phone);
		
	}
	
	
		
	public static String tu(int roll, String add) {
		
		String ni = null;
		
		ni = "roll no. is %d !\n";
		ni += "add is %s";
		
		return ni.format(ni, roll, add);
	}
	
}