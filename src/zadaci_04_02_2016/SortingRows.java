package zadaci_04_02_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SortingRows {
	public static double[][] sortRows(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			// sorts rows
			Arrays.sort(m[i]);
		}
		// returns sorted array
		return m;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a 3-by-3 matrix row by row:");
			double m[][] = new double[3][3];
			// stores the users input
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextDouble();
				}
			}
			// prints the array from the method
			for (int i = 0; i < sortRows(m).length; i++) {
				for (int j = 0; j < sortRows(m)[i].length; j++) {
					System.out.print(sortRows(m)[i][j] + " ");
				}
				System.out.println();
			}
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input:");
			main(args);
		}
	}

}
