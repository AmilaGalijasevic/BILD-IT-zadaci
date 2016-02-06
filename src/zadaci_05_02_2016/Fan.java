package zadaci_05_02_2016;

public class Fan {
	// data fields
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	int speed = SLOW;
	boolean on = false;
	double radius = 5;
	String color = "blue";

	public Fan() {

	}

	public Fan(int speed, boolean on, double radius, String color) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}

	// getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	@Override
	// returns the string with fan properties, depending if the fan is on or off
	public String toString() {
		if (on == true) {
			return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
		} else {
			return "Fan [radius=" + radius + ", color=" + color + ", The fan is off]";
		}

	}
}
