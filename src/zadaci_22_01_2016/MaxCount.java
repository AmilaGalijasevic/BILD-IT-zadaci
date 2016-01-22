package zadaci_22_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class MaxCount {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing numbers
		ArrayList<Integer> numbers = new ArrayList<>();

		try {
			System.out.println("Enter numbers, when finished press 0");
			// counter
			int count = 0;

			int num = input.nextInt();
			// while input isn't 0 adds numbers to list
			while (num != 0) {
				numbers.add(num);
				num = input.nextInt();
			}
			// if list isn't empty
			if (!numbers.isEmpty()) {

				int max = 0;
				// sorts the list and finds max value
				for (int i = 0; i < numbers.size(); i++) {
					Collections.max(numbers);
					max = Collections.max(numbers);
				}
				// counts how many times was max number repeated
				for (int i = 0; i < numbers.size(); i++) {
					if (numbers.get(i).intValue() == max) {
						count++;
					}
				}
				// displays the number and his counter
				System.out.println("Max number of the list is " + max + ", it's repeated " + count + " time/s.");
			}
			// if list is empty
			else {
				System.out.println("List is empty.");
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again");
			main(args);
		}

	}

}
