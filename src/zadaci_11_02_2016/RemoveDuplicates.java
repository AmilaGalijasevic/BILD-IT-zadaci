package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class RemoveDuplicates {
	public static void removeDuplicate(ArrayList<Integer> list) {
		int max = Collections.max(list);
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i <= max; i++) {
			// counts frequencies of numbers in list
			int counter = Collections.frequency(list, i);
			// if its bigger than 1 adds them to new list
			if (counter >= 1) {
				l.add(i);
			}
		}
		//prints the list
		System.out.println(l.toString());
	}

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			// list for numbers
			ArrayList<Integer> list = new ArrayList<>();
			int count = 0;
			System.out.println("Enter 10 numbers");
			// adds and counts numbers in list
			while (count < 10) {
				int num = input.nextInt();
				list.add(num);
				count++;
			}
			// calls method
			removeDuplicate(list);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
