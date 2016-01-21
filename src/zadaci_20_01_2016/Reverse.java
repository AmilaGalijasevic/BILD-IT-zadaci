package zadaci_20_01_2016;

import java.util.InputMismatchException;

public class Reverse {
	public static int reverse(int number) {
		int reverse = 0;
		// while number is bigger than 0
		while (number > 0) {
			// calculates number
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		// returns reversed number
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		// number takes the value of the reversed number
		number = reverse(number);
		// last digit is remainder of number devised by 10
		int lastnumber = number % 10;
		// Devises the number by 100
		number = number / 100;
		// if they become equal returns true for palindrome
		if (lastnumber == number) {
			return true;
			// else returns false
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a three digit number: ");
			int number = input.nextInt();
			// it method returns true
			if (isPalindrome(number)) {
				// prints reversed number
				System.out.println(reverse(number));
				System.out.println("Number is a palindrome");
			}
			// if returns false
			else {
				System.out.println(reverse(number));
				System.out.println("Number isn't a palindrome");
			}

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
