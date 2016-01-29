package zadaci_29_01_2016;

public class Fractions {

	public static void main(String[] args) {
		double sum = 0;
		// loop from 0 to 99
		for (int i = 0; i < 99; i++) {
			// calculates j
			int j = i + 2;
			// if i is odd number
			if (i % 2 != 0) {
				// prints them as int values, so its pretty
				System.out.print(i + "/" + j + " + ");
				// calculates them as double values
				sum += ((double) i / (double) j);

			}

		}
		// prints them
		System.out.println("\n = " + sum);
	}
}
