package zadaci_21_01_2016;

public class PerfectNumber {

	public static void main(String[] args) {

		int sum = 0;
		// first loop with start value and end value
		for (int i = 1; i <= 10000; i++) {
			// loop for divisors
			for (int j = 1; j < i; j++) {
				// finds divisors and sums them
				if (i % j == 0) {
					sum += j;
				}
			}
			// if it finds sum of divisors that is equal to i prints them
			if (sum == i) {

				System.out.println(i);
			}
			// resets the sum
			sum = 0;

		}

	}

}
