package zadaci_22_01_2016;

import java.util.InputMismatchException;

public class Milis {

	public static String convertMillis(long millis) {
		java.util.Scanner inout = new java.util.Scanner(System.in);
		// checks if number is bigger than zero
		if (millis <= 0) {
			System.out.println("Enter a bigger number");
			millis = inout.nextLong();
		}

		// initializes string
		String milis = "";
		// calculates seconds
		long sec = (millis / 1000);
		// minutes
		long min = sec / 60;
		sec %= 60;
		// hours
		long h = min / 60;
		min %= 60;
		h %= 24;
		// days
		long d = millis / (1000 * 60 * 60 * 24);
		
		// closes scanner
		inout.close();
		// if days are calculated
		if (d > 0) {
			// returns string with days
			return milis = d + " day/s " + h + ":" + min + ":" + sec;
			// if there is non days
		} else {
			// returns string without days
			return milis = h + ":" + min + ":" + sec;

		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// message for user
			System.out.println("Enter number of milliseconds: ");
			long millis = input.nextLong();
			// displays time
			System.out.println("That number of milliseconds is:\n" + convertMillis(millis));
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input!");
			main(args);
		}
		input.close();
	}

}
