package zadaci_06_02_2016;

public class myPoint {
	double x;
	double y;

	// getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// constructors
	public myPoint() {
		this.x = 0;
		this.y = 0;
	}

	public myPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	// checks distance to a specified point
	public double distance(myPoint p) {
		return this.distance(p.getX(), p.getY());
	}

	// checks distance to another point with specified x- and y-coordinates
	public double distance(double x2, double y2) {
		return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
	}

}
