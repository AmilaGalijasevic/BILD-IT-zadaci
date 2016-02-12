package zadaci_12_02_2016;

import java.util.InputMismatchException;

public class OutOfBounds {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// user input
			System.out.println("Enter wanted index");
			int a = input.nextInt();
			// array to store 100 numbers
			int[] array = new int[100];
			for (int i = 1; i < array.length; i++) {
				array[i] = (int) (Math.random() * 100);
			}
			// prints the number in wanted index
			System.out.println(array[a]);
			input.close();
			// catches exceptions
		} catch (IndexOutOfBoundsException ejj) {
			System.out.println("Wrong number, try again");
			main(args);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}

	}

}
