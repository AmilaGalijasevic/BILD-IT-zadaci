package zadaci_16_01_2016;

import java.util.InputMismatchException;

public class Matrix {

	public static void printMatrix(int n) {

		int[][] matrix = new int[n][n];
		// daje random vrijednosti 0 i 1 matrici
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int b1 = (int) (Math.random() * 2);
				matrix[i][j] = b1;
			}
		}
		// ispisuje matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		
		try {
			System.out.println("Unesite n");
			int n = input.nextInt();
			//poziva metodu
			printMatrix(n);
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
		}

		input.close();
	}

}
