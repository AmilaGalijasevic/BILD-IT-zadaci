package zadaci_19_01_2016;

public class Prefix {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// first string
		System.out.println("Enter first string");
		//stores it in lower case
		String first = input.nextLine().toLowerCase();
		// second string
		System.out.println("Enter second string");
		String second = input.nextLine().toLowerCase();
		// Initializes prefix string
		String prefix = "";
		// initializes temporary string for holding values
		String temp = "";
		// if length ist'n the same replaces their values
		if (first.length() > second.length()) {
			temp = first;
			first = second;
			second = temp;
		}
		// checks for same prefix by searching for equal substrings
		for (int i = 0; i <= first.length(); i++) {
			if (first.substring(0, i).equals(second.substring(0, i))) {
				// stores the equal substring to prefix string
				prefix = first.substring(0, i);
			}
		}
		// if there are equal substrings then length is > 0
		if (prefix.length() > 0) {
			// displays the prefix
			System.out.println(prefix);
		} else {
			// if there are none equal substring
			System.out.println("No same prefix");
		}
		input.close();
	}

}
