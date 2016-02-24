package zadaci_23_02_2016;

import java.util.InputMismatchException;

public class MAxArrayRecursion {
	public static int i = 0;
	public static int max;

	public static int maxArray(int[] a) {
		// base case
		if (i == a.length) {
			return max;
		} else {
			// finds max number in array
			if (a[i] > max) {
				// takes max value
				max = a[i];
			}
			// increases index
			i++;
			// calls the method
			return maxArray(a);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Enter an array of 8 numbers");
			int[] a = new int[8];
			// stores the numbers in array
			for (int i = 0; i < a.length; i++) {
				a[i] = input.nextInt();
			}
			// prints the number
			System.out.println(maxArray(a));
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}
}
