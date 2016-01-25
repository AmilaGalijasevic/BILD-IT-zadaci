package zadaci_24_01_2016;

public class CountChar {

	public static int count(String str, char a) {
		// counter
		int count = 0;
		// finds same characters in string
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				// counts them
				count++;
			}
			// returns number of repeated characters
		}
		return count;
	}

	public static void main(String[] args) {

		java.util.Scanner iput = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a string");
			// stores it in lower case
			String str = iput.nextLine().toLowerCase();
			System.out.println("Which character in a string would you like to count?");
			// temporary string to extract character from
			String temp = iput.next().toLowerCase();
			// if entered string is bigger than 1 character
			while (temp.length() > 1) {
				System.out.println("Enter only one character: ");
				temp = iput.next();
			}
			// a becomes character at temp position 0
			char a = temp.charAt(0);
			// displays the number by calling a method
			System.out.println("That character was repeated " + count(str, a) + " time/s.");
			// closes scanner
			iput.close();
		} catch (Exception ey) {
			System.out.println("Something went wrong, try again");
			main(args);
		}
	}

}
