package zadaci_16_02_2016;

import java.util.Scanner;

public class ScoresURL {

	public static void main(String[] args) {
		try {
			// creates an URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			// scans
			Scanner input = new Scanner(url.openStream());
			int sum = 0;
			int count = 0;
			while (input.hasNext()) {
				// takes the value of the numbers
				int score = input.nextInt();
				// sums the numbers
				sum += score;
				// counts
				count++;
				// prints it
				System.out.println("Score: " + score);
			}
			// displays the total and average
			System.out.println("Total of all : " + sum);
			System.out.println("Average of all " + sum / count);
			input.close();
		}
		// catches exceptions
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}

	}

}
