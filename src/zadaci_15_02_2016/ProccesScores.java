package zadaci_15_02_2016;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProccesScores {
	public static void createFile() throws FileNotFoundException {
		// creates new file
		java.io.File file = new java.io.File("scores.txt");
		// if it already exists
		if (file.exists()) {
			System.out.println("File already exists");
		}
		// prints in file
		try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
			output.print(12 + " " + 75 + " " + 53 + " " + 99 + " " + 25);
			// closes print writer
			output.close();
		}
	}

	public static void main(String[] args) throws IOException {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// calls method
		createFile();

		try {
			System.out.println("Input file name");
			String name = input.next();
			java.io.File file = new java.io.File(name);
			// scans the file
			Scanner scanner = new Scanner(file);
			int sum = 0;
			int count = 0;
			// searches the file
			while (scanner.hasNext()) {
				// takes the value of the numbers from file
				int score = scanner.nextInt();
				// sums the numbers
				sum += score;
				// counts
				count++;
				// prints it
				System.out.println("Score: " + score);
			}
			System.out.println("Total of all : " + sum);
			System.out.println("Average of all " + sum / count);

			// closes the scanner
			scanner.close();
			// catches exception
		} catch (FileNotFoundException ex) {
			System.out.println("Incorrect input. Try again ");
			main(args);

		} finally {
			input.close();

		}

	}
}