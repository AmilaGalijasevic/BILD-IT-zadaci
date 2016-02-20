package zadaci_18_02_2016;

	public class Circle{
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

		@Override
		public String toString() {
			return "Circle [Area " + getArea() + "]";
		}

	}


