package zadaci_16_02_2016;

import java.io.File;
import java.io.FileNotFoundException;

public class LargeDataset {

	public static void main(String[] args) {
		// file
		File file = new File("salary.txt");
		// array for rank
		String[] rank = { "assistant", "associate", "full" };
		double salary = 0;
		try {
			// for writing in file
			java.io.PrintWriter write = new java.io.PrintWriter(file);
			for (int i = 1; i <= 1000; i++) {
				// randomizes the positions in array
				int r = (int) (Math.random() * 3);
				// calculates the salaries
				if (rank[r].equals("assistant")) {
					salary = Math.round(50000 + Math.random() * 30000);
				}
				if (rank[r].equals("associate")) {
					salary = Math.round(60000 + Math.random() * 50000);
				}
				if (rank[r].equals("full")) {
					salary = Math.round(75000 + Math.random() * 50500);
				}
				// writes in file
				write.println("Firstname" + i + " Lastname" + i + " " + rank[r] + " " + salary);
			}
			write.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}

	}

}
