package zadaci_15_02_2016;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveText {
	public static void main(String[] args) throws FileNotFoundException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.io.File file = new java.io.File("fajl.txt");
		java.io.PrintWriter pw = new java.io.PrintWriter(file);

		try {
			System.out.println("Enter a string to be stored in a file: ");
			String x = input.nextLine();
			// writes in file
			pw.println(x);

		} catch (Exception e) {
			System.out.println("Something went wrong");
		} finally {
			// closes writer
			pw.close();
		}
		System.out.println("Enter a word you want to remove from the file: ");
		String word = input.nextLine();
		String str = "";

		// reads from file
		Scanner read = new Scanner(file);
		while (read.hasNext()) {
			// stores it in string
			str = read.nextLine();
		}
		// deletes the word in the string
		str = str.replace(word, "");
		// prints the string
		System.out.println(str);
		// closes reader
		read.close();
		// writes in file
		java.io.PrintWriter pWriter = new java.io.PrintWriter(file);
		// writes the new string in file
		pWriter.print(str);
		// closes it
		pWriter.close();
		input.close();
	}
}
