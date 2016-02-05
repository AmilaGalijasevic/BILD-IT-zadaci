package zadaci_04_02_2016;

import java.util.InputMismatchException;

public class IdenticalArrays {
	public static boolean equals(int[][] m1, int[][] m2) {
		// checks if the arrays are identical
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				// if they are returns true
				if (m1[i][j] == (m2[i][j])) {
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter first 3-by-3 matrix row by row:");
			int m[][] = new int[3][3];
			// stores user input for first array
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextInt();
				}
			}
			System.out.println("Enter second 3-by-3 matrix row by row:");
			int m1[][] = new int[3][3];

			// stores user input for second array
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					m1[i][j] = input.nextInt();
				}
			}
			// if the method return true
			if (equals(m, m1)) {
				System.out.println("The 2 arrays are identical");
				// if it returns false
			} else {
				System.out.println("Arrays aren't identical");
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
