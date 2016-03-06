package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

public class SqlWorld {
	// method for inputs
	public static String line() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// stores input with first upper case
		String s = input.nextLine().toUpperCase();
		input.close();
		return s;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// connect object that connects to the database
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			// statement object that implements simple SQL statements
			Statement statement = myCon.createStatement();
			String query = "";
			// user options
			System.out.println("Welcome to world database! Select a query:");
			System.out.println("1 - If you want a list of all countries;");
			System.out.println("2 - If you want a list of all cities;");
			System.out.println("3 - If you want a list of all country languages;");
			System.out.println("4 - If you want a info about a specific country;");
			System.out.println("5 - If you want a info about a specific city;");
			System.out.println("6 - If you want to search countries by continent;");
			System.out.println("7 - If you want to see a list of 10 most populated countries in the world;");
			System.out.println("8 - If you want to see a list of 10 most populated cities in the world;");
			System.out.println("9 - If you want to see a list of countries starting with specific letter;");
			System.out.println("10 - If you want to see a list of countries by specific language.");

			int choise = input.nextInt();

			switch (choise) {
			case 1: {
				// query for the database
				query = "SELECT * from country;";
				// executes a query
				ResultSet result = statement.executeQuery(query);
				// prints it in console
				while (result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 2: {
				//query for searching the database
				query = "SELECT * from city;";
				//executes it
				ResultSet result = statement.executeQuery(query);
				//prints it
				while (result.next()) {
					System.out.println(result.getString("Name"));
				}
				break;
			}
			case 3: {
				query = "SELECT * from countrylanguage;";
				ResultSet result = statement.executeQuery(query);
				//prints the languages
				while (result.next()) {
					System.out.println(result.getString("Language"));
				}
				break;
			}

			case 4: {
				System.out.println("Enter a country name:");
				String country = line();
				// query with the user input
				query = "SELECT * from country where name = '" + country + "';";
				ResultSet result = statement.executeQuery(query);
				// if it cannot be found
				if (!result.next()) {
					System.out.println("Wrong input or query not found");
				}
				// prints the result of the query
				while (result.next()) {
					System.out.println("Name, Continent, Region, Population, Surface Area: ");
					System.out.println(result.getString("Name") + ", " + result.getString("Continent") + ", "
							+ result.getString("Region") + ", " + result.getString("Population") + ", "
							+ result.getString("SurfaceArea"));
				}
				break;
			}
			case 5: {
				System.out.println("Enter a city name:");
				String city = line();
				// query with the city name entered by user
				query = "SELECT * from city where name = '" + city + "';";
				// executes it
				ResultSet result = statement.executeQuery(query);
				if (!result.next()) {
					System.out.println("Wrong input or query not found");
				}
				// prints it
				while (result.next()) {
					System.out.println("Name, Country Code, District, Population: ");
					System.out.println(result.getString("Name") + ", " + result.getString("CountryCode") + ", "
							+ result.getString("District") + ", " + result.getString("Population"));
				}
				break;
			}
			case 6: {
				System.out.println("Enter a continent name:");
				String continent = line();
				query = "SELECT * from country where continent = '" + continent + "';";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Name, Region: ");
				if (!result.next()) {
					System.out.println("Wrong input or query not found");
				}
				// prints the countries in that continent
				while (result.next()) {
					System.out.println(result.getString("Name") + ", " + result.getString("Region"));
				}
				break;
			}
			case 7: {
				query = "SELECT * from country order by Population desc limit 10;";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Name, Population: ");
				// prints the top 10 populated countries
				while (result.next()) {
					System.out.println(result.getString("Name") + ", " + result.getString("Population"));
				}
				break;
			}
			case 8: {
				query = "SELECT * from city order by Population desc limit 10;";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Name, Population: ");
				// prints the top 10 populated cities
				while (result.next()) {
					System.out.println(result.getString("Name") + ", " + result.getString("Population"));
				}
				break;
			}
			case 9: {
				System.out.println("Enter the first letter:");
				String letter = input.next();
				// query to search the database by first letter
				query = "SELECT * from country where name like '" + letter.charAt(0) + "%';";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Name, Continent, Population: ");
				if (!result.next()) {
					System.out.println("Wrong input or query not found");
				}
				// prints it
				while (result.next()) {
					System.out.println(result.getString("Name") + ", " + result.getString("Continent") + ", "
							+ result.getString("Population"));
				}
				break;
			}
			case 10: {
				System.out.println("Enter the language:");
				String language = line();
				// query for finding the countries in which entered language is
				// used
				query = "SELECT * from countrylanguage where Language ='" + language + "';";
				ResultSet result = statement.executeQuery(query);
				System.out.println("Country Code, Language, Percentage: ");
				// if its the wrong input or can't find it
				if (!result.next()) {
					System.out.println("Wrong input or query not found");
				}
				// prints the result
				while (result.next()) {
					System.out.println(result.getString("CountryCode") + ", " + result.getString("Language") + ", "
							+ result.getString("Percentage"));
				}
				break;
			}
			}
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input, try again");
			main(args);
		} catch (SQLException ey) {
			System.out.println("Something went wrong, try again:");
			main(args);
		}

	}
}
