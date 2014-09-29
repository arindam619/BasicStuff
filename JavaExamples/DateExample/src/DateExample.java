import java.text.SimpleDateFormat;
import java.util.Date;


public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-YYYY ; h:m:s a");
		
		System.out.println( df.format(date) );
		
	}

}
