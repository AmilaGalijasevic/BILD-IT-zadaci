package zadaci_17_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList {
	public static void shuffle(ArrayList<Number> list) {
		//shuffles the list
		Collections.shuffle(list);
		//prints it
		System.out.println(list.toString());
	}

	public static void main(String[] args) {
		//list for numbers
		ArrayList<Number> list = new ArrayList<>();
		int count = 0;
		//adds 20 numbers to list
		while (count < 20) {
			list.add(count);
			count++;
		}
		//prints the list
		System.out.println(list.toString());
		shuffle(list);
	}

	}

