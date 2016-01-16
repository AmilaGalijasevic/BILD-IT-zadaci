package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class MaxBrojUNizu {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		int count = 0;
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite niz brojeva, nula prekida niz");

		try {
			int brojevi = input.nextInt();
			// dodaje brojeve u listu
			while (brojevi != 0) {
				list.add(brojevi);
				brojevi = input.nextInt();
			}

			for (int i = 0; i < list.size(); i++) {
				// nalazi max element liste
				Collections.max(list);
				max = Collections.max(list);

			}
			for (int i = 0; i < list.size(); i++) {
				// broji max element
				if (list.get(i).intValue() == max) {
					count++;
				}
			}
			// ispisuje max element
			System.out.println(
					"Najveca vrijednost u nizu je: " + Collections.max(list) + " i ponavlja se: " + count + " puta.");

		} catch (InputMismatchException ex) {
			// hvata greske pri unosu
			System.out.println("Unesite brojeve");

		}
		input.close();
	}

}
