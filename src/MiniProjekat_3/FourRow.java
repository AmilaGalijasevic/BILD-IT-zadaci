package MiniProjekat_3;

public class FourRow {

	public static boolean fillGame(char[][] position, int column, char color) {
		
		// returns false if the column is filled
		if (position[0][column] != ' ')
			return false;

		// checks columns
		for (int row = 0; row < 7; row++) {
			// if the position isnt filled
			if (position[row][column] != ' ') {
				// puts the letter on top of the current one.
				position[row - 1][column] = color;
				return true;
			}
		}
		// places the letter on the bottom
		position[6][column] = color;
		return true;
	}

	private static char rowWinner(char[][] position) {
		for (int row = 0; row < 7; row++) {
			int count = 0;
			// checks if the position in row is filled
			for (int column = 1; column < 7; column++) {
				if (position[row][column] != ' ' && position[row][column] == position[row][column - 1]) {
					count++;
				} else {
					count = 1;
				}
				// if the counter is bigger three
				if (count > 3) {
					// returns the color of the winner
					return position[row][column];
				}
			}
		}
		// if there are no winners in rows returns space
		return ' ';

	}

	private static char columnWinner(char[][] position) {

		for (int column = 0; column < 7; column++) {
			int count = 0;
			// checks if the position in column is filled
			for (int row = 1; row < 7; row++) {
				if (position[row][column] != ' ' && position[row][column] == position[row - 1][column]) {
					count++;
				} else {
					count = 1;
				}
				// if there are 4
				if (count >3) {
					// returns the color of the winner
					return position[row][column];
				}
			}
		}
		// returns space if nobody won
		return ' ';
	}

	private static char diagonalWinner(char[][] position) {
		// checks diagonals from left to bottom
		for (int column = 0; column < 7; column++) {
			int count = 0;
			// starts with the first row
			for (int row = 1; row < 7; row++) {
				// if its out of range breaks loop for search
				if (column + row >= 7) {
					break;
				}
				// checks for same letters in diagonal and counts them
				if (position[row][column + row] != ' ' && position[row - 1][column + row - 1] == position[row][column + row]) {
					count++;
				} else {
					count = 1;
				}
				if (count >3)
					return position[row][column + row];
			}
		}

		// checks diagonals that go left from rows
		for (int row = 0; row < 7; row++) {
			int count = 0;
			// starts with first column
			for (int column = 1; column < 7; column++) {
				// stops if its out of bounds
				if (column + row >= 7) {
					break;
				}
				// counts and checks the diagonal positions
				if (position[row + column][column] != ' '
						&& position[row + column - 1][column - 1] == position[row + column][column]) {
					count++;
				} else {
					count = 1;
				}
				if (count > 3) {
					return position[row + column][column];
				}
			}
		}

		// checks diagonals from right to bottom
		for (int column = 0; column < 7; column++) {
			int count = 0;
			// starts with first row
			for (int row = 1; row < 7; ++row) {
				// stops if its out of bounds
				if (column - row < 0) {
					break;
				}
				if (position[row][column - row] != ' ' && position[row - 1][column - row + 1] == position[row][column - row]) {
					count++;
				} else {
					count = 1;
				}
				// returns the winning colors
				if (count >3) {
					return position[row][column - row];
				}
			}
		}

		// checks for diagonals that start on left of each row
		for (int row = 0; row < 7; row++) {
			int count = 0;
			for (int column = 5; column >= 0; column--) {
				// stops when column can get outside of the bounds
				if (column - row <= 0) {
					break;
				}
				if (position[column - row][column] != ' '
						&& position[column - row - 1][column + 1] == position[column - row][column]) {
					count++;
				} else {
					count = 1;
				}
				// returns winning color
				if (count >3)
					return position[column - row][column];
			}
		}
		// if it doesn't find winner in diagonals returns space
		return ' ';
	}

	// method that checks winners
	public static char winner(char[][] position) {
		// char that takes the return value of the method for rows
		char winner = rowWinner(position);
		// if the return value istn space returns winner color
		if (winner != ' ') {
			return winner;
		}
		// takes the return value of the method for columns
		winner = columnWinner(position);
		if (winner != ' ') {
			return winner;
		}
		// takes the return value of the method for diagonals
		winner = diagonalWinner(position);
		if (winner != ' ') {
			return winner;
		}
		// checks for empty positions
		for (int i = 0; i < position.length; i++) {
			for (int j = 0; j < position[i].length; j++) {
				if (position[i][j] == ' ') {
					return ' ';
				} else {
					return '-';
				}
			}
		}
		return '-';
	}

	public static void gameMatrix(char[][] position) {
		// printing lines between columns
		for (int row = 0; row < 7; row++) {
			System.out.print("|  ");
			for (int column = 0; column < 7; column++) {
				System.out.print(position[row][column] + "|  ");
			}
			System.out.println();
		}
		// bottom line
		for (int column = 0; column < 7; column++) {
			System.out.print("====");
		}
		System.out.println();
	}

	public static boolean continueGame(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("If you want to play again press 1 \nIf you want to exit press 2: ");
		int check = input.nextInt();
		
		// if the user chooses to play again
		if (check == 1) {
			return true;
		// if they choose exit
		}else{
			System.out.println("Thank you for playing! ");
			System.exit(1);
			return false;	
		}
		
	}

	public static void main(String[] args) {
		try {
			
		java.util.Scanner input = new java.util.Scanner(System.in);
		// 2d array for storing letters
		char[][] position = new char[7][7];

		// fills the array with spaces
		for (int i = 0; i < 7; i++)
			for (int j = 0; j < 7; j++)
				position[i][j] = ' ';
		// calls the method for printing game matrix
		gameMatrix(position);
		// boolean value for checking whose turn is it to play
		boolean red = true;
		// boolean value for continuing the game
		boolean game = true;
		while (game) {
			if (red){
				System.out.println("It's red player turn to play");
			}else{

				System.out.println("It's yellow player turn to play");
			}
			System.out.println("Pick a column! (enter numbers 1-7)");
			int column = input.nextInt();
			
			// if the number is too big or small
			if (column < 1 || column > 7) {
				System.out.println("Wrong input, only numbers 1-7");
				continue;
			}
			// if the column is already filled
			if (red) {
				if (!fillGame(position, column - 1, 'R')) {
					System.out.println("This column is filled! Choose another one.");
					continue;
				}
			} else {
				if (!fillGame(position, column - 1, 'Y')) {
					System.out.println("This column is filled! Choose another one.");
					continue;
				}
			}
			// prints the game matrix with user input
			gameMatrix(position);

			// takes return value of the winner method
			char result = winner(position);
			// if it returns - ,then its a tide
			if (result == '-') {
				System.out.println("It's a tide!");
				if(continueGame(args)){
					main(args);
				}
			} else if (result == 'R') {
				System.out.println("Red player wins!");
				if(continueGame(args)){
					main(args);
				}
			} else if (result == 'Y') {
				System.out.println("Yellow player wins!");
				if(continueGame(args)){
					main(args);
				}
			}
			red = !red;
		}
		input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong");
			main(args);
		}
	}
}
