package zadaci_08_02_2016;

import java.math.BigInteger;

public class MaxLarge5and6 {

	public static void main(String[] args) {
		int count = 0;
		// string with the value of the long max value
		String s = "9223372036854775807";
		// big integer with that value
		BigInteger m = new BigInteger(s);
		BigInteger i = new BigInteger("5");
		BigInteger j = new BigInteger("6");
		// counter

		while (count < 5) {

			// prints numbers bigger than long max value divided by 5 and 6
			System.out.println(m.divide(i).toString());
			System.out.println(m.divide(j).toString());
			// counts the output
			count++;
			// increases the number
			m = m.add(m.add(BigInteger.ONE));
		}
	}
}
