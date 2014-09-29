import java.util.Scanner;


public class GetInputs {

	public static void main(String[] args) {
		
		Scanner nameInput, ageInput, destInput;
		
		nameInput = new Scanner( System.in );
		ageInput = new Scanner( System.in );
		destInput = new Scanner( System.in );
		
		System.out.print("Enter you name: ");
		String name = nameInput.nextLine();
		
		System.out.println("Your name is: " + name);
		
		System.out.print("\nEnter your age: ");
		int age = ageInput.nextInt();
		
		System.out.println("Hii "+ name + " you are " + age + " years old\n");
		
		System.out.print("Enter your destination: ");
		String destination = destInput.nextLine();
		
		System.out.println("Hii "+name+ " you are travelling to: "+destination);
		System.out.println("\nWe wish you a pleasant stay at " +destination+ " :)");
		
		nameInput.close();
		ageInput.close();
		destInput.close();
		
	}

}
