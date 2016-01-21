package zadaci_21_01_2016;

public class Passw0rd {

	public static boolean checkPass(String pass) {
		int count = 0;
		int count1 = 0;
		// checks and counts digits
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				count++;
			}
			// check and counts letters
			if (Character.isLetter(pass.charAt(i))) {
				count1++;
			}
		}
		// if pass has more than 2 numbers, length is bigger then 8, and doesn't
		// contain other characters returns true
		if (count >= 2 && pass.length() >= 8 && (count + count1) == pass.length()) {

			return true;
			// else returns false
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter password:");
		String pass = input.next();
		// if method returns true
		if (checkPass(pass)) {
			System.out.println("Password is valid");
			// if it returns false
		} else {
			System.out.println("Password is not valid");
		}
		input.close();
	}

}
