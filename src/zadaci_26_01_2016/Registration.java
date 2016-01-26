package zadaci_26_01_2016;

public class Registration {

	public static void main(String[] args) {
		// char array
		char[] a = new char[3];
		// string with alphabet
		String s = "ABCDEFGIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < a.length; i++) {
			// random number
			int num = (int) (Math.random() * s.length());
			// randomizes position of the letters
			char letter = s.charAt(num);
			// stores them in array
			a[i] = letter;
			// prints them
			System.out.print(a[i]);
		}
		System.out.print("-");
		// array with numbers
		int[] numbers = new int[4];
		for (int i = 0; i < numbers.length; i++) {
			// random number
			int num = (int) (Math.random() * 10);
			// randomizes number array
			numbers[i] = num;
			// prints it
			System.out.print(numbers[i]);
		}
	}

}
