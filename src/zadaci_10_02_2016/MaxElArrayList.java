package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class MaxElArrayList {
	public static Integer listSize(ArrayList<Integer> list) {
		// if the list is empty returns null
		if (list.isEmpty()) {
			return null;
		}
		else{
		// finds max element using collections
		int max = Collections.max(list);
		return max;
	}
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing numbers
		ArrayList<Integer> numbers = new ArrayList<>();

		try {
			System.out.println("Enter numbers, when finished press 0");
			int num = input.nextInt();
			// while input isn't 0 adds numbers to list
			while (num != 0) {
				numbers.add(num);
				num = input.nextInt();
			}
			// prints max value
			System.out.println("Max value: " + listSize(numbers));
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input:");
			main(args);
		}
	}
}
