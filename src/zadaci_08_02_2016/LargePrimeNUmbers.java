package zadaci_08_02_2016;

import java.math.BigInteger;

public class LargePrimeNUmbers {

	public static void main(String[] args) {
		int count = 0;
		// string that stores the value of the long max value
		String s = "9223372036854775807";
		// big integer with that value
		BigInteger m = new BigInteger(s);
		// counter
		while (count < 5) {
			// increases the number
			m = m.add(BigInteger.ONE);
			// if the number is prime
			if (m.isProbablePrime(m.intValue())) {
				// displays the number
				System.out.println(m.nextProbablePrime());
				count++;
			}

		}
	}
}