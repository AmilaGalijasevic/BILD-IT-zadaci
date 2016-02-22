package zadaci_20_02_2016;

public class TestRational {

	public static void main(String[] args) {
		// object
		Rational r = new Rational();
		// sets it
		r.setNumerator(4);
		r.setDenominator(8);
		// prints
		System.out.println((double) r.getR()[0] / r.getR()[1]);
		System.out.println(r.doubleValue());
	}

}
