package zadaci_05_02_2016;

public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation() {

	}

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// getters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// calculates if its solvable, if it is returns true
	public boolean isSolvable() {
		if ((a * d) - (b * c) == 0) {
			return false;
		} else {
			return true;
		}
	}

	// calculates x
	public double getX() {
		return ((e * d) - (b * f)) / ((a * d) - (b * c));
	}

	// calculates y
	public double getY() {
		return ((a * f) - (e * c)) / ((a * d) - (b * c));

	}
}
