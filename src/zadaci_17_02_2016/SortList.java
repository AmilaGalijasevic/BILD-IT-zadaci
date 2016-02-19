package zadaci_17_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void sort(ArrayList<Number> list) {
		// temporary list
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Number> list2 = new ArrayList<>();
		// adds the values from the list to temporary list
		for (int i = 0; i < list.size(); i++) {
			list1.add(list.get(i).intValue());
			// sorts it
			Collections.sort(list1);
		}
		// adds the sorted list to list of numbers
		list2.addAll(list1);
		// prints it
		System.out.println(list2.toString());
	}

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		int count = 0;
		// adds 20 random numbers to list
		while (count < 20) {
			list.add((int) (Math.random() * 100));
			// counts
			count++;
		}
		// prints them
		System.out.println(list.toString());
		// calls method
		sort(list);
	}

}
