package zadaci_12_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class PerfectSquare {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing factors
		ArrayList<Integer> factors = new ArrayList<>();
		int factor = 0;
		try {
			System.out.println("Enter the number");
			int num = input.nextInt();
			int n = num;
			// loop for finding factors
			for (int i = 2; i <= num; i++) {
				// while entered numbers are divided with i stores the value of
				// i to list
				while (num % i == 0) {
					factor = i;
					factors.add(factor);
					num = num / i;
				}
			}
			int[] count = new int[Collections.max(factors) + 1];
			ArrayList<Integer> f = new ArrayList<>();

			// displays factors
			for (int i = 0; i < factors.size(); i++) {
				System.out.print(factors.get(i).intValue() + " ");

			}
			// counts
			for (int i : factors) {
				count[i]++;
			}
			// adds the numbers that are counted uneven number of times to the
			// list
			for (int i = 0; i < count.length; i++) {
				if (count[i] % 2 != 0) {
					f.add(i);
				}
			}
			int m = 1;
			// calculates m
			for (int i = 0; i < f.size(); i++) {
				m = m * f.get(i).intValue();
			}
			// prinst m * n
			System.out.println("\n" + m * n);
		} catch (InputMismatchException ey) {
			// catches input exceptions
			System.out.println("Wrong input");
		}
		input.close();

	}

}
