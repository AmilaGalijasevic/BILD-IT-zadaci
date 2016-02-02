package zadaci_02_02_2016;

import java.util.InputMismatchException;

public class ConsecutiveNumbers {
	public static boolean isConsecutiveFour(int[] values) {
		// counter
		int count = 1;
		for (int i = 0; i < values.length - 1; i++) {
			// counts if the numbers are same
			if (values[i] - values[i + 1] == 0) {
				count++;
			}
		}
		// if it counts 4 consecutive numbers returns true
		if (count == 4) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter length of the array:  ");
			int length = input.nextInt();
			int[] array = new int[length];
			// stores numbers in array
			System.out.println("Enter numbers: ");
			for (int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}
			// if method returns true
			if (isConsecutiveFour(array)) {
				System.out.println("Entered array has four equal consecutive numbers.");
				// if it returns false
			} else {
				System.out.println("Array doesn't have four equal consecutive numbers");
			}
			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
