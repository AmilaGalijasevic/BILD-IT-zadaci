package zadaci_19_02_2016;

public class RewriteCircle {

	public static void main(String[] args) {
		// circle objects
		Circle c = new Circle(4);
		Circle cc = new Circle(8);
		// prints true or false it they're equal
		System.out.println(c.equals(cc));
	}

}

class Circle extends GeometricObject implements Comparable<GeometricObject> {
	double radius;

	// default radius
	Circle() {
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	// calculates area
	double getArea() {
		return radius * radius * Math.PI;
	}

	// getters and setters for radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (radius >= 0) {
			radius = newRadius;
		}
	}

	// checks if they are equal
	@Override
	public boolean equals(Object obj) {

		if (obj.equals(radius)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Circle [Area " + getArea() + "]";
	}

	@Override
	public int compareTo(GeometricObject o) {
		return 0;
	}

}
