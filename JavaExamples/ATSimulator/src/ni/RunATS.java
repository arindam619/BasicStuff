package ni;

import javax.swing.SwingUtilities;


public class RunATS {
	
	private static final ATSimulate ats = new ATSimulate();

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 ats.createAndShowGui();
	         }
	      });

	}

}
