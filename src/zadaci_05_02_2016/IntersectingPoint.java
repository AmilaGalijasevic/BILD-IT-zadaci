package zadaci_05_02_2016;

import java.util.InputMismatchException;

public class IntersectingPoint {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter x1, y1, x2, y2 for the first line: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			System.out.println("Enter x3, y3, x4, y4 for the second line: ");
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
			double x4 = input.nextDouble();
			double y4 = input.nextDouble();
			// new object using the user input to calculate the points
			LinearEquation l = new LinearEquation((y1 - y2), (x1 - x2), (y3 - y4), (x3 - x4),
					((y1 - y2) * x1 - (x1 - x2) * y1), ((y3 - y4) * x3 - (x3 - x4) * y3));
			// if its solvable returns the x and y
			if (l.isSolvable()) {
				System.out.println("Intersecting point: " + l.getX() + "," + l.getY());
			} else {
				System.out.println("No intersecting points, lines are parallel");
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}

	}
}
