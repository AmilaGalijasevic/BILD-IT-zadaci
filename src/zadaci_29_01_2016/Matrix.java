package zadaci_29_01_2016;

public class Matrix {
	public static void printMatrix(int n) {
		// new 2d array
		int[][] matrix = new int[n][n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// gives the numbers in matrix value of 0 or 1
				int nums = (int) (Math.random() * 2);
				matrix[i][j] = nums;
			}
		}
		// prints matrix
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
			// message for user and input
			System.out.println("Enter a number for matrix lenght:");
			int n = input.nextInt();
			// calls method
			printMatrix(n);

		} catch (Exception e) {
			System.out.println("Something went wrong, try again: ");
			main(args);
		}
		input.close();
	}

}
