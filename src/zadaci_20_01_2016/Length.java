package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class Length {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// messages for users
			System.out.println("Enter velocity of the plane in m/s:");
			double v = input.nextDouble();
			System.out.println("Enter acceleration in m/s squared:");
			double a = input.nextDouble();
			// calculates length of the runway
			double length = v * v / (2 * a);
			System.out.println("The minimal requaired length of the runway is: " + length);

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
