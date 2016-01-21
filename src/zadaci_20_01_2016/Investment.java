package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class Investment {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// messages for users
			System.out.println("Enter invest amount:");
			double invest = input.nextDouble();
			System.out.println("Enter annual interest rate:");
			double annualRate = input.nextDouble();
			System.out.println("Enter number of years:");
			double years = input.nextDouble();
			// calculates monthly interest rate
			double monthRate = annualRate / (1200);
			// calculates future invest rate
			// we use method math.pow when calculating ^
			double future = invest * (Math.pow(1 + monthRate, years * 12));

			// displays the amount of future invest value
			System.out.println("Future invest value: " + future);

			// catches exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");

		}
		input.close();
	}

}
