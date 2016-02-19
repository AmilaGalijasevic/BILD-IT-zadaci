package zadaci_17_02_2016;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BabyNames {

	public static void main(String[] args) {
		java.util.Scanner inp = new java.util.Scanner(System.in);
		// lists for storing
		ArrayList<String> babynames = new ArrayList<>();
		ArrayList<String> g = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();

		try {
			// user inputs
			System.out.println("Enter the year between 2010 and 2014:");
			String year = inp.nextLine();
			System.out.println("Enter the gender:");
			String gender = inp.next();
			System.out.println("Enter the name");
			String name = inp.next();
			String line = "";
			String names = "";

			// creates a File instance
			java.io.File file = new java.io.File("babynameranking" + year + ".txt");
			// scans file
			Scanner input = new Scanner(file);
			// Stores the names gender and number
			while (input.hasNext()) {
				names = input.next();
				gender = input.next();
				line = input.next();
				babynames.add(names);
				g.add(gender);
				number.add(line);
			}
			System.out.println("Total of that baby names in " + year + " is:");
			for (int i = 0; i < babynames.size(); i++) {
				// checks if file contains the inputed name
				if (babynames.get(i).contains(name)) {
					if (babynames.get(i).equals(name)) {
						// prints the name and number of babies with that name
						// in that year
						System.out.println(babynames.get(i) + ": " + number.get(i));
						break;
					} else {
						System.out.println("Can't find in file");
						break;
					}
				}
			}
			input.close();
			inp.close();
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		} catch (NoSuchElementException e) {
			System.out.println("No such element");
		}
	}
}
