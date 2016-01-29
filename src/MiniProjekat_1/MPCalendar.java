package MiniProjekat_1;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MPCalendar {

	public static void main(String[] args) throws FileNotFoundException {
		String name = "";
		// Calls method
		Calendar(name);

	}

	public static void options(String name) throws FileNotFoundException {
		// popravila sam par stvari..
		// sad je nabacano na sve strane, ali radi...  :)
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Integer> Monthdays = new ArrayList<>();
		Monthdays.add(31);
		Monthdays.add(28);
		Monthdays.add(31);
		Monthdays.add(30);
		Monthdays.add(31);
		Monthdays.add(30);
		Monthdays.add(31);
		Monthdays.add(31);
		Monthdays.add(30);
		Monthdays.add(31);
		Monthdays.add(30);
		Monthdays.add(31);
		int year = 0;
		// calculates if the current year is leap year
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			// if it is removes index representing days of the month for
			// February
			Monthdays.remove(1);
			// add 29 numbers instead
			Monthdays.add(1, 29);
		}
		// offers options to user
		System.out.println("Choose:");
		System.out.println("1 for adding remander");
		System.out.println("2 for viewing remanders");
		System.out.println("3 for back to calender");
		System.out.println("4 for exit");
		int choose = input.nextInt();
		// calls the right method depending on the choice
		if (choose == 1) {
			name = ".txt";
			System.out.println("Enter year");
			year = input.nextInt();
			System.out.println("Enter a month");
			int month = input.nextInt();
			// if input is bigger than 12
			while (month > 12 || month < 0) {
				System.out.println("Wrong number, try again:");
				month = input.nextInt();
			}
			System.out.println("Enter a date: ");
			int date = input.nextInt();

			// if input is bigger than days in particular month
			for (int i = 0; i < Monthdays.size(); i++) {

				while (date > Monthdays.get(month - 1) || (date < 0)) {
					System.out.println("Number too big, try again:");
					date = input.nextInt();
				}
			}

			name = date + "." + month + "." + year + "" + name;
			// calls method for adding reminders
			addReminder(name);
		}
		if (choose == 2) {
			// calls method for viewing
			viewReminder(name);
		}
		// prints calendar
		if (choose == 3) {
			Calendar(name);
		}
		// exists the program
		if (choose == 4) {
			System.out.println("Goodbye");
			System.exit(1);
		}

	}

	public static void addReminder(String name) throws FileNotFoundException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.io.File file = new java.io.File(name);
		// Initializes String
		String reminder1 = "";
		try {
			// scans the file
			Scanner scanner = new Scanner(file);
			// if file already contains reminders
			if (scanner.hasNextLine()) {

				while (scanner.hasNext()) {
					// reminder1 becomes scanned text in file
					reminder1 = scanner.nextLine();
				}
				scanner.close();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("...");

		}
		try {

			java.io.PrintWriter output = new java.io.PrintWriter(file);

			System.out.println("Enter reminder");
			String reminder = input.nextLine();
			// prints reminders in file
			output.println(reminder1 + "; " + reminder);
			System.out.println("Reminder added");
			output.close();
			// if it can't find file
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		// calls method
		options(name);

	}

	public static void viewReminder(String name) throws FileNotFoundException {
		java.util.Scanner inp = new java.util.Scanner(System.in);
		name = ".txt";
		System.out.println("Enter a date for which you would like to see reminder");
		int date = inp.nextInt();
		// if input is bigger than 31
		if (date > 31) {
			System.out.println("Number too big, try again:");
			date = inp.nextInt() - 1;
		}
		System.out.println("Enter month");
		int month = inp.nextInt();
		// if input is bigger than 12
		if (month > 12) {
			System.out.println("Number too big, try again:");
			month = inp.nextInt() - 1;
		}
		System.out.println("Enter year");
		int year = inp.nextInt();
		name = date + "." + month + "." + year + "" + name;
		java.io.File file = new java.io.File(name);

		try {
			// reads reminders
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String reminder = input.nextLine();

				System.out.println("Reminder: " + reminder);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("No reminders for that date");
		}
		// calls method
		options(name);
		inp.close();

	}

	public static void Calendar(String name) throws FileNotFoundException {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// declaring variables
		try {

			System.out.println("Enter the year: ");
			int year = input.nextInt();
			System.out.println("Enter month: ");
			int month = input.nextInt() - 1;
			// if input is bigger than 12
			while (month >= 12 || month < 0) {
				System.out.println("Wrong number, try again:");
				month = input.nextInt() - 1;
			}
			int days = 1;
			// for spacing between the dates
			String space = "     ";
			// array list for storing names of the month
			ArrayList<String> months = new ArrayList<>();
			// adds the months to list
			months.add("January");
			months.add("February");
			months.add("March");
			months.add("April");
			months.add("May");
			months.add("June");
			months.add("July");
			months.add("August");
			months.add("September");
			months.add("October");
			months.add("November");
			months.add("December");

			// list for storing how many days each month has
			ArrayList<Integer> Monthdays = new ArrayList<>();
			Monthdays.add(31);
			Monthdays.add(28);
			Monthdays.add(31);
			Monthdays.add(30);
			Monthdays.add(31);
			Monthdays.add(30);
			Monthdays.add(31);
			Monthdays.add(31);
			Monthdays.add(30);
			Monthdays.add(31);
			Monthdays.add(30);
			Monthdays.add(31);

			// gets month
			Calendar cal = new GregorianCalendar(year, month, 1);

			// following calculates if the current year is leap year
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				// if it is removes index representing days of the mont for
				// feburary
				Monthdays.remove(1);
				// add 29 numbers instead
				Monthdays.add(1, 29);
			}
			// prints the beginning of calendar
			System.out.println("Year:" + space + year + space + "Month:" + space + months.get(month));
			System.out.println("_______________________________________");
			System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat");
			System.out.println("_______________________________________");

			// finds first day of the month
			for (int i = 1; i <= Monthdays.get(month); i++) {
				if (i > 9) {
					// print spaces
					space = "    ";
				}
				// prints spaces till the day the first of the month
				if (i == 1) {
					while (days != cal.get(Calendar.DAY_OF_WEEK)) {
						System.out.print(space + " ");
						// counts days of the week
						days++;
					}
					// prints the first day of the month
					System.out.print(i + space);
					days++;
				} else {

					// checks if it's the end of the row.
					if (days == 8) {

						// prints new line of days
						System.out.print("\n" + i + space);
						days = 2;

					} else {
						// prints rest of the dates
						System.out.print(i + space);

						days++;

					}

				}

			}

			// This puts some space after the calendar is printed.
			System.out.println("\n");
			options(name);
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
	}

}
