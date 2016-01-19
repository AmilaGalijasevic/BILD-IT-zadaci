package zadaci_18_01_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Average {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// list for storing numbers
		ArrayList<Double> list = new ArrayList<>(100);
		System.out.println("Enter number, 0 breaks the string");
		double num = input.nextInt();
		double sum = 0;
		double count = 0;
		double average = 0;
		int countplus = 0;// counts bigger numbers than average
		int countminus = 0;// count smaller numbers

		// stores the numbers to list while input isn't 0
		while (num != 0) {
			list.add(num);
			// sums the numbers in list
			sum += num;
			// counts them
			count++;
			// breaks after counter hits 100
			if (count == 100) {
				break;
			}
			num = input.nextInt();
		}
		// calculates average
		average = (sum / count);
		for (int i = 0; i < count; i++) {
			// if the average is bigger than the numbers in the list counts them
			if (average > list.get(i).doubleValue()) {
				countminus++;
				// counts others
			} else {
				countplus++;
			}
		}
		// displays the message
		System.out.println("Average number is: " + average);
		System.out.println("Number of bigger or equal numbers to average in list is: " + countplus);
		System.out.println("Number of smaller numbers than average in list is: " + countminus);
		try {

		} catch (InputMismatchException ey) {
			System.out.println("Wrong input");
		}
		input.close();
	}

}
