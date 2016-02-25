package zadaci_24_02_2016;

public class MaxEl2DArrayE {
	public static <E extends Comparable<E>> E max(E[][] list) {
		E currentMax = null;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// takes the value of the numbers in list
				currentMax = list[i][j];
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// compares the numbers
				if (currentMax.compareTo(list[i][j]) < 0) {
					// takes the value of the biggest number
					currentMax = list[i][j];
				}
			}
		}
		// returns the number
		return currentMax;

	}

	public static void main(String[] args) {
		// 2d array with some random numbers
		Integer[][] m1 = new Integer[][] { { 1, 2, 3, 8 }, { 4, 5, 6, 2 }, { 1, 1, 1, 6 } };
		// calls and prints the methods return value
		System.out.println("Max element in list is : " + max(m1));
	}

}
