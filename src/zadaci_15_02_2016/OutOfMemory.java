package zadaci_15_02_2016;

import java.util.ArrayList;

public class OutOfMemory {

	public static void main(String[] args) {

		try {
			// list to store numbers
			ArrayList<Integer> list = new ArrayList<>();
			// causing out of memory error
			while (true) {
				list.add((int) (Math.random() * 100));
			}
		} catch (OutOfMemoryError e) {
			// prints error message
			System.err.println("Out of memory");

		}

	}

}
