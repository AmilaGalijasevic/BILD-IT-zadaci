package zadaci_16_01_2016;

import java.util.InputMismatchException;

public class Novcic {

	public static void penny(int a) {
		int glava = 0;
		int pismo = 0;
		// broji koliko je puta pao na koju stranu
		for (int i = 0; i < a; i++) {
			int penny = (int) (Math.random() * 2);
			System.out.print(penny + " ");
			// nula je glava
			if (penny == 0) {
				glava++;
			} else {
				// 1 je pismo
				pismo++;
			}

		}
		System.out.println();
		System.out.println("Novcic je pao " + glava + " puta na glavu, a " + pismo + " puta na pismo");

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da se baca novcic");
		try {
			int a = input.nextInt();
			System.out.println("0 je glava, 1 je pismo");
			// poziv metode
			penny(a);
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
		}
		input.close();
	}

}
