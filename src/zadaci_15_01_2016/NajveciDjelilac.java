package zadaci_15_01_2016;

import java.util.InputMismatchException;

public class NajveciDjelilac {
	public static int djelilac(int a, int b) {
		int maxDjelilac = 0;
		// ako je b nula onda ce najveci djelilac biti a
		if (b == 0) {
			return a;
		} else {
			// trazi najveceg zajednickog djelioca
			for (int i = 1; i <= b; i++) {
				if (b % i == 0 && a % i == 0) {
					maxDjelilac = i;
				}
			}
			System.out.println("Najveci zajednicki djelilac je: " + maxDjelilac);
		}
		return maxDjelilac;

	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// ispis poruke
			System.out.println("Unesite 2 broja za koja zelite znati zajednicki djelilac");
			int a = input.nextInt();
			int b = input.nextInt();
			// poziva metodu
			djelilac(a, b);
		} catch (InputMismatchException ex) {
			System.out.println("Pogresan unos");

		}
		input.close();
	}

}
