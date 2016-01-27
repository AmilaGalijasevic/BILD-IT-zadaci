package zadaci_27_01_2016;

import java.util.ArrayList;
import java.util.Collections;

public class EmirpNums {
	public static boolean isPalindrome(int num) {
		int reverse = 0;
		// takes value of num before it's changed
		int empty = num;
		// while num isn't 0 calculates 
		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + (num % 10);
			num = num / 10;
		}
		// if calculated number is the same as the argument number
		if (reverse == empty) {
			// returns true cuz it'a a palindrome
			return true;
			// else returns false
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// array list to store prime numbers
		ArrayList<Integer> primes = new ArrayList<>();
		// for emirps numbers
		ArrayList<Integer> emirps = new ArrayList<>();
		// new list for storing primes
		ArrayList<Integer> newPrimes = new ArrayList<>();

		// loop with start value and end value
		for (int i = 1; i <= 10000; i++) {
			int counter = 0;
			// checks if numbers in list are divisible
			for (int j = i; j >= 1; j--) {
				// if they are divisible only with itself and 1 they are counted
				if (i % j == 0) {
					// counts them
					counter++;
				}
			}
			// ads number to the list
			if (counter == 2) {
				primes.add(i);
			}
		}
		// adds prime numbers before the first list is changed
		newPrimes.addAll(primes);
		int num = 0;
		for (int i = 0; i < primes.size(); i++) {
			int reverse = 0;
			// while numbers aren't zero loop reverses the numbers
			while (primes.get(i).intValue() != 0) {
				num = primes.get(i).intValue();
				// calculates reverse number
				reverse = reverse * 10;
				reverse = reverse + (num % 10);
				num = num / 10;
				// sets value at position so number could be calculated
				primes.set(i, num);
			}
			// adds reversed numbers to the list
			emirps.add(reverse);
		}
		int emirp = 0;
		int count1 = 0;
		System.out.println("First 100 emirp numbers: \n");
		for (int i = 0; i < primes.size(); i++) {
			// sorts the list
			Collections.sort(emirps);
			// takes the value of numbers in list
			emirp = emirps.get(i).intValue();
			// if the numbers in prime list contain emirp numbers and the method
			// doesn't
			// return true
			if (newPrimes.contains(emirp) && (!isPalindrome(emirps.get(i).intValue()))) {
				// prints numbers
				System.out.print(emirps.get(i).intValue() + " ");
				count1++;
				// prints them in new line
				if ((count1 % 10 == 0)) {
					System.out.println();
				}
				// loop breaks after printing first 100 numbers
				if (count1 == 100) {
					System.out.println();
					break;
				}
			}
		}
	}
}