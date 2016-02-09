package zadaci_08_02_2016;

import java.math.BigDecimal;

public class SquareNumbers {
	public static void main(String[] args) {
		// big decimal with the value of long max
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		// calculates the square root
		long sqrt = (long) Math.sqrt(Long.MAX_VALUE);
		// big decimal with the value of root
		BigDecimal sr = new BigDecimal(sqrt);
		int count = 0;

		while (count < 10) {
			// calculates square of the sr
			BigDecimal square = sr.multiply(sr);
			if (square.compareTo(longMaxValue) > 0) {
				count++;
				//displays it
				System.out.println(square);
			}
			//adds one
			sr = sr.add(BigDecimal.ONE);
		}

	}

}
