package zadaci_02_02_2016;

public class CountSingleDigits {

	public static void main(String[] args) {
		// new arrays for numbers and for counting
		int[] numbers = new int[100];
		int[] count = new int[10];
		// gives the numbers in array a random value
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			numbers[i] = n;
		}
		//for each loop to count the numbers
		for (int e : numbers) {
			count[e]++;
		}
		//prints how many times did the number occurred
		for (int j = 0; j < count.length; j++) {
			if (count[j] != 1) {
				System.out.println(j + " was counted " + count[j] + " times.");
			}
		}
	}

}
