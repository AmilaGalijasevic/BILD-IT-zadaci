package zadaci_22_02_2016;

public class SumSeries1 {
	public static double sum;

	public static double m(double i) {
		// base case
		if (i == 1) {
			return 1 + sum;
			// calculates
		} else {
			sum += 1 / i;
			i--;
			return m(i);
		}
	}

	public static void main(String[] args) {
		// prints it
		System.out.println(m(10));

	}
}
