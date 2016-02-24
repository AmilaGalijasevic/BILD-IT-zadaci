package zadaci_23_02_2016;

import java.util.InputMismatchException;

public class ReverslyInteger {
	public static int reverse = 0;

	public static void reverseDisplay(int value) {
		// stops the recursion when value is 0
		if (value == 0) {
			// prints the number
			System.out.println(reverse);
		} else {
			// reverses the number
			reverse = reverse * 10;
			reverse += value % 10;
			// calls the method again
			reverseDisplay(value / 10);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// user inputs
			System.out.println("Enter a number");
			int num = input.nextInt();
			// calls method
			reverseDisplay(num);

		} catch (InputMismatchException e) {
			System.out.println("Wrong input, try again: ");
			main(args);
		}
	}

}
