package zadaci_27_01_2016;

import java.util.InputMismatchException;

public class ComparePrice {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			// messages for user
			System.out.println("Enter weight and price of the first item :");
			// input
			double w1 = input.nextDouble();
			double p1 = input.nextDouble();

			System.out.println("Enter weight and price of the second item :");
			double w2 = input.nextDouble();
			double p2 = input.nextDouble();
			// calculates prices per weight
			double price1 = p1 / w1;
			double price2= p2 / w2;

			// prints the item with better price
			if (price1 < price2) {
				System.out.println("First item has the better price.");
			} else {
				System.out.println("Second item has the better price.");
			}
			input.close();
		} catch (InputMismatchException ey) {

			System.out.println("Wrong input.");
			main(args);
		}
	}

}
