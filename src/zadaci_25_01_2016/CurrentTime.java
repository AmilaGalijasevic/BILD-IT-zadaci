package zadaci_25_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {

		//creates new date using System.currentTimeMillis() method
		Date date = new Date(System.currentTimeMillis());
		//class for formating date
		DateFormat dateFormat = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		//prints date
		System.out.println("Current date and time: "+dateFormat.format(date));
		   
	}

}
