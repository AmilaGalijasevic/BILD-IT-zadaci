package zadaci_25_01_2016;

import java.util.InputMismatchException;

public class No_Minutes {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			//
			System.out.println("Enter number of minutes:");
			long min = input.nextLong();
			// calculates hours
			long h = min / 60;
			// minutes
			min %= 60;
			// days
			long d = h / 24;
			h %= 24;
			// year
			long y = d / 365;
			d %= 365;
			// prints years and days
			System.out.println("Inputed number of minutes is: " + y + " years, " + d + " days");

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input. Try again:");
			main(args);
		}
		input.close();
	}

}
