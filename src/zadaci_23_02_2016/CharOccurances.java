package zadaci_23_02_2016;

public class CharOccurances {
	// for counting
	public static int count = 0;
	public static int i = 0;

	public static int count(String str, char a) {
		// base case to stop recursion
		if (i == str.length()) {
			return count;
		} else {
			// if it finds the character
			if (str.charAt(i) == a) {
				// counts it
				count++;
			}
			// increases index
			i++;
			// returns the value recursively
			return count(str, a);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// user input
			System.out.println("Enter a string");
			String s = input.nextLine();
			System.out.println("Enter a character: ");
			String a = input.next();
			char c = a.charAt(0);
			// prints the methods return value
			System.out.println(count(s, c));

		} catch (Exception e) {
			System.out.println("Something went wrong");
			main(args);
		}
	}

}
