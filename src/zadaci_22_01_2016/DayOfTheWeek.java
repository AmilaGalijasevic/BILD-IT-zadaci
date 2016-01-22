package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class DayOfTheWeek {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// messages for users
			System.out.println("Enter todays day (numbers 0-6):");
			int day = input.nextInt();
			System.out.println("Enter future day of the week");
			int futureDay = input.nextInt();
			// list with days of the week
			ArrayList<String> days = new ArrayList<>();
			days.add("Monday");
			days.add("Tuesday");
			days.add("Wednesday");
			days.add("Thursday");
			days.add("Friday");
			days.add("Sathurday");
			days.add("Sunday");
			// initializes the string
			String future = "";
			// calculates day of the week
			int weekDay = (day + futureDay) % 7;
			// finds the right day
			for (int i = 0; i < days.size(); i++) {
				future = days.get(weekDay);

			}
			// displays it
			System.out.println("Today is " + days.get(day) + ", in " + futureDay + " days it will be " + future);

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input. Try again.");
			main(args);
		}
		input.close();
	}
}
