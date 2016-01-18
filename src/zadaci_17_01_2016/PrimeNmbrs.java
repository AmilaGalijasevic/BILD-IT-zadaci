package zadaci_17_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class PrimeNmbrs {
	public static void prime(int a, int b, int lines) {
		// new array list to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();
		// temporary variable
		int temp = 0;
		// if a is smaller than b
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		int counter2 = 0;
		// first loop with start value and end value
		for (int i = a; i <= b; i++) {
			// initializes the counter
			int counter = 0;
			// second loop that takes the biggest number in array, compares the
			// integers and checks if they are divisible with all other numbers
			// and 1
			for (a = i; a >= 1; a--) {
				// if they are divisible only with itself and 1 they are counted
				if (i % a == 0) {
					counter++;
				}
			}
			// ads that number to the list if it was divided two times
			if (counter == 2) {
				primes.add(i);
			}
		}
		// displays the number and requested amount per line
		for (int i = a; i < primes.size(); i++) {
			System.out.printf(primes.get(i).intValue() + " ");
			counter2++;
			if (counter2 % lines == 0) {
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// displays the messages
			System.out.println("Enter the first and last number for which you want to display the prime numbers");
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.println("Enter how many numbers per line you want to diaplay");
			int line = input.nextInt();
			// calls the method
			prime(a, b, line);

		} catch (InputMismatchException ex) {
			// catches input exceptions
			System.out.println("Wrong input");
		}

		input.close();
	}
}
