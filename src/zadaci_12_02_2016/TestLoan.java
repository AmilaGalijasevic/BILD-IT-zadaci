package zadaci_12_02_2016;

import java.util.InputMismatchException;

public class TestLoan {

	public static void main(String[] args) throws IllegalArgumentException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter annual interest rate");
			double annualInterestRate = input.nextDouble();
			System.out.println("Enter number of years");
			int numberOfYears = input.nextInt();
			System.out.println("Enter loan amount");
			double loanAmount = input.nextDouble();
			// new loan object
			Loan l = new Loan(annualInterestRate, numberOfYears, loanAmount);
			System.out.println(l.toString());
			input.close();
			// exceptions
		} catch (IllegalArgumentException e) {
			System.out.println("Numbers must be bigger than zero");
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
	}

}
