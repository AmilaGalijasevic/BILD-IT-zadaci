package zadaci_16_02_2016;

import java.util.Scanner;

public class URLcount {

	public static void main(String[] args) {
		try {
			int word = 0;
			// new URL object
			java.net.URL url = new java.net.URL("https://wordpress.org/plugins/about/readme.txt");
			// scans it
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.next();
				// counts the words
				word++;
				// prints them
				System.out.println(line);
			}
			// prints the counter
			System.out.println("The file has " + word + " words");
			input.close();
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
