package zadaci_30_01_2016;

public class SSN {

	public static boolean validFormat(String s) {
		// checks if entered number is the right length and that it has - in
		// right places
		if (!(s.length() == 11 && s.charAt(3) == '-' && s.charAt(6) == '-')) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter SSN (Social Security Number):");
			String s = input.nextLine();
			// checks if input is letter
			for (int i = 0; i < s.length(); i++) {
				while ((Character.isAlphabetic(s.charAt(i)))) {
					System.out.println("Only numbers, try again:");
					s = input.nextLine();
				}
			}
			// while number isn't valid asks again
			while (!validFormat(s)) {
				System.out.println("Invalid number, try again: ");
				s = input.nextLine();
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Something went wrong, try again...");
			main(args);
		}
	}

}
