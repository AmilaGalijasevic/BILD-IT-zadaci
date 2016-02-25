package zadaci_24_02_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class BinarySearchArrayE {
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// sorts the list
		Arrays.sort(list);
		// prints the list
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		// searches the array
		int search = Arrays.binarySearch(list, key);
		// if it finds it returns the index, else returns -1
		return search;
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// array of integers
			Integer[] list = { 6, 77, 4, 23, 2, 65, 8, 9, 43 };
			// user input
			System.out.println("Enter a number you want to check");
			Integer key = input.nextInt();
			// prints the method return value
			System.out.println("Entered number as at index: " + binarySearch(list, key));
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
