package zadaci_12_02_2016;

import java.util.InputMismatchException;

public class ConvexPolygon {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter the number of the points:");
			int points = input.nextInt();
			double[] xs = new double[points];
			double[] ys = new double[points];
			// takes input from user
			for (int i = 0; i < xs.length; i++) {
				System.out.println("Enter the coordinates of the x points:");
				xs[i] = input.nextDouble();
				System.out.println("Enter the coordinates of the y points:");
				ys[i] = input.nextDouble();
			}

			double area = 0;
			// calculates area of the polygon
			for (int i = 0; i < points - 1; i++) {
				double first = (xs[i] * (ys[i + 1]));
				double second = (ys[i] * (xs[i + 1]));
				area += (first - second);
			}
			area = (Math.abs(area / 2));
			// prints it
			System.out.println(area);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
