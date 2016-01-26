package zadaci_26_01_2016;

import java.util.ArrayList;

public class IsPrime {
	public static int isPrime(int n) {
		int num = 0;
		// counter
		int counter = 0;
		// loop that checks if numbers are divisible with each other and 1
		for (int j = n; j >= 1; j--) {
			// if they are divisible they are counted
			if (n % j == 0) {
				counter++;
			}
		}
		// num takes value of n
		if (counter == 2) {
			num = n;

		}

		return num;
	}

	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> primes = new ArrayList<>();
		// loop for finding primes between 2 and 100000
		for (int i = 2; i < 100000; i++) {
			// if the number from the method is bigger than 0
			if (isPrime(i) > 0) {
				// adds it to the list
				primes.add(isPrime(i));

			}
		}
		// prints prime numbers
		for (int i = 0; i < primes.size(); i++) {
			System.out.print(primes.get(i).intValue() + " ");
			count++;
			//prints new line after 20 numbers
			if (count % 20 == 0) {
				System.out.println();
			}
		}
	}
}
