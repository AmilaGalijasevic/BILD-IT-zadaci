package zadaci_22_02_2016;

public class SumSeries3 {
	public static double sum;

	public static double m3(double i) {
		// base case
		if (i == 0) {
			return sum;
			// calculates
		} else {
			sum += i / (i + 1);
			i--;
			return m3(i);
		}
	}

	public static void main(String[] args) {
		// prints result
		System.out.println(m3(10));

	}

}
