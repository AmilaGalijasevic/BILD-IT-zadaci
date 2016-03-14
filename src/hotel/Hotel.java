package hotel;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hotel extends Admin {
	// method for administrator options
	public static void optionsAdmin(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);

		try {
			// choices
			System.out.println("\nChoose an option, enter a number:");
			System.out.println("1 - If you want to register a new user;");
			System.out.println("2 - If you want to change user info;");
			System.out.println("3 - If you want to print a receipt;");
			System.out.println("4 - If you want to checkout user;");
			System.out.println("5 - If you want to check logged in users, log out users or shut down the sistem;");
			System.out.println("6 - If you want to search database;");
			System.out.println("7 - If you want to log out.");
			int choice = input.nextInt();
			Admin admin = new Admin();

			// calls different methods depending on choice
			switch (choice) {
			case 1: {
				admin.registration(args);
				break;
			}
			case 2: {
				admin.changeInfo(args);
				break;
			}
			case 3: {
				admin.printReceipt(args);
				break;
			}
			case 4: {
				admin.checkOutUser(args);
				break;
			}
			case 5: {
				admin.checkLoggedInUsers(args);
				break;
			}
			case 6: {
				admin.search(args);
				break;
			}
			case 7: {
				main(args);;
			}
			default: {
				Hotel.optionsAdmin(args);
			}
			}

			input.close();
		} catch (Exception ee) {
			System.out.println("Wrong input, try again: ");
			optionsAdmin(args);
		}

	}

	public static void optionsUser(String[] args) throws SQLException {
		int choice = 0;
		try (Scanner input = new Scanner(System.in);) {
			System.out.println("\nChoose an option, enter a number:");
			System.out.println("1 - If you want to check your balance;");
			System.out.println("2 - If you want to reserve new service;");
			System.out.println("3 - If you want to change rooms;");
			System.out.println("4 - If you want to log out ;");
			choice = input.nextInt();
			User user = new User();
			//calls methods
			switch (choice) {
			case 1: {
				user.checkBalance(args);
				break;
			}
			case 2: {
				user.reserveService(args);
				break;
			}
			case 3: {
				user.changeRoom(args);
				break;
			}
			case 4: {
				user.logOut(args);
				main(args);
				break;
			}
			default: {
				optionsUser(args);
			}
			}
		} catch (InputMismatchException e) {
			System.out.println("Wrong input, try again: ");
			optionsUser(args);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			Admin a = new Admin();
			// calls the method that connects to the database
			a.connected(args);
			input.close();
		} catch (SQLException e) {
			System.out.println("Something went wrong, try again");
			main(args);
		}
	}
}
