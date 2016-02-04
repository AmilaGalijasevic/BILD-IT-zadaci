package zadaci_03_02_2016;

public class MultiplyMatrix {
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		// multiplies the numbers in arrays
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		// returns numbers
		return c;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			
		System.out.println("Enter two 3 * 3 matrices: ");
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		// stores the numbers in first matrix
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = input.nextDouble();
			}
		}
		// stores the numbers in second matrix
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = input.nextDouble();
			}
		}
		// prints first matrix
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			// prints * sign in second row
			if (i == 1) {
				System.out.print("   *   ");
			} else {
				System.out.print("       ");
			}
			// prints second matrix
			for (int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			// prints = sign
			if (i == 1) {
				System.out.print("   =   ");
			} else {
				System.out.print("       ");
			}
			// prints numbers from the method
			for (int j = 0; j < multiplyMatrix(m1, m2)[i].length; j++) {
				System.out.print(multiplyMatrix(m1, m2)[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

		} catch (Exception ey) {
			System.out.println("Something went wrong, try again: ");
			main(args);
		}
	}

}
