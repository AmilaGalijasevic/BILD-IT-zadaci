package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class MatrixArrayListRowColumn {

	public static int count(int[] n) {
		int counter = 0;
		// loop for counting 1s
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 1) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			int max1 = 0;
			int max2 = 0;
			System.out.println("Enter matrix length: ");
			int l = input.nextInt();
			// matrix with inputed length
			int[][] matrix = new int[l][l];
			// new array to store the reversed matrix
			int[][] matrix2 = new int[l][l];
			// arrays for storing positions
			int[] a = new int[matrix.length];
			int[] a2 = new int[matrix2.length];

			// lists for storing row and column
			ArrayList<Integer> row = new ArrayList<>();
			ArrayList<Integer> column = new ArrayList<>();
			// stores the numbers in array
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					int n = (int) (Math.random() * 2);
					matrix[i][j] = n;
				}
			}
			// prints the array
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");

				}
				System.out.println();
			}
			// reverses the matrix
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix2[j][i] = matrix[i][j];
				}
			}
			// stores the counted value
			for (int i = 0; i < matrix.length; i++) {
				a[i] = count(matrix[i]);
				a2[i] = count(matrix2[i]);
			}
			// finds the max number of 1s
			for (int i = 0; i < a.length; i++) {
				while (max1 < a[i]) {
					max1 = a[i];
				}
				while (max2 < a2[i]) {
					max2 = a2[i];
				}
			}
			// adds it to lists
			for (int i = 0; i < a.length; i++) {

				if (max1 == a[i]) {
					row.add(i);
				}
				if (max2 == a2[i]) {
					column.add(i);
				}
			}
			input.close();
			//prints them
			System.out.println("Largest row index:");
			System.out.println(row.toString());
			System.out.println("Largest column index:");
			System.out.println(column.toString());

		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}
}
