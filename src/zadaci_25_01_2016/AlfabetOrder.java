package zadaci_25_01_2016;

import java.util.Arrays;

public class AlfabetOrder {

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			// array for storing names
			String[] cities = new String[3];

			// message for users
			System.out.println("Enter names of three cities: ");
			for (int i = 0; i < cities.length; i++) {
				// stores them in upper case
				String s = input.nextLine().toUpperCase();
				// while input isn't a letter
				while (!Character.isLetter(s.charAt(i))) {
					System.out.println("Invalid input, try again:");
					s = input.nextLine().toUpperCase();
				}
				// ads them to array
				cities[i] = s;
			}
			// sorts them
			Arrays.sort(cities);
			// prints them
			for (int i = 0; i < cities.length; i++) {

				System.out.println(cities[i]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Try again:");
			main(args);
		}
	}

}
