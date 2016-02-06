package MiniProjekat_3;

import java.util.InputMismatchException;

public class TTT {
	// method for ending options
	public static void options(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("If you want to play again press 1 \nIf you want to exit press 2: ");
		int check = input.nextInt();
		// if the user chooses to play again
		if (check == 1) {
			main(args);
		} else {
			System.out.println("Thank you for playing! ");
			System.exit(1);
		}
		input.close();
	}

	public static void gameMatrix(String[][] ttt) {
		// prints the game and the filled position
		System.out.print("____________\n");
		for (int i = 0; i < ttt.length; i++) {
			for (int j = 0; j < ttt[i].length; j++) {
				if (ttt[i][j] == null) {
					System.out.print("___|");
				} else {
					System.out.print(ttt[i][j]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// array for storing x and o's
			String[][] ttt = new String[3][3];
			String x = " X |";
			String o = " O |";
			String player = "";
			// counter for checking the result
			int count1 = 0;
			boolean game = true;
			boolean p1 = true;
			// starts game
			while (game) {
				// player x plays
				if (p1) {
					System.out.println("\nPlayer X:");
					player = x;
				} else {
					// player o
					System.out.println("\nPlayer O:");
					player = o;
				}
				System.out.println("Enter a row (0, 1, or 2): ");
				System.out.println("Enter a column (0, 1, or 2):");
				int playerRow = input.nextInt();
				int playerCol = input.nextInt();
				// if the numbers are wrong
				if (playerRow >= 3 || playerRow < 0) {
					System.out.println("Wrong input, only numbers 0, 1, 2.");
					continue;
				}
				if (playerCol >= 3 || playerCol < 0) {
					System.out.println("Wrong input, only numbers 0, 1, 2.");
					continue;
				}

				// if the position is filled
				if (ttt[playerRow][playerCol] != null) {
					System.out.println("Filled, try another position: ");
					continue;
				}
				if (ttt[playerRow][playerCol] != null) {
					for (int i = 0; i < 1; i++) {
						for (int j = 0; j < ttt.length; j++) {
							ttt[playerRow][playerCol] = player;
							count1++;
						}
					}
					// if the position is empty
				} else {

					for (int i = 0; i < 1; i++) {
						for (int j = 0; j < ttt.length; j++) {
							ttt[playerRow][playerCol] = player;
							count1++;
						}
					}

				}
				// prints the game
				gameMatrix(ttt);

				// conditions if the winner is x
				if (ttt[0][0] == x && ttt[0][1] == x && ttt[0][2] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[1][0] == x && ttt[1][1] == x && ttt[1][2] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[2][0] == x && ttt[2][1] == x && ttt[2][2] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[0][0] == x && ttt[1][0] == x && ttt[2][0] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[0][1] == x && ttt[1][1] == x && ttt[2][1] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[0][2] == x && ttt[1][2] == x && ttt[2][2] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[0][0] == x && ttt[1][1] == x && ttt[2][2] == x) {
					System.out.println("Player X has won!");
					options(args);
				} else if (ttt[2][0] == x && ttt[1][1] == x && ttt[0][2] == x) {
					System.out.println("Player X has won!");
					options(args);
					// conditions if the winner is o
				} else if (ttt[1][0] == o && ttt[1][1] == o && ttt[1][2] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[2][0] == o && ttt[2][1] == o && ttt[2][2] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[0][0] == o && ttt[1][0] == o && ttt[2][0] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[0][1] == o && ttt[1][1] == o && ttt[2][1] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[0][2] == o && ttt[1][2] == o && ttt[2][2] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[0][0] == o && ttt[1][1] == o && ttt[2][2] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (ttt[2][0] == o && ttt[1][1] == o && ttt[0][2] == o) {
					System.out.println("Player O has won!");
					options(args);
				} else if (count1 >= 27) {
					System.out.println("It's a tide!");
					options(args);
				}

				p1 = !p1;
			}
			input.close();
			// catches input and index out of bounds exceptions
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input\nGame starts again");
			main(args);
		}

	}
}
