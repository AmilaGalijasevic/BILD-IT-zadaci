package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class IdenticalArrays {
	public static boolean equals(int[] niz1, int[] niz2) {

		// if arrays aren't equal returns true
		if (Arrays.equals(niz1, niz2)) {
			return true;
		}
		// else returns false
		else {
			return false;
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// creates two arrays
			int[] array1 = new int[5];
			int[] array2 = new int[5];
			System.out.println("Enter 5 numbers in two arrays ");
			// stores the inputs in arrays
			for (int i = 0; i < array1.length; i++) {
				array1[i] = input.nextInt();

			}
			for (int i = 0; i < array1.length; i++) {
				array2[i] = input.nextInt();
			}
			// displays true of false, depending on the input
			System.out.println("The entered arrays are equal: " + equals(array1, array2));

		} catch (InputMismatchException ex) {
			System.out.println("Wrong input");
		}
		input.close();
	}
}
