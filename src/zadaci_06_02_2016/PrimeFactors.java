package zadaci_06_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class PrimeFactors {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int factor = 0;
		try {

			System.out.println("Enter the number");
			int num = input.nextInt();
			// loop for finding factors
			StackOfIntegers stack = new StackOfIntegers();
			for (int i = 2; i <= num; i++) {
				// while entered numbers are divided with i stores the value of
				// i to list
				while (num % i == 0) {
					factor = i;
					// stores the number
					list.add(factor);
					stack.push(factor);
					num = num / i;

				}
			}
			// prints factors in decreasing order
			for (int i = list.size()-1; i>=0;  i--) {
				System.out.print(list.get(i).intValue() + " ");
			}
			System.out.println();
			// crates new object
			StackOfIntegers stack2 = new StackOfIntegers();
			// moves the elements and reverses them
			for (int i = stack.getSize(); i >= 0; i--) {
				while (!stack.empty()) {
					stack2.push(stack.pop());
				}
			}
			// prints them
			for (int i = 0; i < stack2.getSize(); i++) {
				while (!stack2.empty()) {
					System.out.print(stack2.pop() + " ");
				}
			}

			input.close();
		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
			main(args);
		}

	}

}
