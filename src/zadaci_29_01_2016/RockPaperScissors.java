package zadaci_29_01_2016;

public class RockPaperScissors {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			int rock = 0;
			int paper = 1;
			int scissors = 2;
			// random numbers from 0-3
			int comp = (int) (Math.random() * 3);
			System.out.println("Lets play a game of Rock Paper Scissors!");
			System.out.println("Enter 0 for rock, 1 for paper, and 2 for scissors:");

			int check = 0;
			while (check != 5) {
				int user = input.nextInt();
				// checks user input
				while (user > 2) {
					// if it's invalid warns the user
					System.out.println("Invalid input, only numbers 0, 1, 2.");
					user = input.nextInt();
				}
				// generates numbers
				System.out.println("Computer chosed " + comp);
				// if input and generated number are equal
				if (user == comp) {
					System.out.println("It's equal!");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						// plays the game again
						main(args);
					}
					if (user == 5) {
						// exits
						System.exit(1);
					}
					// computer wins
				} else if (comp == rock && user == scissors) {
					System.out.println("You lose...");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}

				}
				// user wins
				else if (comp == rock && user == paper) {
					System.out.println("You win!");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}
					// user wins
				} else if (comp == paper && user == scissors) {
					System.out.println("You win!");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}
				}
				// computer wins
				else if (comp == paper && user == rock) {
					System.out.println("You lose...");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}
					// computer wins
				} else if (comp == scissors && user == paper) {
					System.out.println("You lose...");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}
					// user wins
				} else if (comp == scissors && user == rock) {
					System.out.println("You win!");
					System.out.println("If you want to play again press 4, if you want to exit press 5");
					check = input.nextInt();
					if (check == 4) {
						main(args);
					}
					if (check == 5) {
						System.exit(1);
					}
				}
				
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong, try again:\n");
			main(args);
		}
	}
}
