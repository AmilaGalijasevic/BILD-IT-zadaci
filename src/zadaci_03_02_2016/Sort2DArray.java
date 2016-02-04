package zadaci_03_02_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Sort2DArray {
	public static void sort(int m[][]) {

		// new array to store rotated matrix
		int[][] temp = new int[3][3];
		// gives the values to the temporary array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				temp[i][j] = m[j][i];
			}
		}
		System.out.println("Sorted rows:");
		// sorts rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				Arrays.sort(m[i]);
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		// rotates the matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// sorts temporary array
				Arrays.sort(temp[i]);
				m[j][i] = temp[i][j];
			}
		}
		// prints sorted columns
		System.out.println("Sorted columns: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a 3X3 matrix");
			// new matrix for storing input
			int[][] m = new int[3][3];
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextInt();
				}
			}
			System.out.println("Sorted array:");
			//calls method
			sort(m);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("wrong input");
			main(args);
		}
	}

}
