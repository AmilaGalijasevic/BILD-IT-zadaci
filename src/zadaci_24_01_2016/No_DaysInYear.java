package zadaci_24_01_2016;

import java.util.ArrayList;

public class No_DaysInYear {

	public static int numberOfDayInAYear(int year) {
		int numberOfDays = 0;
		// list for storing how many days each month has
		ArrayList<Integer> monthDays = new ArrayList<>();
		monthDays.add(31);
		monthDays.add(28);
		monthDays.add(31);
		monthDays.add(30);
		monthDays.add(31);
		monthDays.add(30);
		monthDays.add(31);
		monthDays.add(31);
		monthDays.add(30);
		monthDays.add(31);
		monthDays.add(30);
		monthDays.add(31);

		// calculates if the year is leap year
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			// if it is adds 29th day to February
			monthDays.remove(1);
			monthDays.add(1, 29);
		}
		// calculates how many days a year has
		for (int i = 0; i < monthDays.size(); i++) {
			// sums the days
			numberOfDays += monthDays.get(i);
		}
		// returns the number of days
		return numberOfDays;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// message for users
			System.out.println("Enter start year and end year");
			int year1 = input.nextInt();
			int year2 = input.nextInt();
			//if input is smaller than zero
			while (year1 < 0 || year2 < 0) {
				System.out.println("Wrong input, try again");
				year1 = input.nextInt();
				year2 = input.nextInt();
			}
			//if second inputed year is smaller than first
			int temp = 0;
			if (year1 > year2) {
				//changes their position
				temp = year2;
				year2 = year1;
				year1 = temp;
				System.out.println();
			}
			// loop wit start year and end year
			for (int i = year1; i <= year2; i++) {
				// displays the number of days by calling a method
				System.out.println("Year " + i + " has " + numberOfDayInAYear(i) + " days.");

			}
		} catch (Exception ey) {
			System.out.println("Something went wrong, try again: ");
			main(args);
		}

		input.close();
	}

}
