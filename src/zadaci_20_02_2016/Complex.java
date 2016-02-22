package zadaci_20_02_2016;

public class Complex implements Cloneable {
	// real part
	private final double a;
	// imaginary part
	private final double b;

	// constructors
	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	public Complex() {
		this.a = 0;
		this.b = 0;
	}

	// method for addition
	public Complex add(Complex b) {
		// invoking object
		Complex a = this;
		double addA = a.a + b.a;
		double addB = a.b + b.b;
		return new Complex(addA, addB);
	}

	// method for subtraction
	public Complex substract(Complex b) {
		Complex a = this;
		double subA = a.a - b.a;
		double subB = a.b - b.b;
		return new Complex(subA, subB);
	}

	// for multiplying
	public Complex multyply(Complex b) {
		Complex a = this;
		double mulA = (a.a * b.b) - (a.b * b.b);
		double mulB = (a.b * b.a) + (a.a * b.b);
		return new Complex(mulA, mulB);
	}

	// for dividing
	public Complex divide(Complex b) {
		Complex a = this;
		double mulA = a.a / b.a;
		double mulB = a.b / b.b;
		return new Complex(mulA, mulB);
	}

	// calculates absolute value
	public double abs() {
		return Math.sqrt((a * a) + (b * b));
	}

	// returns real part
	public double getRealPart() {
		return a;
	}

	// returns imaginary part
	public double getImaginaryPart() {
		return b;

	}

	// overrides to string method
	@Override
	public String toString() {
		if (b == 0) {
			return "" + a;
		} else {

			return "Complex [" + a + " + " + b + "i]";
		}
	}

}
