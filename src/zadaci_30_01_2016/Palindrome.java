package zadaci_30_01_2016;

import java.util.InputMismatchException;

public class Palindrome {
	public static boolean isPalindrome(int num) {
		int number = 0;
		// takes value form the number in argument
		int empty = num;
		// reverses the number
		while (num != 0) {
			number = number * 10;
			number = number + (num % 10);
			num = num / 10;
		}
		// if the reversed number is same as num value
		if (number == empty) {
			// returns true
			return true;
		} else {
			return false;

		}
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a number:");
			int num = input.nextInt();
			// if method returns true
			if (isPalindrome(num)) {
				System.out.println("Entered number is palindrome.");
				// if it doesn't
			} else {
				System.out.println("Entered number isn't a palindrome.");
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input, try again:");
			main(args);
		}
	}

}
