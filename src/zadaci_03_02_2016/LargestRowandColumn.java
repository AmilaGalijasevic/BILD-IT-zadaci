package zadaci_03_02_2016;

public class LargestRowandColumn {

	public static void main(String[] args) {
		// new 2d array
		int[][] matrix = new int[4][4];
		// counters
		int count1 = 0;
		int count2 = 0;
		int max1 = 0;
		int max2 = 0;
		int pos1 = 0;
		int pos2 = 0;
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
				// counts 1s in row
				if (matrix[i][j] == 1) {
					count1++;
				}
				// counts in column
				if (matrix[j][i] == 1) {
					count2++;
				}

			}
			// for printing new line in array
			System.out.println();
			// finds position of the row
			if (count1 > max1) {
				max1 = count1;
				pos1 = i;

			}
			// resets the counter
			count1 = 0;
			// finds position of the column
			if (count2 > max2) {
				max2 = count2;
				pos2 = i;

			}
			count2 = 0;
		}
		System.out.println("Row with most number 1s is:  " + pos1);
		System.out.println("Column with most number 1s is: " + pos2);

	}

}