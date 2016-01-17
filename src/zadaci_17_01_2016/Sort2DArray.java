package zadaci_17_01_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Sort2DArray {
	public static double[][] sortRows(double[][] array) {
//loop for sorting and displaying the sorted numbers
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				//sorts rows in 2d array
				Arrays.sort(array[i]);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		return array;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter the size of a matrix");
			int size = input.nextInt();
			//creates new 2d array whit wanted size
			double[][] a = new double[size][size];
			
			System.out.println("Enter the number to matrix");
			//stores the input in matrix
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = input.nextDouble();
				}
			}
			//calls method
			sortRows(a);
			
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
