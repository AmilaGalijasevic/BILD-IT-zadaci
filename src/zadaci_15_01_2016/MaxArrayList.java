package zadaci_15_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class MaxArrayList {
	public static Integer max(ArrayList<Integer> list) {
		// ako lista sadrzi 0 elemenata ispiuje null i izlazi iz programa
		if (list.size() == 0) {
			System.out.println("null");
			System.exit(1);
		}
		for (int i = 0; i < list.size(); i++) {
			// nalazi max element liste
			Collections.max(list);
		}
		// ispisuje max element
		System.out.println("Najveca vrijednost u listi je: " + Collections.max(list));

		return Collections.max(list);
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite brojeve u listu, nula prekida niz");
		try {
			// dodaje brojeve u listu
			while (input.hasNext()) {
				int brojevi = input.nextInt();
				list.add(brojevi);
				// ako je unos nula prekida unos i ispisuje max vrijednost
				if (brojevi == 0) {
					max(list);
					break;
				}
			}
		} catch (InputMismatchException ex) {
			// hvata greske pri unosu
			System.out.println("Unesite brojeve");
			max(list);
		}
		input.close();
	}
}
