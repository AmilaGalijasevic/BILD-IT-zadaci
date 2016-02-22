package zadaci_22_02_2016;

import java.util.InputMismatchException;

public class FibonacciNumbers {
	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		//base cases
		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else {
			// calculates the number by iteration
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
		}
		return currentFib;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user input
			System.out.print("Enter an index for a Fibonacci number: ");
			int index = input.nextInt();

			// displays the number
			System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		}
	}

}
