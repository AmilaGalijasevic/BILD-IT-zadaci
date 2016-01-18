package zadaci_18_01_2016;

public class StoXSto {
	public static void random() {
		int count = 0;
		int count1 = 0;
		// string with letters
		String s = "ABCDEFGIJKLMNOPQRSTUVWXYZ";
		//
		for (int i = 0; i < 100; i++) {
			// random number
			int num = (int) (Math.random() * s.length());
			// takes the value of the character at the position of the random
			// number
			char letter = s.charAt(num);
			// counts them
			count++;
			// prints them
			System.out.print(letter + " ");
			// if counter is 10 prints new line
			if (count % 10 == 0) {
				System.out.println();
			}
		}
		// creates and prints 100 random numbers
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 100);
			count1++;
			System.out.print(  broj + " ");
			// prints numbers in new line
			if (count1 % 10 == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		// calls method
		random();
	}

}
