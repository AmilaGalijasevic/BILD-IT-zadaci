package zadaci_19_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class AccountBalance {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter monthly savings amount");
			double amount = input.nextDouble();
			// arraylist for storing savings amount
			ArrayList<Double> savings = new ArrayList<>();
			// message for user
			System.out.println("Enter number of months after which you would like to see amount on your account.");
			int month = input.nextInt();
			
			// calculates interest rate
			double interest = ((amount * 5) / 100)/100;
			interest = (interest / 12) + 1;
			
			// calculates first month savings
			double firstMonth = amount * interest;
			// ads it to list
			savings.add(firstMonth);
			double nextMonth = 0;
			// calculates and ads next month savings to the list
			for (int i = 0; i < month; i++) {
				nextMonth = ((amount + savings.get(i).doubleValue()) * interest);
				savings.add(nextMonth);

			}
			// displays the savings for wanted month
			System.out.println(savings.get(month - 1).doubleValue());

		} catch (InputMismatchException ey) {
			System.out.println("Wrong Input");
		}
		input.close();
	}

}
