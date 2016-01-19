package zadaci_19_01_2016;

public class CountLetters {
	public static int countLetters(String s) {
		int count = 0;
		// counts letters in a string
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		// displays it
		System.out.println("Number of letters: " + count);
		return count;
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("Enter a string:");
		String s = input.nextLine();
		//calls method
		countLetters(s);
		input.close();
	}

}
