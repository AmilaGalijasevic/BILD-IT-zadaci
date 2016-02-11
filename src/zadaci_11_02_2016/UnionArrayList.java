package zadaci_11_02_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class UnionArrayList {
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// adds one list to another
		list1.addAll(list2);
		// prints it
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i).intValue() + " ");
		}
		return list1;
	}

	public static void main(String[] args) {
		try {

			java.util.Scanner input = new java.util.Scanner(System.in);
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			int count = 0;
			System.out.println("Enter 5 numbers to first list");
			// first list storing and counting
			while (count < 5) {
				int num = input.nextInt();
				list1.add(num);
				count++;
			}
			// resets the counter
			count = 0;

			System.out.println("Enter 5 numbers to second list");
			// second list storing and counting
			while (count < 5) {
				int num = input.nextInt();
				list2.add(num);
				count++;
			}
			// calls the method
			union(list1, list2);
			input.close();
		} catch (InputMismatchException hey) {
			System.out.println("Wrong input");
			main(args);
		}
	}

}
