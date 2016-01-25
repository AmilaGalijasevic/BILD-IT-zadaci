package zadaci_24_01_2016;

public class Substring {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// messages for users
		System.out.println("Enter first string: ");
		// stores it in lower case
		String first = input.nextLine().toLowerCase();
		System.out.println("Enter second string: ");
		String second = input.nextLine().toLowerCase();

		// checks if first input contains second
		if (first.contains(second)) {

			System.out.println(second + " is a substring of " + first);
			// if it doesn't contains
		} else {
			System.out.println("No equal substring");
		}

		input.close();
	}

}
