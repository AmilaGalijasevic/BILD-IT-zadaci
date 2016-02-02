package zadaci_02_02_2016;

import java.util.InputMismatchException;

public class RandomNChooser {
	public static int getRandom(int... numbers) {
		// new random generated number
		int num = 1 + (int) (Math.random() * 53);
		// if the generated number is equal to the number from main method
		for (int i = 0; i < numbers.length; i++) {
			if (numbers.equals(num)) {
				// gets new random value
				num = 1 + (int) (Math.random() * 53);
			}
		}
		// returns number
		return num;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// new array for numbers that can't be returned form the method
			// generator
			int[] exclude = new int[10];
			System.out.println("Enter 10 numbers you want to exclude from random number generator: ");
			// stores the numbers
			for (int i = 0; i < exclude.length; i++) {
				exclude[i] = input.nextInt();

			}
			// calls method and prints new random number
			System.out.println(getRandom(exclude));
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
