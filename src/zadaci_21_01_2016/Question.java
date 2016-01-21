package zadaci_21_01_2016;

import java.util.InputMismatchException;

public class Question {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// three random numbers
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 20);
		int c = (int) (Math.random() * 10);
		// prints the question
		System.out.println(a + "+" + b + "+" + c + "=?");
		int answer = input.nextInt();
		// while answer isn't correct prints the question again
		while (answer != a + b + c) {
			System.out.println("Incorrect answer try again: ");
			System.out.println(a + "+" + b + "+" + c + "=?");
			answer = input.nextInt();
		}

		System.out.println("Correct answer!");
		try {

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
