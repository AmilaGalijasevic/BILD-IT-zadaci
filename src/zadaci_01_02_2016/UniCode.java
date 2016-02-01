package zadaci_01_02_2016;

public class UniCode {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			System.out.println("Enter a character:");
			String s = input.next();
			// crates new char array with s length
			char[] c = new char[s.length()];
			// finds corresponding number for inputed character
			for (int i = 0; i < s.length(); i++) {
				c[i] = s.charAt(i);
				System.out.println("Unicode for that character is: " + (int) c[i]);
				
			}
			input.close();
			// catches exceptions
		} catch (Exception ey) {
			System.out.println("Something went wrong, try again:");
			main(args);
		}
	}

}
