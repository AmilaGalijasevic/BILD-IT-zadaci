package MiniProjekat_4;

import java.util.ArrayList;

public class Hangman {
	// list for cities
	static ArrayList<String> cities = new ArrayList<>();
	// list for storing the outputs
	static ArrayList<Character> output = new ArrayList<>();
	// stores guessed letters
	static String guesses = "";
	static int random;
	static String city;

	public static ArrayList<String> fillCities() {
		cities.add("LONDON");
		cities.add("BERLIN");
		cities.add("BRUGGE");
		cities.add("AMSTERDAM");
		cities.add("FLORENCE");
		cities.add("HAVANA");
		cities.add("MOSCOW");
		cities.add("BRUSSELS");
		cities.add("GHENT");
		cities.add("DUBLIN");
		cities.add("PORTO");
		cities.add("LJUBLJANA");
		cities.add("ZURICH");
		cities.add("DORTMUND");
		cities.add("AACHEN");
		cities.add("PARIS");
		cities.add("LILLE");
		cities.add("ROME");
		cities.add("BRASILIA");
		cities.add("JOHANNESBURGH");
		cities.add("DAMASK");
		cities.add("TEHRAN");
		cities.add("SARAJEVO");
		cities.add("LIVERPOOL");
		cities.add("PRAGUE");
		return cities;
	}

	public static void clearOut() {
		// clears the inputs
		output.clear();
		// prints -- instead of letters
		for (int i = 0; i < city.length(); i++) {
			output.add('-');
		}
	}

	public static void hangerz(int count, String[] args) {
		// prints hangers
		if (count == 1) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
		}
		if (count == 2) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
		}
		if (count == 3) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");
		}
		if (count == 4) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|       |       ");
			System.out.println("|      /|       ");
			System.out.println("|     / |       ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");

		}
		if (count == 5) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|       |       ");
			System.out.println("|      /|\\     ");
			System.out.println("|     / | \\    ");
			System.out.println("|               ");
			System.out.println("|               ");
			System.out.println("|               ");

		}
		if (count == 6) {
			System.out.println("________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|       |       ");
			System.out.println("|      /|\\     ");
			System.out.println("|     / | \\    ");
			System.out.println("|      /        ");
			System.out.println("|     /         ");
			System.out.println("|    /          ");
		}
		if (count == 7) {

			System.out.println("\n________________");
			System.out.println("|       |       ");
			System.out.println("|       |       ");
			System.out.println("|      |_|      ");
			System.out.println("|     (ˇ_ˇ)     ");
			System.out.println("|       |       ");
			System.out.println("|      /|\\     ");
			System.out.println("|     / | \\    ");
			System.out.println("|      / \\     ");
			System.out.println("|     /   \\    ");
			System.out.println("|    /     \\   ");
			System.out.println();
			System.out.println("You lose!!!!");
			System.out.println(city);
			options(args);
		}

	}

	public static void options(String[] args) {
		java.util.Scanner inpit = new java.util.Scanner(System.in);
		System.out.println("Press:\n1 to play again\n2 to exit");
		int press = inpit.nextInt();
		// gives options in the end
		if (press == 1) {
			main(args);
		} else {
			System.out.println("Bye!");
			System.exit(1);
		}
		inpit.close();
	}

	public static void outprint() {
		// prints the letters
		for (int i = 0; i < output.size(); i++) {
			System.out.print(output.get(i).charValue());
		}
	}

	public static String theCity() {
		String theCity = "";
		// adds the output to string
		for (int i = 0; i < city.length(); i++) {
			theCity += output.get(i).charValue();
		}
		// returns it for comparison
		return theCity;
	}

	public static void checkLetter(String letter, String[] args) {
		// if the city is guessed at once
		if (city.equals(theCity())) {
			System.out.println("You win!!!");
			System.out.println(city);
			options(args);
		}
		// adds the correctly guessed letters to the output
		for (int i = 0; i < city.length(); i++) {
			if (city.charAt(i) == letter.charAt(0)) {
				output.set(i, letter.charAt(0));
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// randomizes the cities
		random = (int) (Math.random() * fillCities().size());
		// for continuing
		boolean game = true;
		// gives the value to the string
		city = fillCities().get(random);
		// clears the string with guesses
		guesses = "";
		// calls the method and cleans the ouptrint
		clearOut();
		System.out.println("Try to guess a city!\n");
		// prints the --
		outprint();
		// counter
		int count = 0;
		// starts game
		while (game) {

			System.out.println("\nEnter a letter or guess a city:");
			String letter = input.next().toUpperCase();

			if (letter.length() == 1) {
				// adds the inputed letters to string
				guesses += letter;
				// checks the letters
				checkLetter(letter, args);
				// if the city is guessed
				if (city.equals(theCity())) {
					System.out.println(city);
					System.out.println("You Win!!");
					options(args);

				}
				// prints the guessed letters
				System.out.println("Guesses: " + guesses);
				System.out.println();
				outprint();

			}
			// counts the wrong guesses
			if (!city.contains(letter)) {
				count++;
			}
			// prints the hangers depending on the count
			if (count > 0) {
				System.out.println();
				hangerz(count, args);
			}
			// if the city is entered whole
			if (letter.length() > 1) {
				if (city.equals(letter)) {
					System.out.println(city);
					System.out.println("You win!!!");
					options(args);
				} else {
					// if its the wrong guess
					System.out.println(city);
					System.out.println("You lose!");
					hangerz(7, args);
					options(args);

				}
			}
		}
		input.close();
	}
}
