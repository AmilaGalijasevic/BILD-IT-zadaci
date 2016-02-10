package zadaci_10_02_2016;

public class Triangle extends GeometricObject {
	// default data fields
	private double side1 = 0.1;
	private double side2 = 0.1;
	private double side3 = 0.1;

	// constructors
	public Triangle() {

	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getters
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// calculates area
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// calculates perimetar
	public double getPerimetar() {
		return side1 + side2 + side3;

	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
