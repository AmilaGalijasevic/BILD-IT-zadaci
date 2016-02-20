package zadaci_19_02_2016;

public class RewriteRectangle {

	public static void main(String[] args) {
		// rectangle objects
		Rectangle r = new Rectangle(4, 6);
		Rectangle rr = new Rectangle(4, 6);
		// prints if they are equal
		System.out.println(r.equals(rr));

	}

}

class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	// data fields
	double width = 1;
	double height = 1;

	// constructor
	Rectangle() {
	}

	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	// method for Area
	double getArea() {
		return Math.ceil(width * height);
	}

	// method for perimeter
	double getPerimetar() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// overrides the equals method
	@Override
	public boolean equals(Object obj) {
		if (obj.equals(getArea())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Rectangle o) {
		return 0;
	}

}