package zadaci_24_02_2016;

import java.util.InputMismatchException;

public class GenericLinearSearch {
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		for (int i = 0; i < list.length; i++) {
			// compares the key to the numbers in the list
			if (key.compareTo(list[i]) == 0) {
				// returns index
				return i;
			}
		}
		// if it isn't in the list
		return -1;
	}

	public static <E> void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// array of integers
			Integer[] list = new Integer[10];
			for (int i = 0; i < list.length; i++) {
				// stores random numbers in list
				list[i] = (int) (Math.random() * 5);
			}
			// user input
			System.out.println("Enter a number you want to check");
			Integer key = input.nextInt();
			// prints the methods return
			System.out.println(linearSearch(list, key));
			// prints the list
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
