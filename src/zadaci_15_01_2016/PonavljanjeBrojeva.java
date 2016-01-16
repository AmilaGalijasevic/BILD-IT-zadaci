package zadaci_15_01_2016;

public class PonavljanjeBrojeva {

	public static void main(String[] args) {

		// novi niz duzine 100
		int[] niz = new int[100];
		// dodjeljuje random vrijednosti od 0 do 9 u niz
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		// niz za brojanje brojeva koji se ponavljaju
		int[] brojac = new int[10];
		for (int e : niz) {
			brojac[e]++;
		}
		// ispisuje koliko se puta ponovio broj
		for (int j = 0; j < brojac.length; j++) {
			if (brojac[j] != 0) {
				System.out.println("Broj " + j + " ponovio se " + brojac[j] + " puta.");
			}
		}

	}

}
