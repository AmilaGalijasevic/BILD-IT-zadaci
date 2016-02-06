package zadaci_05_02_2016;

public class QuadraticEquation {

	private double a;
	private double b;
	private double c;

	public QuadraticEquation() {

	}

	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	// calculates discriminant
	public double getDiscriminant() {
		return (b * b) - (4 * a * c);
	}

	// calculates root 1
	public double getRoot1() {
		// formula
		double r1 = ((-b + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
		// if discriminant is smaller than 0 return 0
		if (getDiscriminant() < 0) {
			return 0;
		} else {
			return r1;
		}
	}

	// calculates root 2
	public double getRoot2() {
		double r2 = ((-b - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a));
		if (getDiscriminant() < 0) {
			return 0;
		} else {
			return r2;
		}
	}

}
