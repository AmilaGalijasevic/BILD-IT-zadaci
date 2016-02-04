package zadaci_03_02_2016;

import java.util.Arrays;

public class WeeklyHours {
	public static int sumHours(int[][] h, int row) {
		int sum = 0;
		int i = 0;
		// sums rows in 2d array
		for (int j = 0; j < h[i].length; j++) {
			sum += h[row][j];
		}
		// returns the sum
		return sum;
	}

	public static void main(String[] args) {
		// 2d array with hours
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 },
						{ 7, 3, 4, 3, 3, 4, 4 }, 
						{ 3, 3, 4, 3, 3, 2, 2 },
						{ 9, 3, 4, 7, 3, 4, 1 },
						{ 3, 5, 4, 3, 6, 3, 8 },
						{ 3, 4, 4, 6, 3, 4, 4 }, 
						{ 3, 7, 4, 8, 3, 8, 4 },
						{ 6, 3, 5, 9, 2, 7, 9 } };
		
		// new array for storing employee hours
		int[][] z = new int[8][2];
		for (int i = 0; i < z.length; i++) {
			z[i][0] = i;
			z[i][1] = sumHours(hours, i);
		}
		// sorts and compares the employees and their hours
		Arrays.sort(z, new java.util.Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(b[1], a[1]);
			}
		});

		// displays the amount of hours for each employee in decreasing order
		for (int i = 0; i < hours.length; i++) {
			System.out.println("Employee " + z[i][0] + " worked for total of " + z[i][1] + " h per week");

		}

	}

}
