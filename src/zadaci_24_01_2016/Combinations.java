package zadaci_24_01_2016;

public class Combinations {

	public static void main(String[] args) {
		int counter = 0;
		// loop that finds number i within numbers 1 and 7
		for (int i = 1; i <= 7; i++) {
			// loop that finds number j, j = i so there will be no duplicates
			for (int j = i+1; j <= 7; j++) {
				// counts combinations
				counter++;
				// prints them
				System.out.print(i + " " + j + ", ");
			}
			// next line
			System.out.println();

		}
		// displays number of combinations
		System.out.println("Number of combinations is " + (counter));

	}

}
