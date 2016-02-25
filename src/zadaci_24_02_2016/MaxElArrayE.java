package zadaci_24_02_2016;

public class MaxElArrayE {
	public static <E extends Comparable<E>> E max(E[] list) {
		E currentMax = null;
		for (int i = 0; i < list.length; i++) {
			// takes the value of the element in the list
			currentMax = list[i];
			for (int j = 0; j < list.length; j++) {
				// compares and finds biggest
				if (currentMax.compareTo(list[i]) > 0) {
					// takes that value
					currentMax = list[j];
				}
			}
		}
		// returns biggest number
		return currentMax;

	}

	public static void main(String[] args) {
		// list for integers
		Integer[] list = new Integer[10];
		// stores random numbers to list
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10);
		}
		// prints max number
		System.out.println("Max number in list is : " + max(list));
	}

}
