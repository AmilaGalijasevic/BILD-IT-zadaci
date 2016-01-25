package zadaci_25_01_2016;

import java.util.ArrayList;

public class SumOfNmbrs {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {

			// list for storing numbers
			ArrayList<Integer> numbers = new ArrayList<>();
			// count positive numbers
			int countp = 0;
			// counts negative
			int countn = 0;
			double sum = 0;
			double average = 0;

			System.out.println("Enter numbers, end with zero(0)");
			int num = input.nextInt();
			// while input isn't zero
			while (num != 0) {
				// ads them to the list
				numbers.add(num);
				num = input.nextInt();
			}

			for (int i = 0; i < numbers.size(); i++) {
				// sums numbers in the list
				sum += numbers.get(i).intValue();
				// checks for positive numbers
				if (numbers.get(i).intValue() > 0) {
					// counts them
					countp++;
					// checks for negative
				} else {
					// counts them
					countn++;
				}
			}
			// calculates average
			average = sum / (countp + countn);
			// prints results
			System.out.println("Positive numbers: " + countp + ".\nNegative numbers: " + countn
					+ ".\nSum of numbers is: " + sum + ". \nAverage is: " + average);

		} catch (Exception ey) {
			System.out.println("Something went wrong, try again:");
			main(args);
		}
		input.close();
	}

}
