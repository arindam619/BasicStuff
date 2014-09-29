package basic;

public class conditionalExample {
	
	public void testCondition() {
		
		String value = "JAN";
		
		/*
		if (value==1)
		{
			System.out.println("result is :" + value);
		}
		else if (value==2)
		{
			System.out.println("result is :" + value);
		}
		else
		{
			System.out.println("result is :" + value);
		}
		*/

		switch (value) {
		
			case "JAN":
				System.out.println("result is :" + value);
				break;
			
			case "FEB":
				System.out.println("result is :" + value);
				break;
		
			case "MARCH":
				System.out.println("result is :" + value);
				break;
	
			default:
				System.out.println("result is :" + value);
				break;
				
		}
		
	}
	
	
}
