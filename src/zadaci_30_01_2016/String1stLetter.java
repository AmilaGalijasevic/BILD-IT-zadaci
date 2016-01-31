package zadaci_30_01_2016;

public class String1stLetter {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter a string:");
		String s = input.nextLine();
		// counter
		int count = 0;
		// checks for white spaces
		for (int i = 0; i < s.length(); i++) {
			if (Character.isWhitespace(s.charAt(i))) {
				// counts them
				count++;
			}
		}
		// displays first letter and length of the string without spaces
		System.out.println("First letter of entered string is: " + s.charAt(0)
				+ ". \nLength of the string without spaces is: " + (s.length() - count));
		input.close();
	}

}
