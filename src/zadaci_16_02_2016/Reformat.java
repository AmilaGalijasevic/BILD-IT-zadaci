package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reformat {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		// list to store things from file
		ArrayList<String> readfile = new ArrayList<>();

		try {
			// scans
			Scanner input = new Scanner(file);
			// stores in list
			while (input.hasNextLine()) {
				readfile.add(input.nextLine());
			}
			for (int i = 0; i < readfile.size(); i++) {
				String f = readfile.get(i);
				// turns string to char array
				char[] chars = f.toCharArray();
				int count = 0;
				for (int j = 0; j < chars.length; j++) {
					if (chars[j] == ' ' || chars[j] == '{') {
						// counts the occurrences
						count++;
					}
				}
				if (count == chars.length) {
					// sets the lists so the brackets are in new position in
					// line
					readfile.set((i - 1), (readfile.get(i - 1) + " {"));
					//removes the brackets
					readfile.remove(i);
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		// writer
		java.io.PrintWriter write = new java.io.PrintWriter(file);
		for (int i = 0; i < readfile.size(); i++) {
			// writes in file
			write.println(readfile.get(i));
			// displays it in console
			System.out.println(readfile.get(i));
		}
		write.close();
	}
}
