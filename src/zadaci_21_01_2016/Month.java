package zadaci_21_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Month {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a year and first 3 letters of the wanted month(First letter must be uppercase):");
			int year = input.nextInt();
			String months = input.next();
			int month = 13;

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
				// if it is removes value of index 1(28), replaces it with 29
				calDays.remove(1);
				calDays.add(1, 29);
			}
			// checks if first letter is upper case
			while (!Character.isUpperCase(months.charAt(0))) {
				System.out.println("First letter must be upper case, try again:");
				months = input.next();

			}
			// checks if input and month from the list have the same first 3
			// letters
			for (int i = 0; i < monthName.size(); i++) {
				if (months.substring(0, 3).equals(monthName.get(i).substring(0, 3))) {
					// when they're found month becomes the index of that value
					month = i;
				}

			}
			// displays the days
			System.out.println(
					monthName.get(month).substring(0, 3) + " " + year + " has " + calDays.get(month) + " days");
			// catches exceptions
		} catch (InputMismatchException e) {
			System.out.println("Wrong input, only numbers allowed ");
			main(args);
		} catch (IndexOutOfBoundsException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
		input.close();
	}

}
