package zadaci_17_02_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LetterOccurances {
	public static void searchFile(File file) throws IOException {
		// searches the file
		Scanner input = new Scanner(file);
		String a = "";
		// scans the file and stores it
		while (input.hasNext()) {
			String chars = input.next();
			a += chars;
			a.toCharArray();
		}
		char[] array = new char[a.toCharArray().length];
		// counts the occurrences of the letters
		for (char b = 'a'; b <= 'z'; b++) {
			for (int i = 0; i < a.toCharArray().length; i++) {
				if (a.toCharArray()[i] == b) {
					array[b]++;
				}
			}
			// prints the letter and the number of occurrences
			System.out.println(b + " " + (int) array[b]);
		}
		input.close();
	}

	public static void main(String[] args) throws IOException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the file name: ");
		// Linkoln.txt
		String filename = input.nextLine();
		java.io.File file = new java.io.File(filename);
		// calls the method
		searchFile(file);
		input.close();
	}
}
