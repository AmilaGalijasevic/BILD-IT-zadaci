package zadaci_24_01_2016;

import java.util.ArrayList;

public class TwinPrimeNumbers {

	public static void main(String[] args) {

		// array list to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();
		// counter
		int count = 0;
		// first loop with start value and end value
		for (int i = 2; i <= 10000; i++) {
			// initializes the second counter
			int counter = 0;
			// loop that checks if numbers in list are divisible with same
			// number and 1
			for (int j = i; j >= 1; j--) {
				// if they are divisible only with itself and 1 they are counted
				if (i % j == 0) {
					counter++;
				}
			}
			// ads number to the list
			if (counter == 2) {
				primes.add(i);
			}

		}
		int twin = 0;
		
		for (int i = 1; i < primes.size(); i++) {
			// calculates twin number
			twin = primes.get(i).intValue() + 2;
			// if calculated twin is a prime
			if (primes.contains(twin)) {
				// displays twin primes numbers and twins
				System.out.print(primes.get(i).intValue() + "&" + twin + " ");
				// counts them
				count++;
				// prints next line
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}

	}
}
