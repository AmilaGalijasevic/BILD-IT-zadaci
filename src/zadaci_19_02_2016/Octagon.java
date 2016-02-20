package zadaci_19_02_2016;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	private double side = 5;

	public Octagon() {
	}

	public Octagon(double side) {
		super();
		this.side = side;

	}

	// getters and setters
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	// calculates area
	public double getArea() {
		return (2 + (4 / (Math.sqrt(2))) * side * side);
	}

	// calculates perimeter
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public String toString() {
		return "Octagon [ sides=" + side + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + "]";
	}

	@Override
	// for cloning
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	// compares
	public int compareTo(Octagon octagon1) {
		// if the sides of the first object are bigger
		if (side > octagon1.getSide()) {
			System.out.println("First object is bigger");
			return 1;
			// if they're equal
		} else if (side == octagon1.getSide()) {
			System.out.println("Objects are equal");
			return 0;
		} else {
			System.out.println("Second object is bigger");
			return -1;
		}

	}

}
