package zadaci_26_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class NumbersInOrder {
	public static int[] order(int a, int b, int c) {
		// array to store the 3 numbers
		int[] abc = new int[3];
		// adds numbers
		abc[0] = a;
		abc[1] = b;
		abc[2] = c;
		// sorts array
		Arrays.sort(abc);
		return abc;

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// Message for users and their input
			System.out.println("Enter 3 numbers");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			// prints numbers from min to max
			for (int i = 0; i < 3; i++) {
				System.out.print(order(a, b, c)[i] + " ");
			}
			// catches input exceptions
		} catch (InputMismatchException ey) {

			System.out.println("Wrong input, try again: ");
			main(args);
		}
		input.close();
	}
}
