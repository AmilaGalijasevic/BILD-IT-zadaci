package zadaci_02_02_2016;

import java.util.InputMismatchException;

public class SumColumn {
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		// sums columns
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		// returns the sum
		return sum;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		double[][] matrix = new double[3][4];
		try {

			System.out.println("Enter a 3-by-4 matrix row by row:");
			// loop for storing numbers in matrix
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = input.nextDouble();
				}
			}
			// calls method and prints the sum
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.println("Sum of the elements at column " + j + " is: " + sumColumn(matrix, j));
				}
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
