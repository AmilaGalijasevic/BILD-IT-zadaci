package zadaci_25_01_2016;

import java.util.ArrayList;

public class PNumbers {

	public static void main(String[] args) {

		// array list to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();
		// counter
		int count = 0;
		// first loop with start value and end value
		for (int i = 1; i <= 1000; i++) {
			// second counter
			int counter = 0;
			// loop that checks if numbers in list are divisible with same
			// number and 1
			for (int j = i; j >= 1; j--) {
				// if they are divisible only with itself and 1 they are counted
				if (i % j == 0) {
					// counts them
					counter++;
				}
			}
			// ads number to the list
			if (counter == 2) {
				primes.add(i);
			}
		}
		// displays the numbers, 8 per line
		for (int i = 0; i < primes.size(); i++) {
			System.out.print(primes.get(i).intValue() + " ");
			count++;
			if (count % 8 == 0) {
				System.out.println();
			}
		}
	}

}
