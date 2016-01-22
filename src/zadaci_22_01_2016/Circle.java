package zadaci_22_01_2016;

import java.util.InputMismatchException;

public class Circle {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		try {
			// message for user
			System.out.println("Enter geographical latitude point x1: ");
			// uses Math.toradians method to store input
			double x1 = Math.toRadians(input.nextDouble());
			System.out.println("Enter geographical latitude point x2: ");
			double x2 = Math.toRadians(input.nextDouble());
			System.out.println("Enter geographical longitude point y1: ");
			double y1 = Math.toRadians(input.nextDouble());
			System.out.println("Enter geographical longitude point y2: ");
			double y2 = Math.toRadians(input.nextDouble());
			// approximate earth radius
			double earthRadius = 6.37101f;

			//formula d=radius*arccos(sin(x1)Xsin(x2)+cos(x1)*cos(x2)*cos(y1-y2))
			double d = earthRadius
					* (Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
			d = d * 1000;
			System.out.println("Great circle distance is: " + d + " km.");
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again: ");
			main(args);;
		}
		input.close();
	}

}
