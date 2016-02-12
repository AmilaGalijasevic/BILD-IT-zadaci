package zadaci_12_02_2016;

import java.util.InputMismatchException;

public class InputMismatch {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user inputs
			System.out.println("Enter 2 integers");
			int a = input.nextInt();
			int b = input.nextInt();
			// calculates sum
			int sum = a + b;
			System.out.println("Sum: " + sum);
			input.close();
			// catches input exception
		} catch (InputMismatchException e) {

			System.out.println("Wrong input, try again");
			main(args);
		}

	}

}
