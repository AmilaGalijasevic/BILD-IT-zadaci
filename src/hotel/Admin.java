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
	public String UserName;
	public String Password;
	public String RoomType;
	public String CheckInTime;
	public String CheckOutTime;
	public String Service;
	public int Balance;
	public String LoggedIn;
	Connection conection;

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

	public String getCheckInTime() {
		Date date = new Date(System.currentTimeMillis());
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public void setCheckInTime(String checkInTime) {
		CheckInTime = checkInTime;
	}

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

	public void connected(String[] args) throws SQLException {

		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Welcome to Hotel menagment\n Enter user name:");
			String userName = input.next();
			System.out.println("Enter password");
			String pass = input.next();
			// connects to database
			Connection conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			Statement statement = conection.createStatement();
			String query = "SELECT * from hotel.userinfo where UserName = '" + userName + "';";
			ResultSet result = statement.executeQuery(query);
			String usern = "";
			String userp = "";
			while (result.next()) {
				usern = result.getString(8);
				userp = result.getString(9);
			}
			if (userName.equals("admin") && pass.equals("adminpass")) {
				Hotel.optionsAdmin(args);
			} else if (userName.equals(usern) && pass.equals(userp)) {
				Hotel.optionsUser();
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
	public void registration() throws SQLException {
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
		System.out.println("Room type:");
		RoomType = unos.next();
		System.out.println("Check in time entered");
		CheckInTime = getCheckInTime();
		System.out.println("Service:");
		Service = unos.next();
		LoggedIn = "yes";
		// connection and statement
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		// query to insert the inputed values into the data base
		query = "INSERT INTO hotel.userinfo (ID, Name, LastName, Sex, IDNum, years, RoomNum, RoomType, UserName, Password,CheckInTime, Service, LoggedIn ) VALUES ("
				+ ID + ", '" + Name + "', '" + LastName + "', '" + Sex + "', " + IDNum + ", " + years + ", " + RoomNum
				+ ", '" + RoomType + "', '" + UserName + "', '" + Password + "', '" + CheckInTime + "', '" + Service
				+ "', '" + LoggedIn + "');";

		// executes query
		statement.executeUpdate(query);
		System.out.println("Column successfully updated");
		unos.close();

	}

	public void changeInfo() throws SQLException {
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
		unos.close();
	}

	public void printReceipt() throws SQLException {
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
		System.out.println("Total: \t\t\t\t\t\t" + balance);
		input.close();
	}

	public void checkOutUser() throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		System.out.println();
		System.out.println("Enter ID for the user you want to check out out:");
		int id = input.nextInt();
		// stores info in archive
		String queryArhiva = "insert INTO archive select*from hotel.userinfo WHERE ID=" + id + ";";
		// deletes the info
		String query = "DELETE userinfo FROM hotel.userinfo WHERE ID =" + id + ";";
		statement.executeUpdate(queryArhiva);
		statement.executeUpdate(query);
		System.out.println("User succesfully checked out and archived");
		input.close();
	}

	public void checkLoggedInUsers() throws SQLException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
		Statement statement = conection.createStatement();
		System.out.println(
				"Choose: \n1 - If you want to check logged in users;\n2 - If you want to log out all users;\n3 - If you want to log out specific user\n4 - If you want to shut down the system;");
		int choose = input.nextInt();
		switch (choose) {
		case 1: {
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
			String query = "update hotel.userinfo set LoggedIn= 'not';";
			statement.executeUpdate(query);
			System.out.println("You succsesfully logged out all users");
			break;
		}
		case 3: {
			System.out.println();
			System.out.println("Enter ID for the user you want to log out:");
			int id = input.nextInt();
			String query = "update hotel.userinfo set LoggedIn='not' where ID =" + id + ";";
			statement.executeUpdate(query);
			System.out.println("User was successfully logged out");
		}
		default:
			System.exit(1);
		}
		input.close();
	}

	// metoda zapretragu korisnika
	public void search() throws SQLException {
		java.util.Scanner unos = new java.util.Scanner(System.in);
		System.out.println("Search user by :");
		String search = unos.next();
		System.out.println("Enter the value for that cathegory");
		String value = unos.next();
		Connection konekcija = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "root");
		Statement statement = konekcija.createStatement();
		String query;
		query = "SELECT * FROM hotel.userinfo where " + search + "= '" + value + "';";
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
		unos.close();

	}
}
