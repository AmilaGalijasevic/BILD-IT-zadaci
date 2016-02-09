package zadaci_08_02_2016;

import java.math.BigDecimal;

public class DecimalDivided2and3 {

	public static void main(String[] args) {
		int count = 0;
		// big decimals
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new BigDecimal(3);
		// not really sure if this is what the assignment was :)
		BigDecimal big = new BigDecimal("0.00000000000000000000000000000000000000000000000001");
		// counter to stop when 10 numbers are printed
		while (count < 10) {
			if (big.divide(big, 2) != null) {
				// if it works correctly it should display the numbers divided
				// by 2
				System.out.println(big.divide(a).toPlainString());
			}

			if (big.remainder(b) == null) {
				// should print numbers with 50 decimals divided by 3
				System.out.println(big.divide(b).toPlainString());

			}
			// increases the number
			big = big.add((BigDecimal.ONE));
			// counts
			count++;
		}

	}

}
