package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class SumArrayList {

	public static double sum(ArrayList<Double> list) {
		double sumList = 0;
		// sums the numbers in list
		for (int i = 0; i < list.size(); i++) {
			sumList += list.get(i).intValue();
		}
		// returns the sum
		return sumList;

	}

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			// list for storing numbers
			ArrayList<Double> numbers = new ArrayList<>();
			int count = 0;
			System.out.println("Enter 5 numbers");
			// stores numbers and counts them
			while (count < 5) {
				double num = input.nextDouble();
				numbers.add(num);
				count++;
			}
			// calls the method
			System.out.println("Sum:" + sum(numbers));
			input.close();
		} catch (InputMismatchException eyy) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
