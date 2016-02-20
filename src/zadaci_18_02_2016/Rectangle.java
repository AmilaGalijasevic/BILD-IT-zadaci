package zadaci_18_02_2016;

public class Rectangle extends GeometricObject{

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

	// method for perimetar
	double getPerimetar() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


}
