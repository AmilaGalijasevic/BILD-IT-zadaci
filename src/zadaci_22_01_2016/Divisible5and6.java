package zadaci_22_01_2016;

public class Divisible5and6 {

	public static void main(String[] args) {
	
		int count = 0;
		// loop with start and end values
		for (int i = 100; i < 1000; i++) {
			// if the loop finds numbers divisible with both 5 and 6
			if (i % 5 == 0 && i % 6 == 0) {
				// displays them
				System.out.print(i + " ");
				// counts them
				count++;
				// prints new line
				if (count % 10 == 0) {
					System.out.println();
				}

			}
		}

	}

}
