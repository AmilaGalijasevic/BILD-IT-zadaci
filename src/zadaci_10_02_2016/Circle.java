package zadaci_10_02_2016;

//class for circle to be used in the assignment with objects
public class Circle {
	double radius;

	// default radius
	Circle() {
		radius = 1;

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

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
