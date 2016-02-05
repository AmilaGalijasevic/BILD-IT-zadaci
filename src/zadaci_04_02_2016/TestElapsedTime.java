package zadaci_04_02_2016;

public class TestElapsedTime {
	public static void selection(int[] num) {

		int min;
		int temp;
		for (int i = num.length - 1; i > 0; i--) {
			i = (int) (Math.random() * 100000);
			min = 0;
			// finds smallest element between 1 and i.
			for (int j = 1; j <= i; j++) {
				if (num[j] < num[min])
					min = j;
			}
			// replace the smallest found with element in position i
			temp = num[min];
			num[min] = num[i];
			num[i] = temp;
		}
	}

	public static void main(String[] args) {
		// creates new object
		Stopwatch s = new Stopwatch();
		int[] num = new int[100000];
		// gets start time
		s.getStartTime();
		// calls method for selection sort
		selection(num);
		// gets end time
		s.getEndTime();
		// prints calculates time
		System.out.print("Elapsed time for sorting is: " + s.getElapsedTime() + " milliseconds.");
	}
}
