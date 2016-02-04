package zadaci_03_02_2016;

public class EvenNumberOf1s {

	public static void main(String[] args) {
		// new 2d array
		int[][] matrix = new int[6][6];
		// stores 0 and 1 in array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}
		// counters
		int count1 = 0;
		int count2 = 0;
		// prints matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// counts 1s in row
				if (matrix[i][j] == 1) {
					count1++;
				}
				// counts 1s in column
				if (matrix[j][i] == 1) {
					count2++;
				}
			}
			// if it counts 3 occurrences of 1s in row
			if (count1 == matrix.length/2) {
				System.out.println("Row " + i + " has even numbers of 1s.");
			} else {
				System.out.println("Row " + i + " doesn't have an even number of 1s.");
			}
			count1 = 0;
			
			// if it counts 3 occurrences of 1s in row
			if (count2 == matrix.length/2) {
				System.out.println("Column " + i + " has even numbrs of 1s.");

			} else {
				System.out.println("Column " + i + " doesn't have an even numbers of 1s");
			}
			count2 = 0;
		}
	}
}
