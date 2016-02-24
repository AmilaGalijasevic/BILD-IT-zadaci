package zadaci_23_02_2016;

import java.util.InputMismatchException;

public class SumDigit {

	public static int sum = 0;

	public static int sumDigits(long n) {
		// stops the recursion
		if (n == 0) {
			return sum;
		} else {
			// calculates the sum of digits
			sum += n % 10;
			return sumDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Enter a number");
			long num = input.nextLong();
			// prints the sum
			System.out.println(sumDigits(num));
		} catch (InputMismatchException ej) {
			System.out.println("Wrong input");
			main(args);

		}
	}
}
