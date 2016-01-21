package zadaci_20_01_2016;

public class Characters {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// message for user
		System.out.println("Enter a string:");
		String s = input.nextLine();
		// finds the characters
		for (int i = 0; i <= s.length(); i++) {
			if ((i % 2 == 0)) {
				//prints them
				System.out.print(s.charAt(i));
			}

		}
		input.close();
	}

}
