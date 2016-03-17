package MiniProjekat_4;

import java.util.*;

public class Battleship {
	static Scanner input = new java.util.Scanner(System.in);
	static String[][] grid = new String[11][11];
	static String[][] grid2 = new String[11][11];
	static String[][] grid3 = new String[11][11];
	static String[][] grid4 = new String[11][11];
	static String spot = " X |";
	static int row = 0;
	static int col = 0;
	static int count = 0;
	static int count2 = 0;

	// fills the game with user inputs
	public static String[][] fillGrid1() {
		try {
			// user enters the position of their ships
			System.out.println(
					"Pick a position to place your big ship (5 x's long).\nEnter numbers from 1 - 10 five times for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;

			System.out.println(
					"Pick a position to place your 4 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;

			System.out.println(
					"Pick a position to place your 3 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;

			System.out.println(
					"Pick a position to place your second 3 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;

			System.out.println(
					"Pick a position to place your 2 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid[row][col] = spot;

		} catch (IndexOutOfBoundsException ey) {
			System.out.println("Wrong input");
			fillGrid1();
		}
		return grid;
	}

	// fills the second players grid
	public static String[][] fillGrid2() {
		try {
			// user chooses the place for ships
			System.out.println(
					"Pick a position to place your big ship (5 x's long).\nEnter numbers from 1 - 10 five times for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;

			System.out.println(
					"Pick a position to place your 4 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;

			System.out.println(
					"Pick a position to place your 3 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;

			System.out.println(
					"Pick a position to place your second 3 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;

			System.out.println(
					"Pick a position to place your 2 x's long ship.\nEnter numbers from 1 - 10 for row and columns:");
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
			row = input.nextInt();
			col = input.nextInt();
			grid2[row][col] = spot;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Wrong input");
			fillGrid2();
		}
		return grid2;
	}

	// makes the grid for player two
	public static String[][] grid2() {
		System.out.print("___________________________________________\n");
		for (int i = 0; i < grid2.length; i++) {
			for (int j = 0; j < grid2[i].length; j++) {
				grid2[0][1] = " 1 |";
				grid2[0][2] = " 2 |";
				grid2[0][3] = " 3 |";
				grid2[0][4] = " 4 |";
				grid2[0][5] = " 5 |";
				grid2[0][6] = " 6 |";
				grid2[0][7] = " 7 |";
				grid2[0][8] = " 8 |";
				grid2[0][9] = " 9 |";
				grid2[0][10] = " 10|";

				grid2[1][0] = " 1 |";
				grid2[2][0] = " 2 |";
				grid2[3][0] = " 3 |";
				grid2[4][0] = " 4 |";
				grid2[5][0] = " 5 |";
				grid2[6][0] = " 6 |";
				grid2[7][0] = " 7 |";
				grid2[8][0] = " 8 |";
				grid2[9][0] = " 9 |";
				grid2[10][0] = " 10|";

			}
		}
		for (int i = 0; i < grid2.length; i++) {
			for (int j = 0; j < grid2[i].length; j++) {
				if (grid2[i][j] == null) {
					System.out.print(" _ |");
				} else {
					System.out.print(grid2[i][j]);
				}
			}
			System.out.println();
		}
		return grid2;
	}

	// makes the grid for player one's correct guesses
	public static String[][] grid3() {

		System.out.print("___________________________________________\n");
		for (int i = 0; i < grid3.length; i++) {
			for (int j = 0; j < grid3[i].length; j++) {
				grid3[0][1] = " 1 |";
				grid3[0][2] = " 2 |";
				grid3[0][3] = " 3 |";
				grid3[0][4] = " 4 |";
				grid3[0][5] = " 5 |";
				grid3[0][6] = " 6 |";
				grid3[0][7] = " 7 |";
				grid3[0][8] = " 8 |";
				grid3[0][9] = " 9 |";
				grid3[0][10] = " 10|";

				grid3[1][0] = " 1 |";
				grid3[2][0] = " 2 |";
				grid3[3][0] = " 3 |";
				grid3[4][0] = " 4 |";
				grid3[5][0] = " 5 |";
				grid3[6][0] = " 6 |";
				grid3[7][0] = " 7 |";
				grid3[8][0] = " 8 |";
				grid3[9][0] = " 9 |";
				grid3[10][0] = " 10|";

			}
		}
		for (int i = 0; i < grid2.length; i++) {
			for (int j = 0; j < grid2[i].length; j++) {
				if (grid3[i][j] == null) {
					System.out.print(" _ |");
				} else {
					System.out.print(grid3[i][j]);
				}
			}
			System.out.println();
		}
		return grid3;
	}

	// makes the grid for player two's correct guesses
	public static String[][] grid4() {
		System.out.print("___________________________________________\n");
		for (int i = 0; i < grid3.length; i++) {
			for (int j = 0; j < grid3[i].length; j++) {
				grid4[0][1] = " 1 |";
				grid4[0][2] = " 2 |";
				grid4[0][3] = " 3 |";
				grid4[0][4] = " 4 |";
				grid4[0][5] = " 5 |";
				grid4[0][6] = " 6 |";
				grid4[0][7] = " 7 |";
				grid4[0][8] = " 8 |";
				grid4[0][9] = " 9 |";
				grid4[0][10] = " 10|";

				grid4[1][0] = " 1 |";
				grid4[2][0] = " 2 |";
				grid4[3][0] = " 3 |";
				grid4[4][0] = " 4 |";
				grid4[5][0] = " 5 |";
				grid4[6][0] = " 6 |";
				grid4[7][0] = " 7 |";
				grid4[8][0] = " 8 |";
				grid4[9][0] = " 9 |";
				grid[10][0] = " 10|";

			}
		}
		for (int i = 0; i < grid4.length; i++) {
			for (int j = 0; j < grid4[i].length; j++) {
				if (grid4[i][j] == null) {
					System.out.print(" _ |");
				} else {
					System.out.print(grid4[i][j]);
				}
			}
			System.out.println();
		}
		return grid4;
	}

	public static String[][] grid() {
		// first player grid
		System.out.print("___________________________________________\n");
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[0][1] = " 1 |";
				grid[0][2] = " 2 |";
				grid[0][3] = " 3 |";
				grid[0][4] = " 4 |";
				grid[0][5] = " 5 |";
				grid[0][6] = " 6 |";
				grid[0][7] = " 7 |";
				grid[0][8] = " 8 |";
				grid[0][9] = " 9 |";
				grid[0][10] = " 10|";

				grid[1][0] = " 1 |";
				grid[2][0] = " 2 |";
				grid[3][0] = " 3 |";
				grid[4][0] = " 4 |";
				grid[5][0] = " 5 |";
				grid[6][0] = " 6 |";
				grid[7][0] = " 7 |";
				grid[8][0] = " 8 |";
				grid[9][0] = " 9 |";
				grid[10][0] = " 10|";

			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == null) {
					System.out.print(" _ |");
				} else {
					System.out.print(grid[i][j]);
				}
			}
			System.out.println();
		}
		return grid;
	}

	// method for guesses
	public static void guesses() {
		System.out.println("Guess the position of the enemies ship! Enter position:");
		row = input.nextInt();
		col = input.nextInt();

	}

	// checks ships position
	public static void checkShipPosition() {
		if (grid2[row][col] == null) {
			System.out.println("No ships there");
		} else {
			// prints in grids
			grid2[row][col] = "bum!";
			grid3[row][col] = "bum!";
			System.out.println("BOOM!");
		}

	}

	// checks position for second player
	public static void checkShipPosition2() {
		if (grid[row][col] == null) {
			System.out.println("No ships there");
		} else {
			grid[row][col] = "bum!";
			grid4[row][col] = "bum!";
			System.out.println("BOOM!");
		}

	}

	public static void checkWinner() {
		// counts the correct guesses
		if (grid[row][col] == "bum!") {
			count++;
		}
		if (count == 17) {
			System.out.println("Victory!\nPlayer two wins!");
			// displays the winning grid
			grid();
			System.exit(1);

		}
	}

	public static void checkWinner2() {
		// counts the correct guesses
		if (grid2[row][col] == "bum!") {
			count2++;
		}
		if (count2 == 17) {
			System.out.println("Victory!\nPlayer one wins!");
			// displays the grid
			grid2();
			System.exit(1);
		}
	}

	public static void main(String[] args) {

		try {
			// player one
			boolean p1 = true;
			// player two
			boolean p2 = true;
			boolean game = true;
			// calls the methods
			grid();
			fillGrid1();
			grid();
			fillGrid2();
			grid2();
			while (game) {
				if (p1) {

					// player one methods
					System.out.println();
					System.out.println("Player 1: ");
					guesses();
					System.out.println();
					checkShipPosition();
					grid4();
					checkWinner2();
				}
				
				// player two methods
				if (p2) {
					System.out.println();
					System.out.println("Player 2: ");
					guesses();
					System.out.println();
					checkShipPosition2();
					grid3();
					checkWinner();
				}

			}
			p1 = !p1;
		} catch (Exception ey) {
			System.out.println("Something went wrong");
		}
	}
}
