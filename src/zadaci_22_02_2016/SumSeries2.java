package zadaci_22_02_2016;

public class SumSeries2 {
	public static double sum;

	public static double m2(double i) {
		// base case
		if (i == 0) {
			return sum;
			// calculates
		} else {
			sum += i / ((2 * i) + 1);
			i--;
			return m2(i);
		}
	}

	public static void main(String[] args) {
		// prints the result
		System.out.println(m2(10));
	}

}
