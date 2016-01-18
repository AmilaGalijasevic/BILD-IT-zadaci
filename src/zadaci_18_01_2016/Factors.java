package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Factors {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing factors
		ArrayList<Integer> factors = new ArrayList<>();
		int factor = 0;
		try {

			System.out.println("Enter the number");
			int num = input.nextInt();
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
			// displays factors
			for (int i = 0; i < factors.size(); i++) {
				System.out.print(factors.get(i).intValue() + " ");
			}
		} catch (InputMismatchException ey) {
			// catches input ex.
			System.out.println("Wrong input");
		}
		input.close();
	}

}
