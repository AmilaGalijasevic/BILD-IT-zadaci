package zadaci_02_02_2016;

import java.util.InputMismatchException;

public class Add2Matrix {
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// new matrix for storing sums of columns
		double[][] sumM = new double[3][3];
		// sums the columns from argument
		for (int i = 0; i < sumM.length; i++) {
			for (int j = 0; j < sumM[i].length; j++) {
				sumM[i][j] = a[i][j] + b[i][j];

			}
		}
		// returns the sum numbers
		return sumM;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// new 2d arrays for storing numbers
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		try {
			// stores numbers in first 2d array
			System.out.println("Enter numbers in first 3x3 matrix: ");
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					matrix1[i][j] = input.nextDouble();
				}
			}
			// stores in second
			System.out.println("Enter numbers in second 3x3 matrix: ");
			for (int i = 0; i < matrix2.length; i++) {
				for (int j = 0; j < matrix2[i].length; j++) {
					matrix2[i][j] = input.nextDouble();
				}
			}
			// loops for printing numbers in 2d arrays
			for (int i = 0; i < matrix1.length; i++) {
				for (int j = 0; j < matrix1[i].length; j++) {
					System.out.print(matrix1[i][j] + " ");
				}
				// prints + in the middle
				if (i == 1) {
					System.out.print("   +    ");
				} else {
					System.out.print("        ");
				}
				// prints second matrix
				for (int j = 0; j < matrix2[i].length; j++) {
					System.out.print(matrix2[i][j] + " ");
				}
				// if it's second row prints =
				if (i == 1) {
					System.out.print("   =    ");
					// else prints spaces
				} else {
					System.out.print("        ");
				}
				// prints numbers from the method
				for (int j = 0; j < addMatrix(matrix1, matrix2)[i].length; j++) {
					System.out.print(addMatrix(matrix1, matrix2)[i][j] + " ");
				}
				System.out.println();
			}
			input.close();

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again");
			main(args);
		}

	}

}
