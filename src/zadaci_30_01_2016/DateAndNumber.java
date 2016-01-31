package zadaci_30_01_2016;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndNumber {
	public static String DateTime(String s) {
		// new date object
		Date date = new Date();
		// formats the date
		DateFormat dateFormat = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		// returns formated date and time
		return dateFormat.format(date);
	}

	public static void main(String[] args) {
		// Initializes the string
		String s = "";
		System.out.println("Current date and time: " + DateTime(s));

	}

}
