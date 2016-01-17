package zadaci_17_01_2016;

import java.util.InputMismatchException;

public class MaxEl2DArray {
	public static int[] locateLargest(double[][] a) {
		// array for storing position of the biggest element
		int[] position = new int[2];
		double temp = 0;
		// finds the biggest element
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a.length; column++) {
				if (a[row][column] > temp) {
					temp = a[row][column];
				}
			}
		}
		// gives the position of the element to position array
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a.length; column++) {
				if (temp == a[row][column]) {
					position[0] = row;
					position[1] = column;
					// displays the position
					for (int i = 0; i < position.length; i++) {
						System.out.print(position[i] + " ");
					}
				}
			}

		}
		return position;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// creates new 2d array and stores the input value in it
			System.out.println("Enter 4x4 size 2D array ");
			double[][] a = new double[4][4];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = input.nextDouble();
				}
			}
			System.out.println("Biggest element is at position:");
			locateLargest(a);
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
