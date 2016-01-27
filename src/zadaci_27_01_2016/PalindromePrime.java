package zadaci_27_01_2016;

public class PalindromePrime {
	public static boolean isPalindrome(int num) {
		int reverse = 0;
		// takes value form the number in argument
		int empty = num;
		// while num isn't 0 calculates numbers
		while (num != 0) {
			// calculates
			reverse = reverse * 10;
			reverse = reverse + (num % 10);
			num = num / 10;
		}
		// if the calculated number is same as num value
		if (reverse == empty) {
			// returns true
			return true;
		} else {
			return false;

		}

	}

	public static boolean isPrime(int num) {

		// counter
		int counter = 0;
		// loop that checks if numbers are divisible
		for (int j = num; j >= 1; j--) {
			// if they are divisible they are counted
			if (num % j == 0) {
				counter++;
			}
		}
		// if the loop finds prime number returns true
		if (counter == 2) {
			return true;
			// else returns false
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		int count = 0;
		System.out.println("First 100 polindrome prime numbers: ");
		for (int i = 0; i < 100000; i++) {
			// if methods return true
			if (isPalindrome(i) && (isPrime(i))) {
				// prints numbers
				System.out.print(i + " ");
				count++;
				// prints new line after every 10 numbers
				if (count % 10 == 0) {
					System.out.println();
				}
				// after printing 100 numbers end loop
				if (count == 100) {
					System.out.println();
					break;
				}

			}
		}
	}

}
