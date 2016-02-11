package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class SortArrayList {
	public static void sort(ArrayList<Integer> list) {
		// sorts the array
		Collections.sort(list);
		// prints it as a string
		System.out.print(list.toString());

	}

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<>();
			int count = 0;
			System.out.println("Enter 5 numbers");
			// adds and counts numbers
			while (count < 5) {
				int num = input.nextInt();
				list.add(num);
				count++;
			}
			input.close();
			// calls the method
			sort(list);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
