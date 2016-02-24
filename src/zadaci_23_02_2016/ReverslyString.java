package zadaci_23_02_2016;

public class ReverslyString {
	// to store the reversed string
	public static String s = "";
	// for index
	public static int i = 1;

	public static void reverseDisplay(String value) {
		// stops the recursion when the string is reversed
		if (value.length() == s.length()) {
			System.out.println(s);
		} else {
			// adds to string characters in reversed order
			s += value.charAt(value.length() - i);
			i++;
			reverseDisplay(value);
		}

	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// user input
			System.out.println("Enter a string");
			String s = input.nextLine();
			// calls the string
			reverseDisplay(s);

		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
	}

}
