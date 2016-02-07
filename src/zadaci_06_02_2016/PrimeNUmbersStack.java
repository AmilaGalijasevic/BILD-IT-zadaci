package zadaci_06_02_2016;

import java.util.ArrayList;

public class PrimeNUmbersStack {
	public static boolean isPrime(int n) {
		// method that calculates prime numbers
		int c = 0;
		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				c++;
			}
		}
		// returns true if they are found
		if (c == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<>();
		StackOfIntegers stack = new StackOfIntegers();
		// adds prime numbers till 120 from the method
		for (int i = 0; i < 120; i++) {
			if (isPrime(i)) {
				primes.add(i);
				stack.push(i);
			}
		}
		// displays them in decreasing order
		for (int i = primes.size() - 1; i >= 0; i--) {
			System.out.print(primes.get(i).intValue() + " ");
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
		// now prints them in increasing order
		for (int i = 0; i < stack2.getSize(); i++) {
			while (!stack2.empty()) {
				System.out.print(stack2.pop() + " ");
			}
		}

	}
}
