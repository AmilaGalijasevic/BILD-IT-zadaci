package zadaci_18_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SortedNUmbers {
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		// new array for storing numbers
		double[] array = new double[3];
		// gives the value of the entered numbers to positions in an array
		array[0] = num1;
		array[1] = num2;
		array[2] = num3;
		// loop for sorting array and displaying numbers in it
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array);
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter 3 numbers");

			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			// calls the method
			displaySortedNumbers(a, b, c);
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");

		}
		input.close();
	}

}
