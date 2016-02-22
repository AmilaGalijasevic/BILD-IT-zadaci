package zadaci_20_02_2016;

import java.math.BigInteger;

public class DecimalFraction {
	public static int maxDivisor(int a, int b) {
		int maxDiv = 0;
		// searches for max divisor
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && a % i == 0) {
				maxDiv = i;
			}
		}
		return maxDiv;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a decimal number: ");
			String dec = input.nextLine();

			int num = Integer.parseInt(dec.split("\\.")[0]);
			int rest = Integer.parseInt(dec.split("\\.")[1]);
			BigIntegerRational r = new BigIntegerRational();
			int denominator = 0;
			// if the rest is a two digit number
			if (!(rest >= 10)) {
				// calculates the numerator and denominator
				denominator = 10 / rest;
				rest = rest / maxDivisor(rest, 10);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				// sets it
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// if rest is a 3 digit number
			} else if (!(rest >= 100)) {
				// calculates the numerator and denominator
				denominator = 100 / maxDivisor(rest, 100);
				rest = rest / maxDivisor(rest, 100);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				// prints it
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// if rest is a four digit number
			} else if (!(rest >= 1000)) {
				// calculates
				denominator = 1000 / maxDivisor(rest, 1000);
				rest = rest / maxDivisor(rest, 1000);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// if it's a five digit number
			} else if (!(rest >= 10000)) {
				// calculates
				denominator = 10000 / maxDivisor(rest, 10000);
				rest = rest / maxDivisor(rest, 10000);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
			}
			// Printing fraction
			System.out.println("The fraction number is: " + r.toString());

		} catch (NumberFormatException e) {
			System.out.println("Wrong input, try again: ");
			main(args);
		} finally {
			input.close();
		}
	}
}
