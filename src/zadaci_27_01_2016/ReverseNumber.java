package zadaci_27_01_2016;

import java.util.InputMismatchException;

public class ReverseNumber {
	public static void reverse(int number) {
		int reverse = 0;
		// while number is bigger than 0
		while (number > 0) {
			// calculates number
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		// prints it
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			// message and input
			System.out.println("Enter the number:");
			int number = input.nextInt();
			// calls method
			System.out.println("In reverse:");
			reverse(number);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
