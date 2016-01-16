package zadaci_16_01_2016;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class BrojacFajla {

	public static void main(String[] args) throws IOException {
		java.util.Scanner inputs = new java.util.Scanner(System.in);
		try {
			System.out.println("Unesite ime fajla");
			String ime = inputs.next();
			java.io.File file = new java.io.File("Linkoln.txt");
			java.io.File files = new java.io.File(ime);
			
			// pretrazuje fajl
			Scanner input = new Scanner(files);

			int count = 0;
			int sum = 0;
			int word = 0;

			// broji stringove i karaktere u fajlu
			while (input.hasNext()) {
				String chars = input.next();
				count = chars.length();
				if (count > 0) {
					sum += count;
					word++;
				}

			}
			// broji linije

			LineNumberReader lines = new LineNumberReader(new FileReader(file));// za
																				// brojanje
			String line = null;// inic. string
			try {
				while ((line = lines.readLine()) != null) {
					// ispisuje broj linija i njohov sadrzaj
					System.out.println("Linija " + lines.getLineNumber() + ": " + line);
				}
			} catch (Exception ex) {
				//hvata greske
				System.out.println("Greska");
			} finally {
				
				System.out.println("Broj stringova je " + word);
				System.out.println("Linija ima: " + lines.getLineNumber() + ": ");
				System.out.println("Broj karaktera u fajlu je " + sum);

				input.close();
				lines.close();

			}
		} catch (FileNotFoundException ex) {
			System.out.println("Fajl sa unsesenim imenom nije pronadjen");
		}
	}
}

