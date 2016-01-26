package zadaci_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class RepeatingNUmbers {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			// list for storing numbers
			ArrayList<Integer> numbers = new ArrayList<>();
			System.out.println("Enter numbers from 1 to 100, end with zero: ");
			int num = input.nextInt();
			// counter
			int count = 0;
			// while input isn't 0 adds numbers to the list
			while (num != 0) {
				// if input is > 100 and < 0
				while (num > 100 || num < 0) {
					System.out.println("Enter only numbers between 1 and 100:");
					num = input.nextInt();
				}
				numbers.add(num++);
				num = input.nextInt();
			}
			// if list is empty
			if (numbers.size() == 0) {
				System.out.println("No numbers in list");
			}
			// prints numbers between 1 and 100 that were repeated
			for (int i = 0; i < 100; i++) {
				// checks for frequencies
				count = Collections.frequency(numbers, i);
				if (count > 0) {
					System.out.println("Number " + i + " repeats " + count + " time/s");

				}

			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Only numbers, try again:");
		}
	}

}
