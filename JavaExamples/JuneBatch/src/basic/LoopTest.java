package basic;

public class LoopTest {

	public void studyLoops() {
		
		
		//for loop
		/*
		for (int i=0; i<5; i++) {
			
			/*
			System.out.println("for loop running :" + (i+1));
			
			if (i==4) continue;
			
			System.out.println("statement 1");
			System.out.println("statement 2");
			System.out.println("statement 3");
			
			System.out.println("------------");
		
		}
		
		
		//while loop
		int wlc = 10;
		
		
		while (wlc < 5) {
			System.out.println( "while loop running :" + (wlc+1) );
			wlc++;
		}
		*/


		//do while loop
		/*
		do {
			System.out.println( "do while loop running :" + (wlc+1) );
			wlc++;
		} while (wlc < 5);
		*/
		
		
		//enhanced for loop
		//useful for data structure looping
		
		String[] color = {"Black","Blue","Green"};
		
		for (String c : color) {
			System.out.println(c);
		}
		
		
		
		
	}
	
}
