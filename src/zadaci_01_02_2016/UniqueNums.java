package zadaci_01_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class UniqueNums {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		try {

			System.out.println("Enter 10 numbers:");
			// adds numbers to list
			for (int i = 0; i < 10; i++) {
				int num = input.nextInt();
				nums.add(num);
			}
			// counters
			int counter = 0;
			int count = 0;
			// searches for max value in list
			int max = Collections.max(nums);
			for (int i = 0; i <= max; i++) {
				// counts frequencies of numbers in list
				counter = Collections.frequency(nums, i);
				// if number is unique or repeats once
				if (counter == 1 || counter >= 1) {
					// prints them and counts them
					System.out.print(i + " ");
					count++;
				}
			}
			input.close();
			System.out.println("\nNumber of unique numbers is: " + count);
			// catches input exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
	}

}
