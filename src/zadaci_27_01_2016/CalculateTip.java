package zadaci_27_01_2016;

import java.util.InputMismatchException;

public class CalculateTip {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// messages and inputs
			System.out.println("Enter the amount of the bill and percentage for tip:");
			double bill = input.nextDouble();
			double tipPercentage = input.nextDouble();
			// calculates tip amount
			double tip = (bill * tipPercentage) / 100;
			// calculate total amount
			double total = bill + tip;
			// displays the amounts
			System.out.println("Total amount is: " + total + "\nAmount for tip is: " + tip);

			input.close();
		} catch (InputMismatchException ey) {

			System.out.println("Wrong input");
			main(args);
		}
	}

}
