package zadaci_08_02_2016;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class MersennePrime {

	public static void main(String[] args) {
		// array list to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
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
			// ads numbers to the list
			if (counter == 2) {
				primes.add(i);
			}
		}
		for (int i = 0; i < primes.size(); i++) {
			// String that stores the value of 2^p – 1
			String s = "" + new BigDecimal(Math.pow(2, primes.get(i).intValue()) - 1);
			// big integer with the value of string s
			BigInteger a = new BigInteger(s);
			// prints it
			System.out.println(a);
		}

	}

}
