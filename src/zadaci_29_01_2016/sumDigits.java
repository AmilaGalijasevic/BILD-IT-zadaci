package zadaci_29_01_2016;

import java.util.InputMismatchException;

public class sumDigits {
	public static int sumDigit(long n) {
		double rest = 0;
		int sum = 0;
		// sums the digits in number till 0
		while (n != 0) {
			rest = n % 10;
			sum += rest;
			n = n / 10;
		}
		// returns the number
		return sum;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a number:");
			// user input
			long num = input.nextLong();
			// calls the method
			System.out.println(sumDigit(num));
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
	}
}
