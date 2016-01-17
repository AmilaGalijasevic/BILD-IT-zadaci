package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class MinElement {
	public static double min(double[] array) {

		double min = 0;
		// lOOp that sorts the numbers in an array
		for (int i = 0; i < array.length; i++) {
			Arrays.sort(array);
			// minimal number after sorting is now in first position of
			// an array
			min = array[0];
		}
		// returns min number
		return min;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			//creates new array
			double[] array = new double[10];
			System.out.println("Input 10 numbers");
			//ads entered numbers in an array
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextDouble();
			}
			//displays the min nuber
			System.out.println("Smallest number in an array is: " + min(array));
			input.close();
			
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input");
		}
	}

}
