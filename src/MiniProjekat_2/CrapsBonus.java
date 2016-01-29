package MiniProjekat_2;

public class CrapsBonus {
	static int win = 0;
	static int lose = 0;

	public static void dice(int suma) {
		// generates new numbers
		int kocka1 = (1 + (int) (Math.random() * 6));
		int kocka2 = (1 + (int) (Math.random() * 6));
		// calculates them
		int suma2 = kocka1 + kocka2;
		// prints them
		System.out.println("U rolled " + kocka1 + " + " + kocka2 + " = " + suma2);
		// if the number is same as in the last throw
		if (suma2 == suma) {
			System.out.println("You win!");
			win++;
			// if its 7 in second throw
		} else if (suma2 == 7) {
			System.out.println("You lose");
			lose++;
		}
		// throws dices again
		else {
			dice(suma2);

		}
	}

	public static void main(String[] args) {
		// loop for throwing dices 10000 times
		for (int i = 0; i < 10000; i++) {
			int dice1 = (1 + (int) (Math.random() * 6));
			int dice2 = (1 + (int) (Math.random() * 6));
			// sums them
			int sum = dice1 + dice2;
			// point numbers
			int[] point = { 4, 5, 6, 8, 9, 10 };
			// displays tossed numbers
			System.out.println("U rolled " + dice1 + " + " + dice2 + " = " + sum);
			// wining numbers
			if (sum == 7 || sum == 11) {
				System.out.println("You win");
				win++;
				// loosing numbers
			} else if (sum == 2 || sum == 3 || sum == 12) {
				System.out.println("You lose");
				lose++;
				// if point
			} else {

				System.out.println("Point is " + sum);
				for (int j = 0; j < point.length; j++) {
					if (sum == point[j]) {
						dice(sum);
					}
				}
			}
		}
		System.out.println("\nWins: " + win + "\nDefeats: " + lose);
	}
}
