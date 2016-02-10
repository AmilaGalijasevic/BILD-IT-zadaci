package zadaci_10_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Shuffle {
	public static void shuffle(ArrayList<Integer> list) {
		// shuffles the list
		Collections.shuffle(list);
		// prints it
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).intValue() + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing numbers
		ArrayList<Integer> numbers = new ArrayList<>();

		try {
			System.out.println("Enter numbers, when finished press 0");
			int num = input.nextInt();
			// adds numbers to list till zero is entered
			while (num != 0) {
				numbers.add(num);
				num = input.nextInt();
			}
			// prints inputed numbers
			for (int i = 0; i < numbers.size(); i++) {
				System.out.print(numbers.get(i).intValue() + " ");
			}
			// calls the method for shuffling numbers
			System.out.println("\nShuffled list:");
			shuffle(numbers);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println();
		}
	}
}
