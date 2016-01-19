package zadaci_19_01_2016;

import java.util.InputMismatchException;

public class Cards {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Pick a card (enter a number between 1-52)");
			int card = input.nextInt();
			if (card <= 52) {
				// numbers for cards form 1 to 14
				card = 1 + (int) (Math.random() * 14);
				System.out.println("Your card is: ");
				// if card value is 1 or 11 prints A
				if (card == 1) {
					System.out.print("A");
				} else if (card == 11) {
					System.out.print("A");
				}
				// if card 12, 13, 14 prints J,Q,K respectively
				else if (card == 12) {
					System.out.print("J");
				} else if (card == 13) {
					System.out.print("Q");
				} else if (card == 14) {
					System.out.print("K");
				} else {
					// prints other numbers
					System.out.print(card);
				}
				// if entered number is bigger than 52 displays the message and
				// exits the system
			} else {
				System.out.println("Pick a smaller number");
				System.exit(1);
			}
			// string wit card names
			String[] heart = { "Heart", "Ace", "Spade", "Diamond" };
			// randomizes the positions of the array
			int position = (int) (Math.random() * heart.length);
			// displays it
			System.out.print(" " + heart[position] + " ");
			// catches ex.
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
