package zadaci_21_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class DaysInMonth {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// message for user
			System.out.println("Enter a month and a year:");
			int month = input.nextInt() - 1;
			int year = input.nextInt();
			// array list for storing names of the month
			ArrayList<String> monthName = new ArrayList<>();
			// adds the months to list
			monthName.add("January");
			monthName.add("February");
			monthName.add("March");
			monthName.add("April");
			monthName.add("May");
			monthName.add("June");
			monthName.add("July");
			monthName.add("August");
			monthName.add("September");
			monthName.add("October");
			monthName.add("November");
			monthName.add("December");

			// list for storing how many days each month has
			ArrayList<Integer> calDays = new ArrayList<>();
			calDays.add(31);
			calDays.add(28);
			calDays.add(31);
			calDays.add(30);
			calDays.add(31);
			calDays.add(30);
			calDays.add(31);
			calDays.add(31);
			calDays.add(30);
			calDays.add(31);
			calDays.add(30);
			calDays.add(31);

			// calculates if the year is leap year
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				// if it is adds 29th day to February
				calDays.remove(1);
				calDays.add(1, 29);
			}
			// displays how much days does the inputed month have
			System.out.println(monthName.get(month) + " " + year + " has: " + calDays.get(month) + " days");
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");

		}

	}
}
