package zadaci_22_02_2016;

public class SumSeries1 {
	public static double sum;

	public static double m(double i) {

		if (i == 1) {
			return 1 + sum;

		} else {
			sum += 1 / i;
			i--;
			return m(i);
		}
	}

	public static void main(String[] args) {
		
		
			 System.out.println(m(10));
		


	}
}
