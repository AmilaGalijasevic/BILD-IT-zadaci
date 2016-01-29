package MiniProjekat_2;

public class CreditCard {
	public static boolean isValid(long number) {
		// sums the return values of the methods
		int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		// checks if its a valid number
		if ((total % 10 == 0) && (prefixMatched(number, 1) == true) && (getSize(number) >= 13)
				&& (getSize(number) <= 16)) {
			System.out.println(number + " is valid: ");
			// returns true if it is
			return true;
		} else {
			System.out.println(number + " is valid: ");
			return false;
		}
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int result = 0;
		long temp = 0;
		// while number is bigger than 0
		while (number > 0) {
			// calculates number in even places
			temp = number % 100;
			result += getDigit((int) (temp / 10) * 2);
			number = number / 100;
		}
		// returns the value
		return result;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// if the number is smaller than 9 returns it
		if (number <= 9) {
			return number;
		} else {
			// if its bigger returns the sum of two digits
			int firstDigit = number % 10;
			int secondDigit = number / 10;

			return firstDigit + secondDigit;
		}

	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int result = 0;
		// calculates numbers in odd places in number
		while (number > 0) {
			result += number % 10;
			number = number / 100;
		}
		// returns the result
		return result;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// if prefix is 4 the card is visa
		if (getPrefix(number, d) == 4) {
			System.out.println("Visa Card ");
			return true;
		}
		// if its 5 card is master
		else if (getPrefix(number, d) == 5) {
			System.out.println("Master Card ");
			return true;
		}
		// card is American express
		else if (getPrefix(number, d) == 3) {
			System.out.println("American Express Card ");
			return true;

		}
		// card is discover
		else if (getPrefix(number, d) == 6) {
			System.out.println("Discover Card");
			return true;
		} else {
			// if its not any of those returns false
			return false;

		}

	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		int count = 0;
		// calculates size off the digits in number
		while (d > 0) {
			d = d / 10;
			// counts them
			count++;
		}
		// returns them
		return count;

	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// returns first digit value if its smaller than k
		if (getSize(number) < k) {
			return number;
		} else {
			// takes value of the size in get size method return number
			int size = getSize(number);

			for (int i = 0; i < (size - k); i++) {
				number = number / 10;
			}

			return number;

		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter credit card number: ");
			long cNumber = input.nextLong();

			input.close();
			//calls method
			System.out.println(isValid(cNumber));
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

	}

}
