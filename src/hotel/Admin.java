package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Admin {
	public int ID;
	public String Name;
	public String LastName;
	public String Sex;
	public String IDNum;
	public int years;
	public int RoomNum;
	public static String UserName;
	public String Password;
	public String RoomType;
	public String CheckInTime;
	public String CheckOutTime;
	public String Service;
	public int Balance;
	public String LoggedIn;
	private static Connection conection;

	public Admin() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getIDNum() {
		return IDNum;
	}

	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	// creates date
	public String getCheckInTime() {
		Date date = new Date(System.currentTimeMillis());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}

	// creates checkout date
	public String getCheckOutTime() {
		Date date = new Date(System.currentTimeMillis());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);

	}

	public void setCheckOutTime(String checkOutTime) {
		CheckOutTime = checkOutTime;
	}

	public String getService() {
		return Service;
	}

	public void setService(String service) {
		Service = service;
	}

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String isLoggedIn() {
		return LoggedIn;
	}

	public void setLoggedIn(String loggedIn) {
		LoggedIn = loggedIn;
	}

	public static String lineSl() {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		String naziv = unos.nextLine().toUpperCase();
		unos.close();
		return naziv;

	}

	public static int lineBr() {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		int naziv = unos.nextInt();
		unos.close();
		return naziv;

	}

	// connects to the database
	public static Connection conect() throws SQLException {
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		return conection;

	}

	public void connected(String[] args) throws SQLException {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Welcome to Hotel menagment\nEnter user name:");
			UserName = input.next();
			System.out.println("Enter password");
			Password = input.next();
			// connects to database
			conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			Statement statement = conection.createStatement();
			String query = "SELECT * from hotel.userinfo where UserName = '" + UserName + "';";
			ResultSet result = statement.executeQuery(query);
			String usern = "";
			String userp = "";
			while (result.next()) {
				usern = result.getString(8);
				userp = result.getString(9);
			}
			//checks user name and password
			if (UserName.equals("admin") && Password.equals("adminpass")) {
				Hotel.optionsAdmin(args);
			} else if (UserName.equals(usern) && Password.equals(userp)) {
				Hotel.optionsUser(args);
			} else {
				System.out.println("User name or password cannot be found");
				connected(args);
			}
			input.close();
		} catch (SQLException e) {
			System.out.println("Something went wrong, try again:");
			connected(args);
		}
	}

	// metoda za registraciju korisnika
	public void registration(String[] args) throws SQLException {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		String query;
		System.out.println("Enter user information");
		// System.out.println("ID:");
		// ID = unos.nextInt();
		System.out.println("Name:");
		Name = unos.next();
		System.out.println("Lastname:");
		LastName = unos.next();
		System.out.println("Sex:");
		Sex = unos.next();
		System.out.println("ID number:");
		IDNum = unos.next();
		System.out.println("Age:");
		years = unos.nextInt();
		System.out.println("User name:");
		UserName = unos.next();
		System.out.println("Password:");
		Password = unos.next();
		System.out.println("Room number:");
		RoomNum = unos.nextInt();
		System.out.println("Room type:\n1 - one-bedroom;\n2 - two-bedroom;\n3 - apartmant. ");
		int c = unos.nextInt();
		switch (c) {
		case 1: {
			RoomType = "one-bedroom";
			break;
		}
		case 2: {
			RoomType = "two-bedroom";
			break;
		}
		case 3: {
			RoomType = "apartmant";
			break;
		}
		}
		System.out.println("Check in time entered");
		CheckInTime = getCheckInTime();
		LoggedIn = "yes";
		// connection and statement
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		//searches for room number
		String query3 = "Select * from hotel.userinfo where RoomNum =" + RoomNum + ";";
		ResultSet result2 = statement.executeQuery(query3);
		int rnum = 0;
		while (result2.next()) {
			rnum = result2.getInt(7);
		}
		//checks room number
		if (rnum == RoomNum) {
			System.out.println("Room in use, try again");
			registration(args);
		}
		//searches room type
		String query1 = "Select * from hotel.services where services ='" + RoomType + "';";
		ResultSet result = statement.executeQuery(query1);
		int cost = 0;
		int available = 0;
		while (result.next()) {
			cost = result.getInt(3);
			available = result.getInt(4);
		}
		//checks if its available
		if (available > 0) {
			String query2 = "update hotel.services set Availability=" + (available - 1) + "   where services ='"
					+ RoomType + "';";
			statement.executeUpdate(query2);
		} else {
			System.out.println("Not available\n");
			registration(args);
		}
		// query to insert the inputed values into the data base
		query = "INSERT INTO hotel.userinfo (ID, Name, LastName, Sex, IDNum, years, RoomNum, RoomType, UserName, Password,CheckInTime, LoggedIn, Balance ) VALUES ("
				+ ID + ", '" + Name + "', '" + LastName + "', '" + Sex + "', " + IDNum + ", " + years + ", " + RoomNum
				+ ", '" + RoomType + "', '" + UserName + "', '" + Password + "', '" + CheckInTime + "', '" + LoggedIn
				+ "', " + cost + ");";

		// executes query
		statement.executeUpdate(query);
		System.out.println("User successfully registreted");
		Hotel.optionsAdmin(args);
		unos.close();

	}

	public void changeInfo(String[] args) throws SQLException {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		// user inputs
		System.out.println("Enter a column you want to update:");
		String col = unos.next();
		System.out.println("Enter ID: ");
		int ID = unos.nextInt();
		System.out.println("Enter your value:");
		String value = unos.next();
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		// updates the user info
		String query = "update userinfo set " + col + "= '" + value + "' where ID = " + ID + ";";
		statement.executeUpdate(query);
		System.out.println("Successfully updated");
		Hotel.optionsAdmin(args);
		unos.close();
	}

	public void printReceipt(String[] args) throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		System.out.println("Enter User name");
		String un = input.next();
		// searches the base by user name
		String query = "SELECT * from hotel.userinfo where UserName = '" + un + "';";
		ResultSet result = statement.executeQuery(query);
		String balance = "";
		String otherServices = "";
		String roomtype = "";
		// reeds the result
		while (result.next()) {
			balance = result.getString(14);
			roomtype = result.getString(10);
			otherServices = result.getString(13);
		}
		String query1 = "SELECT * from hotel.services where Services = '" + roomtype + "';";
		ResultSet result1 = statement.executeQuery(query1);
		String cost = "";
		while (result1.next()) {
			cost = result1.getString(3);
		}
		System.out.println("\nRoom type: \t\t" + roomtype + "\t\t" + cost);
		System.out.println(
				"Other services: \t" + otherServices + "\t\t" + (Integer.parseInt(balance) - Integer.parseInt(cost)));
		System.out.println("---------------------------------------------------");
		System.out.println("Total: \t\t\t\t\t\t" + balance + "\n");
		Hotel.optionsAdmin(args);
		input.close();
	}

	public void checkOutUser(String[] args) throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		System.out.println();
		System.out.println("Enter ID for the user you want to checkout:");
		int id = input.nextInt();

		CheckOutTime = getCheckOutTime();
		//inputs the checkout time
		String q = "update userinfo set CheckOutTime= '" + CheckOutTime + "' where ID = " + id + ";";
		//updates the logged in column
		String q1 = "update userinfo set LoggedIn= 'not' where ID = " + id + ";";
		//moves to archive
		String queryArhiva = "insert INTO archive select*from hotel.userinfo WHERE ID=" + id + ";";
		// deletes the info
		String query = "DELETE userinfo FROM hotel.userinfo WHERE ID =" + id + ";";
		statement.executeUpdate(q);
		statement.executeUpdate(q1);
		statement.executeUpdate(queryArhiva);
		statement.executeUpdate(query);
		System.out.println("User succesfully checked out and archived");
		Hotel.optionsAdmin(args);
		input.close();
	}

	public void checkLoggedInUsers(String[] args) throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		System.out.println(
				"Choose: \n1 - If you want to check logged in users;\n2 - If you want to log out all users;\n3 - If you want to log out specific user\n4 - If you want to shut down the system;");
		int choose = input.nextInt();
		switch (choose) {
		case 1: {
			//searches for logged in users
			String query = "select * from hotel.userinfo where LoggedIn = 'yes';";
			ResultSet result = statement.executeQuery(query);
			System.out.println("Logged in users:");
			while (result.next()) {
				System.out.println(result.getString(2) + " " + result.getString(3));

			}
			System.out.println("No other logged in users");
			break;
		}
		case 2: {
			//logs out users
			String query = "update hotel.userinfo set LoggedIn= 'not';";
			statement.executeUpdate(query);
			System.out.println("You succsesfully logged out all users");
			break;
		}
		case 3: {
			//logs out a specific user
			System.out.println("Enter ID for the user you want to log out:");
			int id = input.nextInt();
			String query = "update hotel.userinfo set LoggedIn='not' where ID =" + id + ";";
			statement.executeUpdate(query);
			System.out.println("User was successfully logged out");
			break;
		}
		case 4: {
			//exits the system
			System.out.println("System shuting down. Goodbye!");
			System.exit(1);
		}
		default: {
			Hotel.optionsAdmin(args);
		}
		}
		Hotel.optionsAdmin(args);
		input.close();
	}

	// metoda zapretragu korisnika
	public void search(String[] args) throws SQLException {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		System.out.println("Enter a table you want to search:");
		String table = unos.next();
		System.out.println("Search user by :");
		String search = unos.next();
		System.out.println("Enter the value for that cathegory");
		String value = unos.next();
		Connection konekcija = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "root");
		Statement statement = konekcija.createStatement();
		String query;
		//searches the tables with inputed values
		query = "SELECT * FROM hotel." + table + " where " + search + "= '" + value + "';";
		ResultSet resultat = statement.executeQuery(query);
		// ispis
		while (resultat.next()) {
			System.out.println("ID: " + resultat.getString(1) + "\nName: " + resultat.getString(2) + "\nLastname: "
					+ resultat.getString(3) + "\nSex: " + resultat.getString(4) + "\nID number: "
					+ resultat.getString(5) + "\nAge: " + resultat.getString(6) + "\nRoom number: "
					+ resultat.getString(7) + "\nUser name: " + resultat.getString(8) + "\nPassword: "
					+ resultat.getString(9) + "\nRoom type: " + resultat.getString(10) + "\nCheck in: "
					+ resultat.getString(11) + "\nCheck out: " + resultat.getString(12) + "\nServices: "
					+ resultat.getString(13) + "\nBalance: " + resultat.getString(14) + "\nLogged in: "
					+ resultat.getString(15));

		}
		Hotel.optionsAdmin(args);
		unos.close();

	}
}
