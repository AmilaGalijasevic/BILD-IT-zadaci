package zadaci_24_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class DistinctElArrayList {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// new list
		ArrayList<E> list1 = new ArrayList<E>();
		// array for counting
		int[] count = new int[list.size()];
		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			for (j = 0; j < list.size(); j++) {
				// finds the same numbers
				if (list.get(i).equals(list.get(j))) {
					// counts them
					count[j]++;
				}
			}
			// adds to new list
			if (count[i] == 1) {
				list1.add(list.get(i));
			}
		}
		// returns new list
		return list1;

	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Enter 10 numbers to list ");
			ArrayList<Integer> list1 = new ArrayList<>();
			int count = 0;
			// adds inputed numbers to the list
			while (count < 10) {
				list1.add(input.nextInt());
				count++;
			}
			// prints the list
			System.out.println(removeDuplicates(list1).toString());
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
