package zadaci_18_01_2016;

import java.util.InputMismatchException;

public class ISBN {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter 9 numbers to get your ISBN number");
			// new array for storing input
			int[] ISBN = new int[9];
			int checksum = 0;
			// stores the input in array
			for (int i = 0; i < ISBN.length; i++) {
				ISBN[i] = input.nextInt();
			}
			// calculates checksum
			checksum = (ISBN[0] * 1 + ISBN[1] * 2 + ISBN[2] * 3 + ISBN[3] * 4 + ISBN[4] * 5 + ISBN[5] * 6 + ISBN[6] * 7
					+ ISBN[7] * 8 + ISBN[8] * 9) % 11;
			// displays the input
			for (int i = 0; i < ISBN.length; i++) {
				System.out.print(ISBN[i] + " ");

			}
			// if checksum is 10 ads x to the integers
			if (checksum == 10) {
				System.out.print("X");
				// ads checksum to the integers
			} else {
				System.out.print(checksum);
			}

		} catch (InputMismatchException ey) {

			System.out.println("Wrong input");
		}
		input.close();
	}

}
