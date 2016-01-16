package zadaci_15_01_2016;

public class BrojSamoglasnika {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// string sa samoglasnicima
		String s = "aeiou";
		System.out.println("Unesite neki string");

		String neki = input.nextLine().toLowerCase();
		int count = 0;
		int count2 = 0;

		for (int i = 0; i < neki.length(); i++) {
			// broji samoglasnike
			if (s.contains(neki.charAt(i) + "")) {
				count++;
			}
			// broji razmake
			if (Character.isWhitespace(neki.charAt(i))) {
				count2++;
			}

		}
		// ispisuje broj samoglasnika i suglasnika tako sto oduzme samoglasnike
		// i razmake od duzine stringa
		System.out.println("Uneseni string sadrzi " + count + " samoglasnika i " + (neki.length() - count2 - count)
				+ " suglasnika");
		input.close();
	}

}
