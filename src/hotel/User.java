package hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	public String Name;
	public String userName;
	public String password;

	public User() {

	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void checkBalance(String[] args) throws SQLException {
		Connection con = Admin.conect();
		Statement statement = con.createStatement();
		Admin a = new Admin();
		// searches by user name
		String query = "SELECT * from hotel.userinfo where UserName= '" + a.getUserName() + "';";
		ResultSet result = statement.executeQuery(query);
		while (result.next()) {
			// prints balance
			System.out.println("Your balance is: " + result.getString("Balance") + " KM");
		}
		Hotel.optionsUser(args);
	}

	public void reserveService(String[] args) throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Connection con = Admin.conect();
		Statement statement = con.createStatement();
		System.out.println("Select a service you want to reserve:");
		System.out.println("1 - Gym;");
		System.out.println("2 - Sauna;");
		System.out.println("3 - Restaurant;");
		System.out.println("4 - Cinema;");
		System.out.println("5 - Pool.");
		int choice = input.nextInt();
		Admin a = new Admin();
		int price = 0;
		String query1 = "SELECT * from hotel.userinfo where UserName = '" + a.getUserName() + "';";
		ResultSet result1 = statement.executeQuery(query1);
		int balance = 0;
		while (result1.next()) {
			balance = result1.getInt(14);
		}
		// reserves service and updates balance depending on the chosen option
		switch (choice) {
		case 1: {
			System.out.println("Gym costs:  ");
			String query = "SELECT * from hotel.services where services = 'gym';";
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				price = result.getInt(3);
			}
			System.out.print(price);

			String query2 = "update hotel.userinfo set Balance = " + (price + balance) + " where UserName = '"
					+ a.getUserName() + "';";
			statement.executeUpdate(query2);
			System.out.println("Service succesfully reserved");
			break;

		}
		case 2: {
			System.out.print("Sauna costs: ");
			String query = "SELECT * from hotel.services where services = 'sauna';";
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				price = result.getInt(3);
			}
			System.out.print(price);
			String query2 = "update hotel.userinfo set Balance = " + (price + balance) + " where UserName = '"
					+ a.getUserName() + "';";
			statement.executeUpdate(query2);
			System.out.println("Service succesfully reserved");
			break;
		}
		case 3: {
			System.out.print("Restaurant costs:  ");
			String query = "SELECT * from hotel.services where services = 'restaurant';";
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				price = result.getInt(3);
			}
			System.out.print(price + "\n");
			String query2 = "update hotel.userinfo set Balance = " + (price + balance) + " where UserName = '"
					+ a.getUserName() + "';";
			statement.executeUpdate(query2);
			System.out.println("Service succesfully reserved");
			break;
		}
		case 4: {
			System.out.println("Cinema costs:  ");
			String query = "SELECT * from hotel.services where services = 'cinema';";
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				price = result.getInt(3);
			}
			System.out.print(price);
			String query2 = "update hotel.userinfo set Balance = " + (price + balance) + " where UserName = '"
					+ a.getUserName() + "';";
			statement.executeUpdate(query2);
			System.out.println("Service succesfully reserved");
			break;
		}
		case 5: {
			System.out.println("Pool costs:  ");
			String query = "SELECT * from hotel.services where services = 'pool';";
			ResultSet result = statement.executeQuery(query);
			while (result.next()) {
				price = result.getInt(3);
			}
			System.out.print(price);
			String query2 = "update hotel.userinfo set Balance = " + (price + balance) + " where UserName = '"
					+ a.getUserName() + "';";
			statement.executeUpdate(query2);
			System.out.println("Service succesfully reserved");
			break;
		}
		}
		Hotel.optionsUser(args);
		input.close();
	}

	public void changeRoom(String[] args) throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		Connection con = Admin.conect();
		Statement statement = con.createStatement();
		System.out.println("Choose a room: ");
		System.out.println("1 - One-bedroom;");
		System.out.println("2 - Two-bedroom;");
		System.out.println("3 - Apartmant;");
		int choice = input.nextInt();
		Admin a = new Admin();
		switch (choice) {
		// changes the room depending on the chosen option
		case 1: {
			String query = "update hotel.userinfo set RoomType = 'one-bedroom' where UserName = '" + a.getUserName()
					+ "';";
			statement.executeUpdate(query);
			break;
		}
		case 2: {
			String query = "update hotel.userinfo set RoomType = 'two-bedroom' where UserName = '" + a.getUserName()
					+ "';";
			statement.executeUpdate(query);

			break;
		}
		case 3: {
			String query = "update hotel.userinfo set RoomType = 'apartmant' where UserName = '" + a.getUserName()
					+ "';";
			statement.executeUpdate(query);
			break;
		}
		default:
			Hotel.optionsUser(args);
			break;
		}
		System.out.println("Succsessfully changed");
		Hotel.optionsUser(args);
		input.close();
	}

	public void logOut(String[] args) throws SQLException {
		Connection con = Admin.conect();
		Admin a = new Admin();
		Statement statement = con.createStatement();
		// logs out user
		String query = "update hotel.userinfo set LoggedIn = 'not' where UserName = '" + a.getUserName() + "';";
		statement.executeUpdate(query);
		System.out.println("Logged out. Goodbye\n");
		Hotel.main(args);
	}

}
