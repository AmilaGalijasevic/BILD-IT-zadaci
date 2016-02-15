package zadaci_15_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class CountFile {

	public static void searchFile(File file, String[] args) throws IOException {
		// searches the file
		Scanner input = new Scanner(file);
		int count = 0;
		int sum = 0;
		int word = 0;

		// counts characters in file
		while (input.hasNext()) {
			String chars = input.next();
			count = chars.length();
			if (count > 0) {
				// sums characters
				sum += count;
				// counts words
				word++;
			}
		}
		// for counting lines
		LineNumberReader lines = new LineNumberReader(new FileReader(file));
		String line = "";
		try {
			// while there are lines in file
			while ((line = lines.readLine()) != null) {
				// prints line number and the text in it
				System.out.println("Line " + lines.getLineNumber() + ": " + line);
			}
			// prints the number of words, lines and characters
			System.out.println("Number of words in file: " + word);
			System.out.println("Number if lines: " + lines.getLineNumber() + ": ");
			System.out.println("Number of characters: " + sum);

		} catch (FileNotFoundException ex) {
			System.out.println("File not found, try again:");
			main(args);
		} finally {
			input.close();
			lines.close();
		}
	}

	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("Linkoln.txt");
		// if the file exists
		if (file.exists()) {
			System.out.println("File already exists");
		}
		// call the method
		searchFile(file,args);
	}
}
